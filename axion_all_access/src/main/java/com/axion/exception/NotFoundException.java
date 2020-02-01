package com.axion.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class NotFoundException extends RuntimeException{

	public NotFoundException(String exception) {
		super(exception);
	}
}
