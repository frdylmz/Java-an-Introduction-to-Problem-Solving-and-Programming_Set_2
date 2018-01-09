package chapter4;

/*
	This program will computing the 
	month-by-month balance in your 
	savings account.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 2.
	Last Changed: 11 May 2017. 
 */

import javax.swing.JOptionPane;

public class Project2 extends JOptionPane{

	public static final double YEARLYINTERESTRATE = 4.125 / 12;
	
	public static void main(String[] args){
		
		double savingsAmount = 0;
		
		double iAmount;
		boolean hasTransaction = true;
				
		String savings = JOptionPane.showInputDialog("What is the amount in your savings?");
		savingsAmount = Integer.parseInt(savings);
		
		for(;;){
			String withdrawl = JOptionPane.showInputDialog("Do you want to make a [w]withdrawl, [d]deposit, or [n]none?");
			
			while(!hasTransaction){
				double monthlyInterest = (savingsAmount * YEARLYINTERESTRATE) / 100;
				JOptionPane.showMessageDialog(null, "Your maximum amount of transactions have been reached" 
												  + "\nYour montly interest is: " + monthlyInterest);
				System.exit(0);
			}
			
			if(withdrawl.equalsIgnoreCase("w")){
				String amount = JOptionPane.showInputDialog("How much would you like to withdraw?");
				iAmount = Integer.parseInt(amount);
				
				savingsAmount -= iAmount;
				hasTransaction = false;
			}else if(withdrawl.equalsIgnoreCase("d")){
				String amount = JOptionPane.showInputDialog("How much would you like to deposit?");
				iAmount = Integer.parseInt(amount);
				
				savingsAmount += iAmount;
				hasTransaction = false;
			}else if(withdrawl.equalsIgnoreCase("n")){
				System.out.println("");
			}else{
				JOptionPane.showMessageDialog(null, "Invalid choice");
			}
			double monthlyInterest = (savingsAmount * YEARLYINTERESTRATE) / 100;
			JOptionPane.showMessageDialog(null, "Your montly interest is: " + monthlyInterest);
		}
	}
}
