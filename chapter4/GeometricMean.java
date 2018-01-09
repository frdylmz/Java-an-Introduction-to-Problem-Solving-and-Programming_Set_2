package chapter4;

/*
	This program will compute the geometric
	means of k values.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 15.
	Last Changed: 9 May 2017.
 */

import java.util.Scanner;

public class GeometricMean {

	public static void main(String[] args){
		
		double k = 0;
		double kSum = 0;
		double root = 0;
		
		System.out.println("This program will compute the geometric"
						 + "\nmeans of k values, where k will be"
						 + "\nthe value you enter."
						 + "\nWhen done, insert a negative number.");
		
		while(k >= 0){
			Scanner keyScan = new Scanner(System.in);
			k = keyScan.nextDouble();
			
			kSum *= k;
			root++;
		}
		
		double sum = Math.pow(root, 1.0/k);
		System.out.println(sum);
	}
}
