package com.Bridgelabz.userregistrationjunit;


public class UserRegistrationCommonException extends RuntimeException{
	
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public UserRegistrationCommonException(ExceptionType type, String message) {

		super(message);
		this.type = type;
		
	}
}