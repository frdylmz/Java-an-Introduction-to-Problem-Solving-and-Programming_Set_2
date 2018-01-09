package chapter4;

/*
	This program will simply check the highest and 
	lowest scores between all students.
	Author: Josias JJ Oberholster.
	Chapter 4.
	Last Changed: 2 May 2017;
 */

import java.util.Scanner;

public class MaxMinScore {

	public static void main(String[] args){
		
		System.out.println("Enter scores for all students.");
		System.out.println("Enter a negative number after");
		System.out.println("you have entered all the scores.");
		
		Scanner keyboard = new Scanner(System.in);
		
		double max = keyboard.nextDouble();
		double min = max; //The max and min so far are the first score.
		double next = keyboard.nextDouble();
		
		while(next >= 0){
			if(next > max){
				max = next;
			}else if(next < min){
				min = next;
			}
			next = keyboard.nextDouble(); // This causes the loop to ask again
		}
		
		System.out.println("The highest score is: " + max);
		System.out.println("The lowest score is: " + min);
	}
}
