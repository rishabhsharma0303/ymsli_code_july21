package com.bookstore.controller;

import java.sql.SQLException;

import com.bookstore.model.dao.BookDao;
import com.bookstore.model.dao.BookDaoImplMongo;
import com.bookstore.model.dao.exceptions.DataAccessException;
import com.bookstore.model.service.BookService;
import com.bookstore.model.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		//rather u are pulling it ... it will push it ...
		BookDao dao=new BookDaoImplMongo();
		BookService bookService=new BookServiceImpl(dao);
	
		try {
			bookService.getAllBooks();
		}catch(DataAccessException ex) {
			ex.getCause();
		}
	}
}
