package chapter5;

/*
	This program will test the Person class.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Exercise 4
	Last Changed: 27 June 2017.
 */

public class PersonTest {

	public static void main(String[] args){
		
		Person p = new Person();
		
		System.out.println("Test One:");
		p.setPersonOne("Person One", 27);
		p.setPersonTwo("Person Two", 71);
		p.writePerson();
		p.check();
		
		System.out.println("\nTest Two:");
		p.setPersonOne("Person One", 71);
		p.setPersonTwo("Person One", 27);
		p.writePerson();
		p.check();
		
		System.out.println("\nTest Two:");
		p.setPersonOne("Person One", 27);
		p.setPersonTwo("Person Two", 27);
		p.writePerson();
		p.check();
	}
}
