package com.example.demo.controller.exception;

public class UserNotFoundException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4563364728717702901L;

	
	private String message;


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public UserNotFoundException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String toString() {
		return "UserNotFoundException [message=" + message + "]";
	}

}
