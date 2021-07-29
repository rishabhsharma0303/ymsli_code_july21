package com.bookstore.model.service;

import java.sql.SQLException;
import java.util.List;

import com.bookstore.model.dao.Book;
import com.bookstore.model.dao.BookDao;
import com.bookstore.model.dao.BookDaoImplHib;
import com.bookstore.model.dao.BookDaoImplJdbc;
import com.bookstore.model.dao.BookDaoImplMongo;
import com.bookstore.model.dao.exceptions.DataAccessException;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> getAllBooks() throws DataAccessException  {
		return bookDao.getAllBooks();
	}

	@Override
	public void addBook(Book book) {
		bookDao.addBook(book);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	@Override
	public Book getBookById(int bookId) {
		return bookDao.getBookById(bookId);
	}

	@Override
	public void updateBook(int bookId, Book book) {
		bookDao.updateBook(bookId, book);
	}

}
