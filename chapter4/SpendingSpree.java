package chapter4;

/*
	This program will work out if the user can purchase 
	said item, as if so, it will count to the 3 purchase 
	limit given.
	Author:: Josias JJ Oberholster.
	Chapter 4 Listing 4.7.
	Last Changed: 2 May 2017.
 */

import java.util.Scanner;

public class SpendingSpree {

	public static final int SPENDING_MONEY = 100;
	public static final int MAX_ITEMS = 3;
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean haveMoney = true;
		int leftToSpend = SPENDING_MONEY;
		int totalSpend = 0;
		int itemNumber = 1;
		
		while(haveMoney && (itemNumber <= MAX_ITEMS)){
			
			System.out.println("You may buy up to " + (MAX_ITEMS - itemNumber + 1) + " items");
			System.out.println("costing no more than $" + leftToSpend + ".");
			System.out.print("Enter cost of item #" + itemNumber + ": $");
			
			int itemCost = keyboard.nextInt();
			
			if(itemCost <= leftToSpend){
				
				System.out.println("You may buy this item.");
				totalSpend = totalSpend + itemCost;
				System.out.println("You spend $" + totalSpend + " so far");
				leftToSpend = SPENDING_MONEY - totalSpend;
				
				if(leftToSpend > 0){
					itemNumber++;
				}else{
					System.out.println("You are out of money.");
					haveMoney = false;
				}
			}else{
				System.out.println("You cannot buy that item.");
			}
			
			System.out.println("You spend $" + totalSpend + ", and are done shopping.\n");
		}
	}
}
