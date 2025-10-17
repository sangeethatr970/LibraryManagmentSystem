package com.DCL.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DCL.SpringBoot.Model.LMS_Book;
import com.DCL.SpringBoot.service.LMS_Service;
import com.DCL.SpringBoot.util.ResponseStructure;

@RestController
public class LMS_Controller {

	@Autowired
	private LMS_Service lms_Service;
	
	@PostMapping("/LMS/addbook")
	public ResponseEntity<ResponseStructure<LMS_Book>> createBook(@RequestBody LMS_Book book)
	{    
		
		LMS_Book book2 = lms_Service.addbook(book);
		
		ResponseStructure<LMS_Book> responseStructure = new ResponseStructure<LMS_Book>();
		responseStructure.setStatuscode(HttpStatus.CREATED.value());
		responseStructure.setMessage("Libaray Book added succesfully");
		responseStructure.setData(book2);
		
		return new ResponseEntity<ResponseStructure<LMS_Book>>(responseStructure, HttpStatus.CREATED);
	}
	
	@GetMapping("/LMS/findbook")
	public ResponseEntity<ResponseStructure<List<LMS_Book>>> findAll()
	{
		List<LMS_Book> books = lms_Service.findAll();
		
		ResponseStructure<List<LMS_Book>> responseStructure = new ResponseStructure<List<LMS_Book>>();
		responseStructure.setStatuscode(HttpStatus.FOUND.value());
		responseStructure.setMessage("book object found successfully");
		responseStructure.setData(books);
		
		return new ResponseEntity<ResponseStructure<List<LMS_Book>>>(responseStructure, HttpStatus.FOUND);
	}
	
	@GetMapping("/LMS/id/{bookId}")
	public ResponseEntity<ResponseStructure<LMS_Book>> findById(@PathVariable int bookId)
	{
		LMS_Book book = lms_Service.findById(bookId);
		
		ResponseStructure<LMS_Book> responseStructure = new ResponseStructure<LMS_Book>();
		responseStructure.setStatuscode(HttpStatus.FOUND.value());
		responseStructure.setMessage("book object found with id:" + bookId);
		responseStructure.setData(book);
		
		return new ResponseEntity<ResponseStructure<LMS_Book>>(responseStructure, HttpStatus.FOUND);
	}
	
	@GetMapping("/LMS/title/{title}")
	public ResponseEntity<ResponseStructure<List<LMS_Book>>> findByTitle(@PathVariable String title)
	{
		List<LMS_Book> books = lms_Service.findByTitle(title);
		
		ResponseStructure<List<LMS_Book>> responseStructure = new ResponseStructure<List<LMS_Book>>();
		responseStructure.setStatuscode(HttpStatus.FOUND.value());
		responseStructure.setMessage("book object is found with title :" + title);
		responseStructure.setData(books);
		
		return new ResponseEntity<ResponseStructure<List<LMS_Book>>>(responseStructure, HttpStatus.FOUND);
		
	}
	
	@GetMapping("/LMS/category/{category}")
	public ResponseEntity<ResponseStructure<List<LMS_Book>>> findByCategory(@PathVariable String category)
	{
		List<LMS_Book> books = lms_Service.findByCategory(category);
		
		ResponseStructure<List<LMS_Book>> responseStructure = new ResponseStructure<List<LMS_Book>>();
		responseStructure.setStatuscode(HttpStatus.FOUND.value());
		responseStructure.setMessage("book objects found with category:" +category);
		responseStructure.setData(books);
		
		return new ResponseEntity<ResponseStructure<List<LMS_Book>>>(responseStructure, HttpStatus.FOUND);
	}
	
	@PutMapping("/LMS/update/{bookId}")
	public ResponseEntity<ResponseStructure<LMS_Book>> updateByid(@PathVariable int bookId,  @RequestBody LMS_Book book)
	{
		LMS_Book books = lms_Service.updateById(bookId,book);
		
		ResponseStructure<LMS_Book> responseStructure = new ResponseStructure<LMS_Book>();
		responseStructure.setStatuscode(HttpStatus.OK.value());
		responseStructure.setMessage("book object successfully updated");
		responseStructure.setData(books);
		
		return new ResponseEntity<ResponseStructure<LMS_Book>>(responseStructure, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/LMS/delete/{bookId}")
	public ResponseEntity<ResponseStructure<LMS_Book>> deleteById(@PathVariable int bookId)
	{
		LMS_Book book = lms_Service.deleteByid(bookId);
		
		ResponseStructure<LMS_Book> responseStructure = new ResponseStructure<LMS_Book>();
		responseStructure.setStatuscode(HttpStatus.ACCEPTED.value());
		responseStructure.setMessage("book object deleted successfully");
		responseStructure.setData(book);
		
		return new ResponseEntity<ResponseStructure<LMS_Book>>(responseStructure, HttpStatus.ACCEPTED);
	}
}
