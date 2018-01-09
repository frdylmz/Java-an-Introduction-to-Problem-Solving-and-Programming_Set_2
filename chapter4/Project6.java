package chapter4;

/*
	This program will display the total
	number of grades and the number of
	grades in each letter-grade category.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 6.
	Last Changed: 14 May 2017.
 */

import java.util.Scanner;

public class Project6 {

	public static void main(String[] args){
		
		int grade, gradeA = 90, gradeB = 80, gradeC = 70, gradeD = 60, gradeF = 0,
			total = 0, incA = 0, incB = 0, incC = 0, incD = 0, incF = 0;
		
		System.out.println("This program will display the total"
						 + "\nnumber of grades and the number of"
						 + "\ngrades in each letter-grade category.");
		
		System.out.println("\nEnter the grades, when done, enter a non-negative number.");
		Scanner keyScan = new Scanner(System.in);
		grade = keyScan.nextInt();
		
		while(grade >= 0){
			if(grade > gradeA){
				incA++;
			}else if(grade >= gradeB){
				incB++;
			}else if(grade >= gradeC){
				incC++;
			}else if(grade >= gradeD){
				incD++;
			}else{
				incF++;
			}
			
			total++;
			grade = keyScan.nextInt();
		}
		
		System.out.println("Total number of grades = " + total);
		System.out.println("Number of A's = " + incA
					    +"\nNumber of B's = " + incB
					    +"\nNumber of C's = " + incC
					    +"\nNumber of D's = " + incD
					    +"\nNumber of f's = " + incF);
	}
}
