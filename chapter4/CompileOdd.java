package chapter4;

/*
	This program will compile the sum of
	n odd numbers (start with 1, the 3, 
	and so on).
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 4.
	Last Changed: 7 May 2017.
 */

import java.util.Scanner;

public class CompileOdd {

	public static void main(String[] args){
		
		System.out.println("This program will compile the sum of"
						 + "\nn odd numbers (start with 1, the 3, "
					 	 + "\nand so on).");
		
		System.out.println("\nEnter the amount of odds to be added");
		
		Scanner keyScan = new Scanner(System.in);
		int user = keyScan.nextInt();
		int n = user * 2;
		int userNum = user;
		int sum = 0;
		
		for(;0 <= n; n--){
			if(n % 2 != 0){
				sum += n;
			}
		}
		
		System.out.println("The sum of " + userNum + " odd number(s), is: "
						 + "\n" + sum);
	}
}
