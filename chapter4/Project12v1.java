package chapter4;

import java.util.Scanner;

/*
	This program will display the total
	number of grades and the number of
	grades in each letter-grade category.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 12.
	Last Changed: 23 May 2017.
*/

import javax.swing.JOptionPane;

public class Project12v1 extends JOptionPane{

	public static void main(String[] args){
		
		double gradeA = 90, gradeB = 80, gradeC = 70, gradeD = 60, gradeF = 0,
				   total = 0, incA = 0, incB = 0, incC = 0, incD = 0, incF = 0, max = 0,
				   min = 0, aSum = 0, bSum = 0, cSum = 0, dSum = 0, 
				   fSum = 0, aTotal, bTotal, cTotal, dTotal, fTotal, scoreTotal = 0, scoreAverage;
		boolean active = true;	
		

		int confirm = JOptionPane.showConfirmDialog(null, "This program will display the total"
												      + "\nnumber of grades and the number of"
												      + "\ngrades in each letter-grade category.", 
												      "Confirm", JOptionPane.YES_NO_OPTION);
		if(confirm == YES_OPTION){	
			do{
				String userGrades = JOptionPane.showInputDialog("Enter the grades, when done, enter a non-negative number.");
				int convGrade = Integer.parseInt(userGrades);
				
				if(convGrade < 0){
					active = false;
					break;
				}
				
				if(convGrade > gradeA){
					incA++;
					aSum += convGrade;
				}else if(convGrade >= gradeB){
					incB++;
					bSum += convGrade;
				}else if(convGrade >= gradeC){
					incC++;
					cSum += convGrade;
				}else if(convGrade >= gradeD){
					incD++;
					dSum += convGrade;
				}else{
					incF++;
					fSum += convGrade;
				}
				
				if(convGrade > max){
					max = convGrade;
					min = max;
				}
				if(convGrade < min){
					min = convGrade;
				}
				
				total++;
				scoreTotal += convGrade;				
			}while(active);
		}else if(confirm == NO_OPTION){
			System.exit(0);
		}
		aTotal = aSum / total;
		bTotal = bSum / total;
		cTotal = cSum / total;
		dTotal = dSum / total;
		fTotal = fSum / total;
		scoreAverage = scoreTotal / total;
		
		JOptionPane.showMessageDialog(null, "Total number of grades = " + total
				
										 + "\n\nNumber of A's = " + incA
								 		 + "\nNumber of B's = " + incB
										 + "\nNumber of C's = " + incC
										 + "\nNumber of D's = " + incD
										 + "\nNumber of f's = " + incF
										
										 + "\n\nPercentage of A's = " + aTotal
									     + "\nPercentage of B's = " + bTotal
									     + "\nPercentage of C's = " + cTotal
									     + "\nPercentage of D's = " + dTotal
									     + "\nPercentage of f's = " + fTotal
									    
									     + "\n\nHigest score = " + max
										 + "\nLowest score = " + min
										
										 + "\n\nScore Average =  " + scoreAverage);
		
		System.exit(0);
	}
}