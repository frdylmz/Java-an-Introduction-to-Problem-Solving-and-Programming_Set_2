package chapter4;

/*
This is a single game of guessing
at a secret five-digit code.
Author: Josias JJ Oberholster
Chapter 4 Programming Project 12.
Last Changed: 23 May 2017.
*/

import javax.swing.JOptionPane;

public class Project12v2 extends JOptionPane{

	public static void main(String[] args){
		
		int correct, correctSum;
		
		int confirm = JOptionPane.showConfirmDialog(null, "This is a single game of guessing"
													      + "\nat a secret five-digit number.\n"
													      + "\nAfter entering your guess, the program "
													      + "\nwill show the number of digits in the "
													      + "\ncorrect position, and the sum of those numbers."
													      + "\n[You have fifteen chances at guessing the number]\n", 
													      "Confirm", JOptionPane.YES_NO_OPTION);
		if(confirm == YES_OPTION){
			int rNumber1 = (int) (Math.random() * 10);
			int rNumber2 = (int) (Math.random() * 10);
			int rNumber3 = (int) (Math.random() * 10);
			int rNumber4 = (int) (Math.random() * 10);
			int rNumber5 = (int) (Math.random() * 10);
			String rNumber = "" + rNumber1 + rNumber2 + rNumber3 + rNumber4 + rNumber5;
			
			for(int x = 15; x >= -1; x--){
				
				if(x == 0){
					JOptionPane.showMessageDialog(null, "You ran out of guesses."
													+ "\nThe correct code is: " + rNumber);
					System.exit(0);
				}else{
					String userGuess = JOptionPane.showInputDialog(null, "\nNumber of guesses left: " + x
							 + "\n\nType your number:", "User Guess");
					int intGuess = Integer.parseInt(userGuess);
					
					correctSum = 0;
					correct = 0;
					
					if(intGuess > 100000){
						System.out.println("Number must be a five-digit integer");
					}else if(intGuess < 9999){
						System.out.println("Number must be a five-digit integer");
					}else{
						if(rNumber.equals(userGuess)){
							System.out.println("You did it!");
							break;
					}else{
						for(int y = 0; y <= 4; y++){
							String numberSub = rNumber.substring(y, y+1);
							String guessSub = userGuess.substring(y, y+1);
					
							if(numberSub.equals(guessSub)){
								correct++;
								int number = Integer.parseInt(numberSub);
								correctSum += number;
							}
					}
					
						JOptionPane.showMessageDialog(null, "Total numbers correct: " + correct
										+ "\nSum of correct numbers: " + correctSum);
						}
					}
				}
					
			}
		}else if(confirm == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("Program closed unexpectedly");
			System.exit(0);
		}
		System.exit(0);
	}
}