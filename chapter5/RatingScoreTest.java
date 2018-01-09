package chapter5;

/*
	This class will test the RatingScore class.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 9.
	Last Changed: 13 June 2017.
 */

import java.util.Scanner;

public class RatingScoreTest {

	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		RatingScore rm = new RatingScore();
		boolean redo = true;
		
		System.out.println("What is the movie name?");
		String mn = keyScan.nextLine();
		rm.setMovieName(mn);
		
		System.out.println("Give a short description of the movie.");
		String md = keyScan.nextLine();
		rm.MovieDescription(md);
		
		rm.MaxRating();
		System.out.println("What would you rating will you give the movie?");
		int rate = keyScan.nextInt();
		do{
			if(rate > rm.maxRate){
			System.out.println("\nThe rating is higher than the max rating.");
			System.out.println("What would you rating will you give the movie?");
			rate = keyScan.nextInt();
			}else{
				rm.setRating(rate);
				redo = false;
			}
		}while(redo);
		
		rm.ReturnResult();
	}
}
