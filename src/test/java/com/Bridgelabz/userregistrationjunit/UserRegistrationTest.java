package com.Bridgelabz.userregistrationjunit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = userRegistrationMethod.verificationFirstName("Piyush");
        Assert.assertTrue(isValid);
    } 
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnFalse()
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = userRegistrationMethod.verificationFirstName("piyush");
        Assert.assertFalse(isValid);
    }
	
	//--------------------Last Name-------------------------//
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = userRegistrationMethod.verificationFirstName("Barde");
        Assert.assertTrue(isValid);
    } 
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnFalse()
    {
        UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
        boolean isValid = userRegistrationMethod.verificationFirstName("barde");
        Assert.assertFalse(isValid);
    } 
}
