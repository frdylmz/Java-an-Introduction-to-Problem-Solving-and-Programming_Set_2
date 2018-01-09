package chapter4;

/*
	This program will read 8 user inputs
	of a coin toss, and display the 
	percentage of each collective toss.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 10.
	Last Changed: 7 April 2017. 
 */

import java.util.Scanner;

public class CoinToss {
	
	public static void main(String[] args){
		
		double heads = 0, tails = 0, headsPerc, tailsPerc;
		
		System.out.println("This program will read 8 user inputs"
					 	 + "\nof a coin toss, and display the "
						 + "\npercentage of each collective toss.");
		System.out.println("\n For each coin toss enter either "
						 + "h for heads or t for tails.");
		
		Scanner keyScan = new Scanner(System.in);
		System.out.println("");
		
		for(int n = 1; n <= 8; n++){
			switch(n){
				case 1:
					System.out.print("First toss: ");
					break;
				case 2:
					System.out.print("Second toss: ");
					break;
				case 3:
					System.out.print("Third toss: ");
					break;
				case 4:
					System.out.print("Fourth toss: ");
					break;
				case 5:
					System.out.print("Fifth toss: ");
					break;
				case 6:
					System.out.print("Sixth toss: ");
					break;
				case 7:
					System.out.print("Seventh toss: ");
					break;
				case 8:
					System.out.print("Eighth toss: ");
					break;
			}
			String toss = keyScan.nextLine();
			
			if(toss.equalsIgnoreCase("h")){
				heads++;
			}else{
				tails++;
			}
		}
		
		headsPerc = (heads / 8) * 100;
		tailsPerc = (tails / 8) * 100;
		
		System.out.println("Percent heads: " + headsPerc);
		System.out.println("Percent tails: " + tailsPerc);
	}
}
