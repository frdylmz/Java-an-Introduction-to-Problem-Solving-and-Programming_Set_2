package chapter4;

/*
	This program will sum the amount of
	hand-shakes that will be given.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 11.
	Last Changed: 7 May 2017.
 */

import java.util.Scanner;

public class HandShake {

	public static void main(String[] args){
		
		System.out.println("This program will sum the amount of"
						 + "\nhand-shakes that will be given, as"
						 + "they arrive.");
		System.out.println("\nEnter amount of guests");
		
		Scanner keyScan = new Scanner(System.in);
		int guests = keyScan.nextInt();
		int handShakes = 0;
		
		for(int n = 1; n <= guests; n++){
			handShakes += n;
		}
		
		System.out.println("Total amount of hand shakes: " + handShakes);
	}
}
