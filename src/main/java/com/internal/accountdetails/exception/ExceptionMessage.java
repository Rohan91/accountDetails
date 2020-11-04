package com.internal.accountdetails.exception;

import java.time.LocalDate;

public class ExceptionMessage {

	private String message;
	
	private LocalDate date;
	
	public String getMessage() {
		return message;
	}
	
	public LocalDate getDate() {
		return date;
	}

	public ExceptionMessage(String message, LocalDate date) {
		this.message = message;
		this.date = date;
	}
	
}
