package chapter4;

/*
	This program will take a word, move
	the first letter to the back of the 
	word. If it spells the same word in
	reverse, the it will continue until
	the word quit shows.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 9.
	Last Changed: 16 May 2017.
 */

import java.util.Scanner;

public class Project9 {

	public static void main(String[] args){
		
		boolean active = true;
		int score = 0;
		
		Scanner keyScan = new Scanner(System.in);
		
		System.out.println("This program will take a word, move"
					   + "\nthe first letter to the back of the"
					   + "\nword. If it spells the same word in"
					   + "\nreverse, the it will continue until"
					   + "\nthe word quit shows.");
		
		System.out.println("\nYou will get one point, per correct word."
					   + "\n[When done, type quit]");
		
		while(active){
			System.out.println("\nEnter word");
			String word = keyScan.nextLine();
			String lowWord = word.toLowerCase();
			
			if(lowWord.equalsIgnoreCase("quit")){
				break;
			}else{
				int wordLength = lowWord.length();
				
				String first = lowWord.substring(0, 1);
				String remain = lowWord.substring(1, wordLength);
				String newWord = remain + first;
				
				String reverse = new StringBuffer(newWord).reverse().toString();		
				
				if(lowWord.equals(reverse)){
					System.out.println("Great!");
					score++;
					System.out.println("Score: " + score);
				}else{
					System.out.println("Sorry");
					System.out.println("Score: " + score);
				}
			}
		}
		System.out.println("Final Score: " + score);
	}
}
