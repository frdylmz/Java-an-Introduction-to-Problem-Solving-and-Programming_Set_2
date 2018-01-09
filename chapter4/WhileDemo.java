package chapter4;

/*
	This program is simply made to show a while loop.
	Author: Josias JJ Oberholster.
	Chapter 4 Listing 4.1.
	last Changed: 25 April 2017.
 */

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args){
		
		int count, number;
		
		System.out.println("Enter a number");
		Scanner keyboard = new Scanner(System.in);
		number = keyboard.nextInt();
		
		count = 1;
		System.out.println();
		while(count <= number){
			
			if(count == number){
				System.out.println(count);
				break;
			}else{
				System.out.println(count + ", ");
				count++;
			}
		}
		
		System.out.println();
		System.out.println("Buckle my shoe.");
	}
}
