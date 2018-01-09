package chapter4;

/*
	This program will count the amount of
	blank characters in a given String.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 8.
	Last Changed: 7 May 2017.
 */

import java.util.Scanner;

public class CountBlank {

	public static void main(String[] args){
		
		System.out.println("This program will count the amount of"
						 + "\nblank characters in a given String.");
		System.out.println("\nEnter String to use");
		
		Scanner keyScan = new Scanner(System.in);
		String userString = keyScan.nextLine();
		int userLength = userString.length();
		int space = 0;
		
		for(int n = 0; n <= userLength; n++){
			if(n == userLength){
				String check = userString.substring(n);
			}else{
				String check = userString.substring(n, n+1);
				if(check.equals(" ")){
					space++;
				}
			}	
		}
		
		System.out.println("The sum of spaces in String is " + space);
	}	
}
