package com.axion.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class AxionException extends RuntimeException{
	
	
	public AxionException() {
		super();
	}
	
	public AxionException(final String message) {
		super(message);
	}

}
