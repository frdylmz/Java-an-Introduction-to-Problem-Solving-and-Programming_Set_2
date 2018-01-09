package chapter5;

/*
	This program demonstrates how to use the
	Dog class.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.2.
	Last Changed: 29 May 2017.
 */

public class DogDemo {

	public static void main(String[] args){
		
		Dog balto = new Dog();
		
		balto.name = "Balto";
		balto.age = 8;
		balto.breed = "Siberian Husky";
		balto.writeOutput();
		
		Dog scooby = new Dog();
		
		scooby.name = "Scooby";
		scooby.age = 42;
		scooby.breed = "Great Dane";
		scooby.writeOutput();
		
		System.out.println(scooby.name + " is a " + scooby.breed + ".");
		System.out.print("He is " + scooby.age + " years old, or ");
		int humanYears = scooby.getAgeInHumanYears();
		System.out.println(humanYears + " in human years.");
	}
}
