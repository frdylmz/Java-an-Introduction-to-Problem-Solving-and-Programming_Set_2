package chapter5;

/*
	This class will test the Movie class
 	Author: Josias JJ Oberholster.
 	Chapter 5 Programming project 12.
 	Last Changed: 7 July 2017.
 */

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args){
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Scanner sc = new Scanner(System.in);
		boolean active, repeat;
		
		m1.setMovie("Marvel", "PG-13");
		m2.setMovie("DC", "PG");
		
		for(int x = 1; x <= 2; x++){
			switch(x){
				case 1:
					active = true;
					repeat = true;
					System.out.println();
					System.out.println("First movie is: " + m1.getMovieName());
					System.out.println("Movie MPAA rating is: " + m1.getMovieMPAA());
					System.out.println("\nLet's rate the first movie:");
					
					do{
						System.out.println("Rating will be from 1 to 5.");
						System.out.println("1 = Terrible");
						System.out.println("2 = Bad");
						System.out.println("3 = Ok");
						System.out.println("4 = Good");
						System.out.println("5 = Great");
						System.out.println("What would you rate the movie as?");
						int iRate = sc.nextInt();
						
						if(iRate <= 0 || iRate >= 6){
							System.out.println("Rating will be from 1 to 5.");
							System.out.println("1 = Terrible");
							System.out.println("2 = Bad");
							System.out.println("3 = Ok");
							System.out.println("4 = Good");
							System.out.println("5 = Great");
						}else{
							m1.rateMovie(iRate);
						}
						
						do{
							System.out.println("Rate again? [y / n]");
							String sRate = sc.next();
							
							if(sRate.equalsIgnoreCase("y")){
								repeat = false;
							}else if(sRate.equalsIgnoreCase("n")){
								repeat = false;
								active = false;
							}else{
								System.out.println("Invalid Option. Try again.");
								repeat = true;
							}
						}while(repeat);
					}while(active);
					break;
					
				case 2:
					active = true;
					repeat = true;
					System.out.println();
					System.out.println("Second movie is: " + m2.getMovieName());
					System.out.println("Movie MPAA rating is: " + m2.getMovieMPAA());
					System.out.println("\nLet's rate the second movie:");
					
					do{
						System.out.println("Rating will be from 1 to 5.");
						System.out.println("1 = Terrible");
						System.out.println("2 = Bad");
						System.out.println("3 = Ok");
						System.out.println("4 = Good");
						System.out.println("5 = Great");
						System.out.println("What would you rate the movie as?");
						int iRate = sc.nextInt();
						
						if(iRate <= 0 || iRate >= 6){
							System.out.println("Rating will be from 1 to 5.");
							System.out.println("1 = Terrible");
							System.out.println("2 = Bad");
							System.out.println("3 = Ok");
							System.out.println("4 = Good");
							System.out.println("5 = Great");
						}else{
							m2.rateMovie(iRate);
						}
						
						do{
							System.out.println("Rate again? [y / n]");
							String sRate = sc.next();
							
							if(sRate.equalsIgnoreCase("y")){
								repeat = false;
							}else if(sRate.equalsIgnoreCase("n")){
								repeat = false;
								active = false;
							}else{
								System.out.println("Invalid Option. Try again.");
								repeat = true;
							}
						}while(repeat);
					}while(active);
					break;
			}
		}
		
		System.out.println("Final rating for: " + m1.getMovieName());
		m1.writeRating();
		System.out.println();
		
		System.out.println("Final rating for: " + m2.getMovieName());
		m2.writeRating();
		System.out.println();
	}
}
