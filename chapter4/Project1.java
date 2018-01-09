package chapter4;

/*
	This program will take a sentence and give a response for it.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 1.
	Last Changed: 11 April 2017.
*/

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args){
		
		System.out.println("This program will take a user sentence input and give a response"
				  + "depending on the sentence.");
		System.out.println("To end program, enter \"end\"");
		Scanner keyScan = new Scanner(System.in);
		String sentence = "";
		
		boolean go = true;
		
		while(go){
			if(sentence.equalsIgnoreCase("end")){
				go = false;
				System.out.println("Good bey");
			}else{
				System.out.println("\nEnter a sentence:");
				
				String newSentence = keyScan.nextLine();
				sentence = newSentence;
				
				int sLength = sentence.length();
				String sEnd = sentence.substring(sLength-1, sLength);
				
				if(sEnd.equals("?")){
					if(sLength % 2 == 0){
						System.out.println("\nYES!!!");
					}else if(sEnd.equals("?")){
						System.out.println("\nNO!!!");
					}
				}else if(sEnd.equals("!")){
					System.out.println("\nWOW!!!");
				}else{
					System.out.println("\nYou always say \"" + sentence + "\".");
				}
			}
		}
	}
}