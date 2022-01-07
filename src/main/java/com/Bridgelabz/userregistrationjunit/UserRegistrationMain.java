package com.Bridgelabz.userregistrationjunit;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) throws FirstNameException, LastNameException, EmailException {
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first name = ");
    String nameFirst = sc.next();
    System.out.println("Enter your last name = ");
    String nameLast = sc.next();
    System.out.println("Enter your email = ");
    String emailAddress = sc.next();
    System.out.println("Enter your phone number = ");
    String phoneNumber = sc.next();
    System.out.println("Create password = ");
    String passWord = sc.next();
    
    //------------------------details uploaded-----------------//
    
    UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
    
    userRegistrationDetails.setFirstName(nameFirst);
    userRegistrationDetails.setLastName(nameLast);
    userRegistrationDetails.setEmail(emailAddress);
    userRegistrationDetails.setNumber(phoneNumber);
    userRegistrationDetails.setPassword(passWord);

    //-----------------------methods called--------------------//
    
    UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
    
    userRegistrationMethod.finalArgument(userRegistrationMethod.verificationFirstName(userRegistrationDetails.getFirstName()),
            userRegistrationMethod.verificationLastName(userRegistrationDetails.getLastName()),
            userRegistrationMethod.verificationEmail(userRegistrationDetails.getEmail()),
            userRegistrationMethod.verificationEmail(userRegistrationDetails.getPassword()),
            userRegistrationDetails);
    
	}
}
