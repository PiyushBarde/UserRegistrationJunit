package com.Bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationMethod register = new UserRegistrationMethod();
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws FirstNameException
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = register.verifyFirstName.ValidationOfUser("Piyush");
        Assert.assertTrue(isValid);
    } 
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnFalse() throws FirstNameException
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = register.verifyFirstName.ValidationOfUser("piyush");
        Assert.assertFalse(isValid);
    }
	
	//--------------------Last Name-------------------------//
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws LastNameException
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = register.verifyLastName.ValidationOfUser("Barde");
        Assert.assertTrue(isValid);
    } 
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnFalse() throws LastNameException
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = register.verifyLastName.ValidationOfUser("barde");
        Assert.assertFalse(isValid);
    } 
	//-----------------------Email---------------------------//
	
		@Test
		public void givenEmail_WhenProper_ShouldReturnTrue() throws EmailException{
	        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
	        boolean isValid = register.verifyMail.ValidationOfUser("abc.100@yahoo.com");
	        Assert.assertTrue(isValid);
	    } 
		
		@Test
		public void givenEmail_WhenProper_ShouldReturnFalse() throws EmailException
	    {
	        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
	        boolean isValid = register.verifyMail.ValidationOfUser("abc@.com.com");
	        Assert.assertFalse(isValid);
	    } 
		
		//-----------------------PhoneNumber---------------------------//
		
		/*	@Test
			public void givenPhoneNumber_WhenProper_ShouldReturnTrue()
		    {
		        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
		        boolean isValid = userRegistrationMethod.verificationForNumber("91 8446727790");
		        Assert.assertTrue(isValid);
		    }  */
			
		/*	@Test
			public void givenPhoneNumber_WhenProper_ShouldReturnFalse()
		    {
		        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
		        boolean isValid = userRegistrationMethod.verificationForNumber("123");
		        Assert.assertFalse(isValid);
		    }  */
			
			//-----------------------Password---------------------------//
			
			@Test
			public void givenPassword_WhenProper_ShouldReturnTrue() throws PasswordException
		    {
		        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
		        boolean isValid = register.verifyPassword.ValidationOfUser("abC123@xyz");
		        Assert.assertTrue(isValid);
		    } 
			
			@Test
			public void givenPassword_WhenProper_ShouldReturnFalse() throws PasswordException
		    {
		        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
		        boolean isValid = register.verifyPassword.ValidationOfUser("abCD2eghij");
		        Assert.assertFalse(isValid);
		    } 
			
}
