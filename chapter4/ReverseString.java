package chapter4;

/*
	This program will take a string,
	and reverse it's order.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 9.
	Last Changed: 7 May 2017.
 */

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args){
		
		System.out.println("This program will take a string,"
						  +"\nand reverse it's order.");
		System.out.println("Enter string");
		
		Scanner keyScan = new Scanner(System.in);
		String userString = keyScan.nextLine();
		int userLength = userString.length();
		int userTotal = userLength;
		String newStringChar;		
		
		for(int n = userLength; n >= 0; n--){
			if(n == userTotal){
				newStringChar = userString.substring(n);
			}else{
				newStringChar = userString.substring(n, n+ 1);
			}
			
			System.out.print(newStringChar);
		}
	}
}
