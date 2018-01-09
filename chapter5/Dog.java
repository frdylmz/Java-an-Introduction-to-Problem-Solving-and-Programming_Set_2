package chapter5;

/*
	This is a simple program to demonstrate how 
	methods work.
	Author:  Josias JJ Oberholster.
	Chapter 5 Listing 5.1.
	Last Changed: 29 May 2017.
 */

public class Dog {
	
	public String name;
	public String breed;
	public int age;
	
	public void writeOutput(){
		
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age in calendat years: " + age);
		System.out.println("Age in human years: " + getAgeInHumanYears());
		System.out.println();
	}
	
	public int getAgeInHumanYears(){
		
		int humanAge = 0;
		
		if(age <= 2){
			humanAge = age *11;
		}else{
			humanAge  = 22 + ((age - 2) * 5);
		}
		
		return humanAge;
	}
}
