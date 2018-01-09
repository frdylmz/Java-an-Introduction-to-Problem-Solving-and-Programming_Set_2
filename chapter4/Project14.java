package chapter4;

/*
	This program will simulate a bounce 
	of a ball.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 14.
	Last Changed: 24 May 2017.
 */

import java.util.Scanner;

public class Project14 {

	public static void main(String[] args){
		
		double time = 0, height = 0, bounce = 1;
		boolean move = true;
		Scanner keyScan = new Scanner(System.in);		
		
		System.out.println("This program will simulate the bouce"
					   + "\nof a ball."
					   + "\nEnter the velocity of the ball that is throwned");
		int velocity = keyScan.nextInt();
		
		do{
			System.out.println("Time: " + time + " Height: " + height);
			height += velocity;
			velocity -= 32;
			
			if(height <= 0){
				System.out.println("\nBounce! " + (int) bounce + "\n");
				
				height *= -0.5;
				velocity *= -0.5;
				bounce++;
			}
			
			if(bounce == 6){
				break;
			}
			
		}while(move);
	}
}
