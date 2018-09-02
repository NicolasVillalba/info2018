package com.info2018.exceptions;

public class InvalidUserException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidUserException(String msg) {
		super(msg);
	}

}
