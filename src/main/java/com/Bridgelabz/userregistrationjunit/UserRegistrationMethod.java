package com.Bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.Bridgelabz.userregistrationjunit.UserRegistrationCommonException.ExceptionType;

public class UserRegistrationMethod {
	private static final String FIRST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String LAST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String EMAIL_REGEX= "^([abc][\\\\.]?[0-9+-]*)+@[a-z0-1]+[\\.][a-z\\\\.]{2,8}$";
    private static final String PASSWORD_REGEX= "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
    static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid,isPasswordValid,isMoodValid;
	
    @FunctionalInterface
    public interface ValidationOfUser{
    	public boolean ValidationOfUser(String dataTobeVerified) throws UserRegistrationCommonException;
    }
    
    	ValidationOfUser verifyFirstName = firstName ->  {
		try{
			Pattern.matches(FIRST_NAME_REGEX, firstName);
			if(!isFirstNameValid) {
				System.out.println("First Name is invalid...Please enter proper first name");
			}
			if(firstName.length() == 0) {
				throw new UserRegistrationCommonException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

			}
			}
			catch (NullPointerException e) {
				throw new UserRegistrationCommonException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
			}
			return isFirstNameValid;	
			};
	


		ValidationOfUser verifyLastName = lastName ->  {
		try {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid...Please enter proper last name");
		}
		if(lastName.length() == 0) {
			throw new UserRegistrationCommonException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationCommonException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isLastNameValid;
	};
	
	

		ValidationOfUser verifyMail = mail ->  {
		try {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid...Please enter e-mail");
		}
		if(mail.length() == 0) {
			throw new UserRegistrationCommonException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationCommonException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isMailValid;
	};
	 

		ValidationOfUser verifyPassword = password ->  { 
		try {
		isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
		if(!isPasswordValid) {
			System.out.println("Password is invalid...Please enter proper password");
		}
		if(password.length() == 0) {
			throw new UserRegistrationCommonException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new UserRegistrationCommonException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isPasswordValid;
		};
	 
	public void finalArgument(boolean firstName,boolean lastName,boolean email,boolean password,UserRegistrationDetails userRegistrationDetails)
    {
        if(firstName==true && lastName==true && email==true && password==true)
        {
            System.out.println("Details are correct...Welcome!! " + userRegistrationDetails.getFirstName() + " " + userRegistrationDetails.getLastName());
        }
    }

}
