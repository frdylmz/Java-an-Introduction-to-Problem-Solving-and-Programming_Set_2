package chapter4;

/*
	This program will generate three 
	random numbers from a list of 10.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 15.
	Last Changed: 24 May 2017.
 */

public class Project15 {

	public static void main(String[] args){
		
		boolean active = true;
		int num1, num2, num3, pos1, pos2, pos3;
		
		do{
			num1 = (int)(Math.random() * 10) + 1;
			num2 = (int)(Math.random() * 10) + 1;
			num3 = (int)(Math.random() * 10) + 1;
			
			if(num1 == num2 || num1 == num3){
				num1 = (int)(Math.random() * 10) + 1;
			}else if(num2 == num3){
				num2 = (int)(Math.random() * 10) + 1;
			}else{
				active = false;
			}	
		}while(active);
		
		System.out.println("The lucky winners are:"
					   + "\nFinalist " + num1
					   + "\nFinalist " + num2
					   + "\nFinalist " + num3);
	}
}
