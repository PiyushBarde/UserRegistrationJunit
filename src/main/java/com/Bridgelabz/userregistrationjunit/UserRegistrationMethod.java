package com.Bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.Bridgelabz.userregistrationjunit.EmailException.ExceptionType2;
import com.Bridgelabz.userregistrationjunit.FirstNameException.ExceptionType;
import com.Bridgelabz.userregistrationjunit.LastNameException.ExceptionType1;
import com.Bridgelabz.userregistrationjunit.PasswordException.ExceptionType4;

public class UserRegistrationMethod {
	private static final String FIRST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String LAST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String EMAIL_REGEX= "^([abc][\\\\.]?[0-9+-]*)+@[a-z0-1]+[\\.][a-z\\\\.]{2,8}$";
    private static final String PASSWORD_REGEX= "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
    static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid,isPasswordValid,isMoodValid;
	
  
	public boolean verificationFirstName(String firstName) throws FirstNameException {
		try {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid...Please enter proper first name");
		}
		if(firstName.length() == 0) {
			throw new FirstNameException(ExceptionType.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new FirstNameException(ExceptionType.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isFirstNameValid;
	}
	
	/*	public boolean verificationFirstName(String dataToBeValidated){
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        Matcher matcher = pattern.matcher(dataToBeValidated);
        boolean invalid = matcher.matches();
        if(invalid==false)
        {
            System.err.println("Invalid first Name");
            return false;
        }
        else {
            return true;
        }
    }*/
	
	/*public boolean verificationLastName(String dataToBeValidated)
    {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        Matcher matcher = pattern.matcher(dataToBeValidated);
        boolean invalid = matcher.matches();
        if(invalid==false)
        {
            System.err.println("Invalid last Name");
            return false;
        }
        else 
        {
            return true;
        }
    }*/
	public boolean verificationLastName(String lastName)throws LastNameException{
		try {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid...Please enter proper last name");
		}
		if(lastName.length() == 0) {
			throw new LastNameException(ExceptionType1.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new LastNameException(ExceptionType1.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isLastNameValid;
	}
	
	
	/* public boolean verificationEmail(String dataToBeVerified)
	    {
	        Pattern pattern = Pattern.compile(EMAIL_REGEX);
	        Matcher matcher = pattern.matcher(dataToBeVerified);
	        boolean invalid = matcher.matches();
	        if(invalid==false)
	        {
	            System.err.println("Invalid Email");
	            return false;
	        }
	        else
	        {
	            return true;
	        }
	    } */
	public boolean verificationEmail(String mail) throws EmailException {
		try {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid...Please enter e-mail");
		}
		if(mail.length() == 0) {
			throw new EmailException(ExceptionType2.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new EmailException(ExceptionType2.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isMailValid;
	}
	 
	/* public boolean verificationForNumber(String dataToBeVerified){
	        if(dataToBeVerified.length()<13) {
	            System.err.println("Invalid Number");
	            return false;
	        }
	        else 
	        {
	            Pattern pattern = Pattern.compile("^[0-9]{1,}[\\s0-9]{0,10}");
	            Matcher matcher = pattern.matcher(dataToBeVerified);
	            boolean invalid = matcher.matches();
	            System.out.println(invalid);
	            return invalid;
	        }

	    } */
	 
	/* public boolean passwordVerification(String dataToBeVerified)
	    {
	        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
	        Matcher matcher = pattern.matcher(dataToBeVerified);
	        boolean invalid = matcher.matches();
	        if(invalid==false)
	        {
	            System.err.println("Invalid Password");
	            return false;
	        }
	        else 
	        {
	            return true;
	        }
	    } */
	public boolean passwordVerification(String password) throws PasswordException {
		try {
		isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
		if(!isPasswordValid) {
			System.out.println("Password is invalid...Please enter proper password");
		}
		if(password.length() == 0) {
			throw new PasswordException(ExceptionType4.ENTERED_EMPTY, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new PasswordException(ExceptionType4.ENTERED_NULL, "Enter Proper Message. NULL Not Allowed");
		}
		return isPasswordValid;
	}
	
	 
	public void finalArgument(boolean firstName,boolean lastName,boolean email,boolean password,UserRegistrationDetails userRegistrationDetails)
    {
        if(firstName==true && lastName==true && email==true && password==true)
        {
            System.out.println("Details are correct...Welcome!! " + userRegistrationDetails.getFirstName() + " " + userRegistrationDetails.getLastName());
        }
    }

}
