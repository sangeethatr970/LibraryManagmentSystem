package com.DCL.SpringBoot.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DCL.SpringBoot.Model.LMS_Book;

public interface LMS_Respository extends JpaRepository<LMS_Book, Integer> {
 
	
	//findBy--book
	List<LMS_Book> findByTitle(String title);
	List<LMS_Book> findByCategory(String category);
	
}
