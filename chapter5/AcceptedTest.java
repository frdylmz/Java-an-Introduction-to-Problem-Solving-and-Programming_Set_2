package chapter5;

/*
	This program will test the Accepted class.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 5.
	Last Changed: 11 June 2017.
 */

import java.util.Scanner;

public class AcceptedTest {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		Accepted acp = new Accepted();
		acp.SetLowest(0);
		acp.setHighest(100);
		
		do{
			System.out.println("The lowest amount is: " + acp.lowest);
			System.out.println("The highest amount is: " + acp.highest);
			System.out.println("\nHow much will you give?");
			int amount = keyScan.nextInt();
			acp.given = amount;
			
			acp.getValue();
		}while(acp.run);
	}
}
