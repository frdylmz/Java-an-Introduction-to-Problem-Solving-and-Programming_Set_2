package chapter5;

/*
	This class will test the DogCompare class.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 11.
	Last Changed: 7 July 2017.
*/

import java.util.Scanner;

public class DogCompareTest {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		DogCompare dc1 = new DogCompare();
		DogCompare dc2 = new DogCompare();
		
		System.out.println("Let's create the first dog.");
		System.out.println("What is the dogs' name?");
		String d1Name = sc.next();
		System.out.println("What is the dogs' breed?");
		String d1Breed = sc.next();
		System.out.println("What is the dogs' age?");
		int d1Age = sc.nextInt();
		System.out.println();
		dc1.WriteOutput(d1Name, d1Breed, d1Age);
		
		System.out.println("Let's create the second dog.");
		System.out.println("What is the dogs' name?");
		String d2Name = sc.next();
		System.out.println("What is the dogs' breed?");
		String d2Breed = sc.next();
		System.out.println("What is the dogs' age?");
		int d2Age = sc.nextInt();
		System.out.println();
		dc2.WriteOutput(d2Name, d2Breed, d2Age);
		
		dc1.Compare(d1Name, d1Breed, d1Age, d2Name, d2Breed, d2Age);
	}
}
