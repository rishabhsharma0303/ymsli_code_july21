package com.bookstore.model.dao;
import java.util.List;

import com.bookstore.model.dao.exceptions.DataAccessException;
public interface BookDao {
	public List<Book> getAllBooks() throws DataAccessException ;
	public void addBook(Book book);
	public void deleteBook(int bookId);
	public Book getBookById(int bookId);
	public void updateBook(int bookId, Book book);
}
