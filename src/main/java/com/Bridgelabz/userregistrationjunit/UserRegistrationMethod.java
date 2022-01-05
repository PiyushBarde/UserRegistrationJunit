package com.Bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethod {
	private static final String FIRST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String LAST_NAME_REGEX= "^[A-Z][a-z A-Z]{2,}";
    private static final String EMAIL_REGEX= "^[abc]+[.xyz]{0,4}+@[+bl.co.]+[a-z]{0,3}";
    private static final String PASSWORD_REGEX= "(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";
	public boolean verificationFirstName(String dataToBeValidated)
    {
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
    }
	
	public boolean verificationLastName(String dataToBeValidated)
    {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        Matcher matcher = pattern.matcher(dataToBeValidated);
        boolean invalid = matcher.matches();
        if(invalid==false)
        {
            System.err.println("Invalid last Name");
            return false;
        }
        else {
            return true;
        }
    }
	
	 public boolean verificationEmail(String dataToBeVerified)
	    {
	        Pattern pattern = Pattern.compile(EMAIL_REGEX);
	        Matcher matcher = pattern.matcher(dataToBeVerified);
	        boolean invalid = matcher.matches();
	        if(invalid==false)
	        {
	            System.err.println("Invalid Email");
	            return false;
	        }
	        else {
	            return true;
	        }
	    }
	 
	 public boolean verificationForNumber(String dataToBeVerified){
	        if(dataToBeVerified.length()<13) {
	            System.err.println("Invalid Number");
	            return false;
	        }
	        else {
	            Pattern pattern = Pattern.compile("^[0-9]{1,}[\\s0-9]{0,10}");
	            Matcher matcher = pattern.matcher(dataToBeVerified);
	            boolean invalid = matcher.matches();
	            System.out.println(invalid);
	            return invalid;
	        }

	    }
	 
	 public boolean passwordVerification(String dataToBeVerified)
	    {
	        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
	        Matcher matcher = pattern.matcher(dataToBeVerified);
	        boolean invalid = matcher.matches();
	        if(invalid==false)
	        {
	            System.err.println("Invalid Password");
	            return false;
	        }
	        else {
	            return true;
	        }
	    }
	 
	public void finalArgument(boolean firstName,boolean lastName,boolean email,UserRegistrationDetails userRegistrationDetails)
    {
        if(firstName==true && lastName==true && email==true)
        {
            System.out.println("Details are correct...Welcome!! " + userRegistrationDetails.getFirstName() + " " + userRegistrationDetails.getLastName());
        }
    }

}
