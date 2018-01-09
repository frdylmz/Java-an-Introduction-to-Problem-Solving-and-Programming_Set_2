package chapter5;

/*
	This class will compare two dogs and check if they are the same.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 11.
	Last Changed: 7 July 2017.	
 */

public class DogCompare {

	private String name, breed;
	private int age;
	private boolean nShare, bShare, aShare;
	
	/*String input required for dog name, dog breed,
	 *and integer input required for dog age.
	 *Will create dog with set input.*/
	public void WriteOutput(String dogName, String dogBreed, int dogAge){
		name = dogName;
		breed = dogBreed;
		age = dogAge;
		
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age: " + age);
		System.out.println();
	}
	
	
	/*No input required.
	 *Return dogs' name.*/
	public String getName(){
		return name;
	}
	
	/*No input required.
	 *Return dogs' breed.*/
	public String getBreed(){
		return breed;
	}
	
	/*No input required.
	 *Return dogs' age.*/
	public int getAge(){
		return age;
	}
	
	/*Input will require multiple String and integers to compare two dogs.
	 *Will return if name, breed, age and entire dog is same.*/
	public void Compare(String fName, String fBreed, int fAge, String sName, String sBreed, int sAge){
		System.out.println();
		if(fName.equalsIgnoreCase(sName)){
			System.out.println("Both dogs share the same name.");
			nShare = true;
		}else{
			System.out.println("Dogs do not share the same name.");
			nShare = false;
		}
		
		System.out.println();
		if(fBreed.equalsIgnoreCase(sBreed)){
			System.out.println("Both dogs share the same breed.");
			bShare = true;
		}else{
			System.out.println("Dogs do not share the same name.");
			bShare = false;
		}
		
		System.out.println();
		if(fAge == sAge){
			System.out.println("Both dogs share the same age.");
			aShare = true;
		}else{
			System.out.println("Dogs do not share the same age.");
			aShare = false;
		}
		
		System.out.println();
		if(nShare && bShare && aShare){
			System.out.println("Are you comparing the same dog?");
		}else{
			System.out.println("These dogs do not share everything.");
		}
	}
}