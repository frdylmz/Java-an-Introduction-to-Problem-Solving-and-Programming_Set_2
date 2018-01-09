package chapter4;

/*
	This program is used to get the sum of 
	a class average.
	Author: Josias JJ Oberholster.
	Chapter 4.
	Last Changed: 2 May 2017;
 */

import java.util.Scanner;

public class ClassAverage {
	
	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("Enter each students score");
		System.out.println("When done, enter a negative number");
		
		double classScore = keyScan.nextDouble();
		double allScore = 0;
		double students = 0;
		boolean stillMore = true;
		
		
		while(stillMore){
			if(classScore < 1){
				stillMore = false;
			}else{
				allScore += classScore;
				students++;
				
				classScore = keyScan.nextDouble();
			}
		}
		
		double classAverage = allScore / students;
		System.out.println("The class average is " + classAverage);
	}
}
