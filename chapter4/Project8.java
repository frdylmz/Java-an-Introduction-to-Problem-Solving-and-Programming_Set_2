package chapter4;

/*
	This is a single game of guessing
	at a secret five-digit code.
	Author: Josias JJ Oberholster
	Chapter 4 Programming Project 8.
	Last Changed: 16 May 2017.
 */

import java.util.Scanner;

public class Project8 {

	public static void main(String[] args){
		
		int correct, correctSum;
		
		System.out.println("This is a single game of guessing"
					   + "\nat a secret five-digit number.\n"
					   + "\nAfter entering your guess, the program "
					   + "\nwill show the number of digits in the "
					   + "\ncorrect position, and the sum of those numbers."
					   + "\n[You have ten chances at guessing the number]\n");
		
		int rNumber1 = (int) (Math.random() * 10);
		int rNumber2 = (int) (Math.random() * 10);
		int rNumber3 = (int) (Math.random() * 10);
		int rNumber4 = (int) (Math.random() * 10);
		int rNumber5 = (int) (Math.random() * 10);
		
		String rNumber = "" + rNumber1 + rNumber2 + rNumber3 + rNumber4 + rNumber5;
		Scanner keyScan = new Scanner(System.in);
		
		for(int x = 15; x >= 0; x--){
			
			System.out.println("\nNumber of guesses left: " + x);
			System.out.print("Type your number:");
			int userGuess = keyScan.nextInt();
			String stringGuess = Integer.toString(userGuess);
			correctSum = 0;
			correct = 0;
			
			if(userGuess > 100000){
				System.out.println("Number must be a five-digit integer");
			}else if(userGuess < 9999){
				System.out.println("Number must be a five-digit integer");
			}else{
				if(rNumber.equals(stringGuess)){
					System.out.println("You did it!");
					break;
				}else{
					for(int y = 0; y <= 4; y++){
						String numberSub = rNumber.substring(y, y+1);
						String guessSub = stringGuess.substring(y, y+1);
						
						if(numberSub.equals(guessSub)){
							correct++;
							int number = Integer.parseInt(numberSub);
							correctSum += number;
						}
					}
					
					System.out.println("Total numbers correct: " + correct);
					System.out.println("Sum of correct numbers: " + correctSum);
				}
			}	
		}
	}
}
