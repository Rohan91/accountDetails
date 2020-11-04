package com.internal.accountdetails.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NoUserFoundException.class)
	public final ResponseEntity<Object> userNotFound(Exception ex, WebRequest request) throws Exception {
		return new ResponseEntity<Object>(new ExceptionMessage(ex.getMessage(), LocalDate.now()), HttpStatus.NOT_FOUND);
	}
}
