package com.bookstore.model.service;

import java.sql.SQLException;
import java.util.List;

import com.bookstore.model.dao.Book;
import com.bookstore.model.dao.exceptions.DataAccessException;
//some extra logic must be there in service layer
public interface BookService {
	public List<Book> getAllBooks() throws DataAccessException ;
	public void addBook(Book book);
	public void deleteBook(int bookId);
	public Book getBookById(int bookId);
	public void updateBook(int bookId, Book book);
}
