package com.Bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {
	@Test
	public void givenFirstName_IsNull_ShouldThrowNullException() throws FirstNameException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verificationFirstName(null);
		} catch (FirstNameException e) {
			Assert.assertEquals(FirstNameException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowEmptyException() throws FirstNameException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verificationFirstName("");
		} catch (FirstNameException e) {
			Assert.assertEquals(FirstNameException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenLastName_IsNull_ShouldThrowNullException() throws LastNameException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verificationLastName(null);
		} catch (LastNameException e) {
			Assert.assertEquals(LastNameException.ExceptionType1.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldThrowEmptyException1() throws LastNameException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verificationLastName("");
		} catch (LastNameException e) {
			Assert.assertEquals(LastNameException.ExceptionType1.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenEmail_IsNull_ShouldThrowNullException() throws EmailException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verificationEmail(null);
		} catch (EmailException e) {
			Assert.assertEquals(EmailException.ExceptionType2.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldThrowEmptyException() throws EmailException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verificationEmail("");
		} catch (EmailException e) {
			Assert.assertEquals(EmailException.ExceptionType2.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenPassword_IsNull_ShouldThrowNullException() throws PasswordException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.passwordVerification(null);
		} catch (PasswordException e) {
			Assert.assertEquals(PasswordException.ExceptionType4.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenPassword_WhenEmpty_ShouldThrowEmptyException() throws PasswordException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.passwordVerification("");
		} catch (PasswordException e) {
			Assert.assertEquals(PasswordException.ExceptionType4.ENTERED_EMPTY, e.type);
		}
	}

}
