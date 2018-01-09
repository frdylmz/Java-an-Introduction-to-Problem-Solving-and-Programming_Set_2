package chapter5;

/*
	This class is used to test the Hangman class.
	Author: Josias JJ Oberholster.
	Help supplied: by https://forums.d2jsp.org/topic.php?t=66876753&f=124
	Chapter 5 Programming Project 8.
	Last Changed: 5 July 2017.
 */

public class HangmanTest {
	
	public static void main(String[] args){
		
		Hangman game = new Hangman();
	    game.initialize("happiness");
	    System.out.println("Lets play a round of hangman.");
	    game.playGame();
	}
}
