package chapter4;

/*
	This program will ask the user to enter a
	number, then display a triangle depending on
	the user integer.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 13.
	Last Changed: 23 May 2017.
 */

import java.util.Scanner;

public class Project13 {

	public static void main(String[] args){
		
		Scanner  keyScan = new Scanner(System.in);
		int z = 0;
		
		System.out.println("This program will ask the user to enter a"
					   + "\nnumber, then display a triangle depending on"
					   + "\nthe user integer");
		System.out.println("\nEnter any integer from 1 to 50");
		int triangle = keyScan.nextInt();
		System.out.println("");
		
		for(int x = 1; x <= triangle; x++){
			
			for(int y = 1; y <= x; y++){
				System.out.print("*");
				z = y;
			
			}
			System.out.print("\n");
		}
		
		for(;z >= 1; z--){
			
			for(int y = z - 1; y >= 1; y--){
				System.out.print("*");
			
			}
			System.out.print("\n");
		}
	}
}
