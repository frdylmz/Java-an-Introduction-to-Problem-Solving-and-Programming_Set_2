package chapter4;

/*
	This program is simply made to show a do-while loop.
	Author: Josias JJ Oberholster.
	Chapter 4 Listing 4.1.
	last Changed: 25 April 2017.
 */

import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[] args){
		
		int count, number;
		
		System.out.println("Enter a number");
		Scanner keyboard = new Scanner(System.in);
		
		number = keyboard.nextInt();
		count = 1;
		System.out.println();
		
		do{
			if(count == number){
				System.out.println(count);
				break;
			}else{
				System.out.println(count + ", ");
				count++;
			}
		}while(count <= number);

		System.out.println();
		System.out.println("Buckle my shoe.");
	}
}
