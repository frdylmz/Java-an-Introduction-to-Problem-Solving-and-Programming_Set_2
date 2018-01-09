package chapter4;

/*
	This program will continuously take Strings until the
	word "done" appears. When done, the program will then 
	check to see it the character is equal to the last 
	character.
	Author Josias JJ Oberholster
	Chapter 4 Exercise 1
	Last Changed: 7 May 2017.
*/

import java.util.Scanner;

public class CheckWordsDoWhile {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		boolean notDone = true;
		
		System.out.println("This program will continuously take Strings until the"
				 + "\nword \"done\" appears. When done, the program will then "
				 + "\ncheck to see it the character is equal to the last "
				 + "\ncharacter.");
		
		do{
			System.out.println("");
			String word = keyScan.nextLine();
			String checkFirst = word.substring(0, 1);
			String checkLast = word.substring(word.length() - 1);
			
			if(word.equalsIgnoreCase("done")){
				notDone = false;
			}else if(checkFirst.equalsIgnoreCase(checkLast)){
				System.out.println(word + " does match");
			}else{
				System.out.println(word + " does not match");
			}
			
		}while(notDone);
	}
}
		