package chapter4;

/*
	This is a simple program to
	display each month of a year.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 12.
	Last Changed: 7 mMay 2017.
 */

public class DisplayMonths {

	enum Months{
		January, February, March, April, May, June, July, 
		August, September, October, November, December
	};
	
	public static void main(String[] args){
		
		for(Months nextMonth: Months.values()){
			System.out.println(nextMonth);
		}	
	}
}
