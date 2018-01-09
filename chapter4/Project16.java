package chapter4;

/*
	This program will compute the amount of
	chocolate bars, that can be obtained with
	a specific amount.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 5.
	Last Changed: 24 May 2017.
 */

import java.util.Scanner;

public class Project16 {

	public static void main(String[] args){
		
		int chocBar = 0, couponTrade = 6, coupon = 0;
		boolean active = true;
		
		System.out.println("This vending machine sells chocolate bars for $1 each."
					   + "\nIn each chocolate bar is a voucher, once you have 6"
					   + "\nvouchers, you can trade them in for a extra chocolate bar."
					   + "\nTo see how may chocolate bars you can get for a specific amount.");
		
		Scanner keyScan = new Scanner(System.in);
		
		do{
			System.out.println("\nEnter amount of chocolate bars to buy."
							+ "\nTo end, enter a negative amount");
			int money = keyScan.nextInt();
			
			if(money >= 0){
				coupon += money;
				int extraBar = coupon / couponTrade;
				chocBar = money + extraBar;
				int couponLeft = chocBar % couponTrade;
				System.out.println("For $" + money + ", you can get " + chocBar + " chocolate bar(s),"
							   + "\nwith " + couponLeft + " coupon(s) left.");
				
				coupon += couponLeft; 
			}else{
				active = false;
			}
		}while(active);
	}
}
