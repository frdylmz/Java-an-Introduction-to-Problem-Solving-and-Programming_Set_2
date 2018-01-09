package chapter5;

/*
	This class works as a address book, for a single 
	person. It will check to see if a entry already exists.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 8.
	Last Changed: 13 June 2017.
 */

import java.util.Scanner;

public class PersonAddress {

	private String firstName, lastName, email, tel;
	Scanner keyScan = new Scanner(System.in);
	
	/*Sets the first name*/
	private String setFirstName(String first){
		firstName = first;
		return firstName;
	}
	
	/*Sets the last name*/
	private String setLastName(String last){
		lastName = last;
		return lastName;
	}
	
	/*Sets the email*/
	private String setEmail(String mail){
		email = mail;
		return email;
	}
	
	/*Sets the telephone number*/
	private String setTel(String telNumber){
		tel = telNumber;
		return tel;
	}
	
	/*Having only string inputs, the createAddress will see if the first name
	and last name has already been used in a previous time.*/
	public void createAddress(){
		
		boolean active = true;
		
		do{
			System.out.println("What is your first name?");
			String n1 = keyScan.nextLine();
			if(n1.equalsIgnoreCase(firstName)){
				System.out.println("Name already exists, try again");
				n1 = keyScan.nextLine();
			}else{
				setFirstName(n1);
			}
			
			System.out.println("What is your last name?");
			String n2 = keyScan.nextLine();
			if(n2.equalsIgnoreCase(lastName)){
				System.out.println("Name already exists, try again");
				n2 = keyScan.nextLine();
			}else{
				setLastName(n2);
			}
			
			System.out.println("What is your email address?");
			String e = keyScan.nextLine();
			setEmail(e);
			
			System.out.println("What is your telephone number?");
			String t = keyScan.nextLine();
			setTel(t);
			
			System.out.println("\nFirst name is: " + firstName);
			System.out.println("First name is: " + lastName);
			System.out.println("The email is: " + email);
			System.out.println("The tel is: " + tel);
			
			System.out.println("Would you like to run the program again?");
			String c = keyScan.nextLine();
			if(c.equalsIgnoreCase("yes")){
				continue;
			}else{
				active = false;
			}
		}while(active);	
	}
}