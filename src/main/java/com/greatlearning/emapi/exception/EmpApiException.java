package com.greatlearning.emapi.exception;

import org.springframework.http.HttpStatus;

public class EmpApiException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus status;
    private String message;

    public EmpApiException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public EmpApiException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
