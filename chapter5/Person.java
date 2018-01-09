package chapter5;

/*
	This class will take input to create two 
	Person, then it will run and compare the
	two Person,first it will compare if the they
	share the same name, second it will compare if 
	they share the same age, the it will display who
	is older and who is younger.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 4.
	Last Changed: 27 June 2017.
 */

public class Person {

	private String nameOne, nameTwo;
	private int ageOne, ageTwo;
	
	/*Create Person One
	 *Input String first for name, integer second for age.
	 *Method will check to see if age is non-negative.
	 *If age is non-negative, a error will occur and class will
	 *exit.*/
	public void setPersonOne(String newName, int newAge){
		
		nameOne = newName;
		if(newAge >= 0){
			ageOne = newAge;
		}else{
			System.out.println("ERROR: age is negative");
			System.exit(0);
		}
		
	}
	
	/*Create Person Two
	 *Input String first for name, integer second for age.
	 *Method will check to see if age is non-negative.
	 *If age is non-negative, a error will occur and class will
	 *exit.*/
	public void setPersonTwo(String newName, int newAge){
		
		nameTwo = newName;
		if(newAge >= 0){
			ageTwo = newAge;
		}else{
			System.out.println("ERROR: age is negative");
			System.exit(0);
		}
		
	}
	
	/*Will display each Person with their name and age.
	 *no input required, other than this method needs to be
	 *called after the setPersonOne/Two methods.*/
	public void writePerson(){
		System.out.println(nameOne + " is " + ageOne + " years old.");
		System.out.println(nameTwo + " is " + ageTwo + " years old.");
	}
	
	/*Run this method, after person one and person two was created.
	 *Will check if they share name and/or age.
	 *Will check who is older and who is younger.*/
	public void check(){
		//Check if they share a name.
		if(nameOne.equalsIgnoreCase(nameTwo)){
			System.out.println("Person One and Person two share the same name.");
		}else{
			System.out.println("Person One and Person two do not share the same name.");
		}
		
		//Check if they share the same age, if they don't 
		//it will display who is younger and who is older.
		if(ageOne == ageTwo){
			System.out.println(nameOne + " and " + nameTwo + " share the same age.");
		}else{
			System.out.println(nameOne + " and " + nameTwo + " do not share the same age.");
			if(ageOne < ageTwo){
				System.out.println(nameOne + " is younger than " + nameTwo);
				System.out.println(nameTwo + " is older than " + nameOne);
			}else{
				System.out.println(nameTwo + " is younger than " + nameOne);
				System.out.println(nameOne + " is older than " + nameTwo);
			}
		}
	}
}
