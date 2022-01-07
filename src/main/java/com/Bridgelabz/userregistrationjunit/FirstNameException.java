package com.Bridgelabz.userregistrationjunit;

public class FirstNameException extends Exception {
	enum ExceptionType {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType type;
	public FirstNameException(ExceptionType type,String message) {
		super(message);
		this.type = type;
	}
	
	
}