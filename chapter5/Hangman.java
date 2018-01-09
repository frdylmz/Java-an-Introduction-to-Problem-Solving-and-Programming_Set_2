package chapter5;

/*
	This is a simple game of hangman, a secret word will be given
	and guesses will be given. After every correct guess, the word
	will appear with the rest of the unknown letters.
	Author: Josias JJ Oberholster.
	Help supplied: by https://forums.d2jsp.org/topic.php?t=66876753&f=124
	Chapter 5 Programming Project 8.
	Last Changed: 5 July 2017.
*/

import java.util.Scanner;

public class Hangman {

	private String secretWord, disguisedWord;
	private int numberOfGuesses, numberOfIncorrectGuesses;
	
	/*Input require String.
	 *Method will add the correct amount of "?" per letter of word.*/
	public void initialize(String secretWord){
		this.secretWord = secretWord;
		this.disguisedWord = "";
		for(int i = 0; i < secretWord.length(); i++){
			disguisedWord += "?";
		}
	}
	
	/*Input require a char.
	 *Incase of multiple letter, the first letter will be used.*/
	public void makeGuess(char guess){
		boolean match = false;
		
		for(int i = 0; i < secretWord.length(); i++){
			if (secretWord.charAt(i) == guess){
				StringBuilder newString = new StringBuilder(disguisedWord);
				newString.setCharAt(i, guess);
				
				disguisedWord = newString.toString();
				
				match = true;
			}
		}
		
		if(!match){
		numberOfIncorrectGuesses++;
		}
	}
	
	/*Method will search through word for "?",
	 *if non is found, then game is over and
	 *player wins.*/
	public boolean isFound(){
		if(disguisedWord.contains("?")){
			return false;
		}else{
			System.out.println("You win");
			return true;
		}
	}
	
	/*Returns secretWord*/
	public String getSecretWord(){
		return secretWord;
	}
	
	/*Return disguisedWord*/
	public String getDisguisedWord(){
		return disguisedWord;
	}
	
	/*Input will require character.
	 *Method will loop and keep doing so,
	 *untill player wins.*/
	public void playGame(){
		while (!isFound()){
			System.out.println("The disguised word is <" + disguisedWord + ">" );
			numberOfGuesses++;
			System.out.println("Guess a letter: " );
			makeGuess(new Scanner(System.in).next().charAt(0));
			
			System.out.println("Guesses made " + numberOfGuesses + " with "
								+ numberOfIncorrectGuesses + " wrong" );
		}
	}
}