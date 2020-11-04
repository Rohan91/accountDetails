package com.internal.accountdetails.exception;


@SuppressWarnings("serial")
public class NoUserFoundException extends RuntimeException {

	public NoUserFoundException(String message) {
		super(message);
	}

}
