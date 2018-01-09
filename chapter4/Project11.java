package chapter4;

/*
	This program will read a account balance
	and an interest rate and display the account
	in 10 years.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 11.
	Last Changed: 23 May 2017.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Project11 {

	public static final double INTEREST_RATE = 5;
	public static final double YEARLY_INTEREST = INTEREST_RATE;
	public static final double MONTLY_INTEREST = INTEREST_RATE / 12;
	public static final double DAILY_INTEREST = INTEREST_RATE / 365;
	public static DecimalFormat df2 = new DecimalFormat(".##");
	
	public static void main(String[] args){
		
		Scanner keyScan = new Scanner(System.in);
		boolean resume = true;
		
		do{
			System.out.println("This program will read a account balance"
					 	   + "\nand an interest rate and display the account"
					       + "\nin 10 years.");
			System.out.print("\nThe amount should have the following:"
						   + "\nMust be more than 25c"
						   + "\nMust be no more than 100c"
						   + "\nMust be in multiple of 5c"
						   + "\nEnter current balance:");
			double balance = keyScan.nextDouble();		
			
			if(balance < 25 || balance > 100 || balance % 5 != 0){
				System.out.println("");
				
				if(balance < 25){
					System.out.println("The balance cannot be lower than 25c");
				}
				if(balance > 100){
					System.out.println("The balance cannot be higher than 100c");
				}
				if(balance % 5 != 0){
					System.out.println("The balance must be a muliple of 5c");
				}
			}else{
				for(int year = 1; year <= 10; year++){
					double dailyInterest = balance * (DAILY_INTEREST / 100);
					double montlyInterest = balance * (MONTLY_INTEREST / 100);
					double yearlyInterest = balance * (YEARLY_INTEREST / 100);
					
					double yBalance = balance + yearlyInterest;
					
					System.out.println("");
					System.out.println("Year " + year + ":");
					System.out.println("Daily Interest: " + df2.format(dailyInterest));
					System.out.println("Montly Interest: " + df2.format(montlyInterest));
					System.out.println("Yearly Interest: " + df2.format(yearlyInterest));
					System.out.println("Your total for year " + year + " is: " + df2.format(yBalance));
					
					balance = yBalance;
				}
			}
			
			System.out.println("\nDo you want to try again?"
						     + "\n[yes / no]");
			String again = keyScan.next();
			
			if(again.equalsIgnoreCase("yes")){
				//Do nothing
			}else if(again.equalsIgnoreCase("no")){
				resume = false;
			}else{
				System.out.println("An error has occured");
			}
			System.out.println("");
		}while(resume);
	}
}
