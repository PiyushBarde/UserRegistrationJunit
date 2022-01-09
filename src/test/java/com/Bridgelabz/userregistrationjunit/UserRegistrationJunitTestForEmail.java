package com.Bridgelabz.userregistrationjunit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class UserRegistrationJunitTestForEmail {
	UserRegistrationMethod register = new UserRegistrationMethod();
	private String email2Test;
	private boolean expectedResult;
	
	public UserRegistrationJunitTestForEmail(String email, boolean expectedResult) {
		this.email2Test = email;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection Data() {
		return Arrays.asList(new Object[][] { 	{"abc@yahoo.com", true},
												{"abc-100@yahoo.com", true},
												{"abc.100@yahoo.com", true},
												{"abc111@abc.com", true},
												{"abc-100@abc.net", true},
												{"abc@1.com", true},
												{"abc.100@abc.com.au", true},
												{"abc@gmail.com.com", true},
												{"abc+100@gmail.com", true},
												{"abc", false},
												{"abc@.com.my", false},
												{"abc123@gmail.a", false},
												{"abc123@.com", false},
												{"abc123@.com.com", false},
												{"abc@abc.com ", false},
												{"abc()*@gmail.com ", false},
												{"abc..2002@gmail.com", false},
												{"abc.@gmail.com", false},
												{"abc@abc@gmail.com", false},
												{"abc@gmail.com.aa.au" , false} } );
	}	
		@Test
		public void givenEmail_WhenValid_ShowReturnTrue() throws EmailException {
			UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
			boolean result = register.verifyMail.ValidationOfUser(this.email2Test);
			Assert.assertEquals(this.expectedResult, result);
		}
	}
