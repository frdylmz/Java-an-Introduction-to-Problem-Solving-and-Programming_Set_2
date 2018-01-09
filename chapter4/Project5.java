package chapter4;

/*
 	This program will take a series of
 	Integer inputs and display the largest,
 	smallest and the average of the numbers.
 	Author: Josias JJ Oberholster.
 	Chapter 4 Programming Project 5.
 	Last Changed: 14 May 2017.
 */

import java.util.Scanner;

public class Project5 {

	public static void main(String[] args){
		
		double sumTotal = 0.0, sum = 0,  max = 0, min = 0, loop = 0;
		System.out.println("This program will take a series of"
					 	 + "\nInteger inputs and display the largest,"
					 	 + "\nsmallest and the average of the numbers.");
		
		System.out.println("\nEnter a series of non-negative numbers, one after the other."
						 + "\nWhen done, enter a negative number");
		
		Scanner keyScan = new Scanner(System.in);
		double num = keyScan.nextDouble();
		
		while(num >= 0){
			loop++;
			
			if(num > max){
				max = num;
				min = max;
			}
			if(num < min){
				min = num;
			}
			
			sum += num;
			num = keyScan.nextDouble();
		}			
		sumTotal = sum / loop;
			
		System.out.println("Maximum number: " + max
						  +"\nMinimum number: " + min
						  +"\nNumber Average: " + sumTotal);
	}
}
