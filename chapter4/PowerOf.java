package chapter4;

/*
	This program will take a user input,
	and compute their power, then add their 
	sum together.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 6.
	Last Changed: 7 May 2017.
 */

import java.util.Scanner;

public class PowerOf {

	public static void main(String[] args){
		
		System.out.println("This program will take a user input,"
						 + "\nand compute their power, then add their "
						 + "\nsum together.");
		
		Scanner keyScan = new Scanner(System.in);
		int userNumber = keyScan.nextInt();
		int power = 0;
		int total = 0;
		
		for(int start = 1, sum = 0; start <= userNumber; start++, total = sum){
			power = start * start;
			sum += power;	
		}
		
		System.out.println("The sum is " + total);
	}
}
