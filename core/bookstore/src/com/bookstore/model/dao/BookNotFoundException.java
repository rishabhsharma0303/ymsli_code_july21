package com.bookstore.model.dao;

public class BookNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1415540000411332257L;

	public BookNotFoundException(String message) {
		super(message);
	}
}
