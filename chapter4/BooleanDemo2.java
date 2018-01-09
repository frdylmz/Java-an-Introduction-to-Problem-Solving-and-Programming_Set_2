package chapter4;

/*
	This is a simple program to demonstrate how a boolean loop
	will work.
	Author: Josias JJ Oberholster.
	Chapter 4 Self-Test Questions 20.
	Last Changed: 2 May 2017.
 */

import java.util.Scanner;

public class BooleanDemo2 {

	public static void main(String[] args){
		
		System.out.println("Enter nonnegative numbers.");
		System.out.println("Place a negative number at the end");
		System.out.println("to serve as end marker");
		
		int sum = 0;
		boolean areMore = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(areMore){
			int next = keyboard.nextInt();
			
			if(next < 0){
				break;
			}else{
				sum = sum + next;
			}
		}
		
		System.out.println("The sum of the numbers is " + sum);
	}
}
