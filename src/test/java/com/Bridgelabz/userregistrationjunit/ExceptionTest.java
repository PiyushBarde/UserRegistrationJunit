package com.Bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {
	@Test
	public void givenFirstName_IsNull_ShouldThrowNullException() throws UserRegistrationCommonException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyFirstName.ValidationOfUser(null);
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowEmptyException() throws UserRegistrationCommonException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyFirstName.ValidationOfUser("");
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenLastName_IsNull_ShouldThrowNullException() throws UserRegistrationCommonException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyLastName.ValidationOfUser(null);
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldThrowEmptyException1() throws UserRegistrationCommonException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyLastName.ValidationOfUser("");
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenEmail_IsNull_ShouldThrowNullException() throws UserRegistrationCommonException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyMail.ValidationOfUser(null);
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldThrowEmptyException() throws UserRegistrationCommonException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyMail.ValidationOfUser("");
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	@Test
	public void givenPassword_IsNull_ShouldThrowNullException() throws UserRegistrationCommonException {
		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyPassword.ValidationOfUser(null);
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	@Test
	public void givenPassword_WhenEmpty_ShouldThrowEmptyException() throws UserRegistrationCommonException{

		UserRegistrationMethod register = new UserRegistrationMethod();
		try {
			register.verifyPassword.ValidationOfUser("");
		} catch (UserRegistrationCommonException e) {
			Assert.assertEquals(UserRegistrationCommonException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}

}
