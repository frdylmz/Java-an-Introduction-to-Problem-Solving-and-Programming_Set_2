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

public class Project7 {

	public static void main(String[] args){
		
		double grade, gradeA = 90, gradeB = 80, gradeC = 70, gradeD = 60, gradeF = 0,
			   total = 0, incA = 0, incB = 0, incC = 0, incD = 0, incF = 0, max = 0,
			   min = 0, aSum = 0, bSum = 0, cSum = 0, dSum = 0, 
			   fSum = 0, aTotal, bTotal, cTotal, dTotal, fTotal, scoreTotal = 0, scoreAverage;
		
		System.out.println("This program will display the total"
						 + "\nnumber of grades and the number of"
						 + "\ngrades in each letter-grade category.");
		
		System.out.println("\nEnter the grades, when done, enter a non-negative number.");
		Scanner keyScan = new Scanner(System.in);
		grade = keyScan.nextInt();
		
		while(grade >= 0){
			if(grade > gradeA){
				incA++;
				aSum += grade;
			}else if(grade >= gradeB){
				incB++;
				bSum += grade;
			}else if(grade >= gradeC){
				incC++;
				cSum += grade;
			}else if(grade >= gradeD){
				incD++;
				dSum += grade;
			}else{
				incF++;
				fSum += grade;
			}
			
			if(grade > max){
				max = grade;
				min = max;
			}
			if(grade < min){
				min = grade;
			}
			
			total++;
			scoreTotal += grade;
			grade = keyScan.nextInt();
		}
		
		aTotal = aSum / total;
		bTotal = bSum / total;
		cTotal = cSum / total;
		dTotal = dSum / total;
		fTotal = fSum / total;
		scoreAverage = scoreTotal / total;
		
		System.out.println("Total number of grades = " + total);
		System.out.println("\nNumber of A's = " + incA
					     + "\nNumber of B's = " + incB
					     + "\nNumber of C's = " + incC
					     + "\nNumber of D's = " + incD
					     + "\nNumber of f's = " + incF);
		System.out.println("\nPercentage of A's = " + aTotal
					     + "\nPercentage of B's = " + bTotal
					     + "\nPercentage of C's = " + cTotal
					     + "\nPercentage of D's = " + dTotal
					     + "\nPercentage of f's = " + fTotal);
		System.out.print("\nHigest score = " + max
					   + "\nLowest score = " + min);
		System.out.println("\nScore Average =  " + scoreAverage);
	}
}
