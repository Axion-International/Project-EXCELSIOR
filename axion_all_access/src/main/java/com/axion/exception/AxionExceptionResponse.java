package com.axion.exception;

public class AxionExceptionResponse {
	
    private String message;

    public AxionExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
