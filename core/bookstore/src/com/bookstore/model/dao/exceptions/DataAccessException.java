package com.bookstore.model.dao.exceptions;

public class DataAccessException extends RuntimeException{
	private static final long serialVersionUID = 3128598072166248345L;

	public DataAccessException(Throwable cause) {
		super(cause);
	}
}
