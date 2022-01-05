package com.Bridgelabz.userregistrationjunit;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first name = ");
    String nameFirst = sc.next();
    
    UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
    userRegistrationDetails.setFirstName(nameFirst);
    
    UserRegistrationMethod userRegistrationMethod = new UserRegistrationMethod();
	}
}
