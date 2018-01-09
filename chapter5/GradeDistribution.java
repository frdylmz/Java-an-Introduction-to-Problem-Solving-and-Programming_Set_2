package chapter5;

/*
	This class will take a input of grades A, B, C,
	D and F, return the total of grade, return the 
	percentage of the letter grade as a whole, then
	lastly it will create a graph to show the grades.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Exercise 5.
	Last Changed: 27 June 2017.
*/

import java.util.Scanner;

public class GradeDistribution {

	Scanner sc = new Scanner(System.in);
	
	private int grade, gradeA, gradeB, gradeC, gradeD, gradeF;
	private boolean active = true;
	
	
	/*Will run and take integers.
	 *A switch is used to ask for each grade number.*/
	public void readGrade(){
		for(int x = 0; x < 5; x++){
			switch(x){
				case 0:
					System.out.println("Input number of \"A's\"");
					gradeA = sc.nextInt();
					break;
				
				case 1:
					System.out.println("Input number of \"B's\"");
					gradeB = sc.nextInt();
					break;
					
				case 2:
					System.out.println("Input number of \"C's\"");
					gradeC = sc.nextInt();
					break;
					
				case 3:
					System.out.println("Input number of \"D's\"");
					gradeD = sc.nextInt();
					break;
					
				case 4:
					System.out.println("Input number of \"F's\"");
					gradeF = sc.nextInt();
					break;
			}
		}
	}
	
	/*
		This method will write the output of the scores, and display them
		in a graph.
	*/
	public void writeGrade(){
		double gradeSum = gradeA + gradeB + gradeC + gradeD + gradeF;
		
		double gradeAPerc = ((gradeA / gradeSum) * 100) / 2; int gradeASet = (int) gradeAPerc;
		double gradeBPerc = ((gradeB / gradeSum) * 100) / 2; int gradeBSet = (int) gradeBPerc;
		double gradeCPerc = ((gradeC / gradeSum) * 100) / 2; int gradeCSet = (int) gradeCPerc;
		double gradeDPerc = ((gradeD / gradeSum) * 100) / 2; int gradeDSet = (int) gradeDPerc;
		double gradeFPerc = ((gradeF / gradeSum) * 100) / 2; int gradeFSet = (int) gradeFPerc;
		
		System.out.println("    10   20   30   40   50   60   70   80   90   100");
		System.out.println("    |    |    |    |    |    |    |    |    |    |");
		System.out.println("**************************************************");
		
		for(int x = 0 ; x < gradeASet; x++){
			System.out.print("*");
		}System.out.println(" - A");
		for(int x = 0 ; x < gradeBSet; x++){
			System.out.print("*");
		}System.out.println(" - B");
		for(int x = 0 ; x < gradeCSet; x++){
			System.out.print("*");
		}System.out.println(" - C");
		for(int x = 0 ; x < gradeDSet; x++){
			System.out.print("*");
		}System.out.println(" - D");
		for(int x = 0 ; x < gradeFSet; x++){
			System.out.print("*");
		}System.out.println(" - F");
	}
}