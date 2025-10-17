package com.DCL.SpringBoot.service;

import java.util.List;

import com.DCL.SpringBoot.Model.LMS_Book;

public interface LMS_Service {

	LMS_Book addbook(LMS_Book book);

	List<LMS_Book> findAll();

	LMS_Book findById(int bookId);

	List<LMS_Book> findByTitle(String title);

	List<LMS_Book> findByCategory(String category);

	LMS_Book updateById(int bookId,LMS_Book book);

	LMS_Book deleteByid(int bookId);

}
