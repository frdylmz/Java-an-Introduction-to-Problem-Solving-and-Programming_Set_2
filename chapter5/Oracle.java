package chapter5;

/*
	The method chat of this class conducts a dialogue 
	with the user that answers a series of one-line 
	questions that the user asks.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.15.
	Last Changes: 31 May 2017.
 */

import java.util.Scanner;

public class Oracle {

	private String oldAnswer = "The answer is in your heart.";
	private String newAnswer;
	private String question;
	
	public void chat(){
		System.out.println("I am the oracle.");
		System.out.println("I will answer any one-line question.");
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		do{
			answer();
			System.out.println("Do you wish to ask another question?");
			response = keyboard.next();
		}while(response.equalsIgnoreCase("yes"));
		System.out.println("The Oracle will now rest.");
	}
	
	private void answer(){
		System.out.println("What is your question?");
		Scanner keyboard = new Scanner(System.in);
		question = keyboard.nextLine();
		
		seekAdvice();
		
		System.out.println("You ask the question:");
		System.out.println(" " + question);
		System.out.println("Now, here is my answer");
		System.out.println(" " + oldAnswer);
		update();
	}
	
	private void seekAdvice(){
		System.out.println("Hmm, I need some help on that.");
		System.out.println("Please give me one line advice.");
		Scanner keyboard = new Scanner(System.in);
		newAnswer = keyboard.nextLine();
		System.out.println("Thank you. That helped alot.");
	}
	
	private void update(){
		oldAnswer = newAnswer;
	}
}