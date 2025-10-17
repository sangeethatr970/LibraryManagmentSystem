package com.DCL.SpringBoot.ServiceImplementaion;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCL.SpringBoot.Model.LMS_Book;
import com.DCL.SpringBoot.Respository.LMS_Respository;
import com.DCL.SpringBoot.service.LMS_Service;

@Service
public class ServiceImpl implements LMS_Service {

	@Autowired
	private LMS_Respository lms_Respository;

	@Override
	public LMS_Book addbook(LMS_Book book) {
		LMS_Book books = lms_Respository.save(book);
		return books;
	}

	@Override
	public LMS_Book findById(int bookId) {
		Optional<LMS_Book> book = lms_Respository.findById(bookId);
		if(book.isEmpty())
		{
		return null;
		}
		else
		{
			LMS_Book book2 = book.get();
			return book2;
		}
	}

	@Override
	public List<LMS_Book> findByTitle(String title) {
		List<LMS_Book> books = lms_Respository.findByTitle(title);
		
		if(books.isEmpty())
		{
			return null;

		}
		else
		{
			return books;
		}
	}

	@Override
	public List<LMS_Book> findAll() {
		List<LMS_Book> books = lms_Respository.findAll();
		if(books.isEmpty())
			return null;
		else
		{
			return books;
		}
		
	}

	@Override
	public List<LMS_Book> findByCategory(String category) {
		List<LMS_Book> books = lms_Respository.findByCategory(category);
		if(books.isEmpty())
		{
			return null;
		}
		else
		{
			return books;
		}
	}

	@Override
	public LMS_Book updateById(int bookId, LMS_Book book) {
		Optional<LMS_Book> optional = lms_Respository.findById(bookId);
		if (optional.isEmpty())
		{
			return null;
		}
		else
		{
			LMS_Book book2 = optional.get();
			book.setBookId(book2.getBookId());
			return lms_Respository.save(book);
		}
	}

	@Override
	public LMS_Book deleteByid(int bookId) {
		Optional<LMS_Book> optional = lms_Respository.findById(bookId);
		
		if(optional.isEmpty())
		{
			return null;
		}
		else
		{
			LMS_Book book = optional.get();
			lms_Respository.delete(book);
			return book;
		}
	}
	

}
