package com.bookstore.model.dao;

import java.sql.SQLException;
import java.util.*;
import java.util.List;

import com.bookstore.model.dao.exceptions.DataAccessException;
import com.bookstore.model.dao.exceptions.HibernateException;

public class BookDaoImplHib implements BookDao {

	@Override
	public List<Book> getAllBooks() throws DataAccessException {
		System.out.println("getting all books using Hib...");
		try {
			if (1 == 2) {
				throw new HibernateException();
			}
		} catch (HibernateException ex) {
			throw new DataAccessException(ex);
		}

		return null;
	}

	@Override
	public void addBook(Book book) {
		System.out.println("addBook using Hib...");
	}

	@Override
	public void deleteBook(int bookId) {
		System.out.println("getting all books using Hib...");
	}

	@Override
	public Book getBookById(int bookId) {
		if (bookId == 3)
			throw new BookNotFoundException("book is not found");

		System.out.println("getBookById using Hib...");
		return null;
	}

	@Override
	public void updateBook(int bookId, Book book) {
		System.out.println("updateBook using Hib...");
	}

}
