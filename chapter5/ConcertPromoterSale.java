package chapter5;

/*
	This class will work with the ConcertPromoter to keep track
	of sales made.
	Author: Josias JJ Oberholster.
	Chapter 5 programming Project 10.
 */

import java.util.Scanner;

public class ConcertPromoterSale {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		ConcertPromoter cp = new ConcertPromoter();
		boolean active = true;
		
		System.out.println("What is the band name?");
		String bandName = sc.nextLine();
		cp.setBandName(bandName);
		
		System.out.println("");
		System.out.println("What is the venue capacity?");
		int caps = sc.nextInt();
		cp.setVenueCapacity(caps);
		
		do{
			System.out.println("Ticket remaining: " + cp.getTicketsLeft());
			if(cp.getTicketsLeft() <= 0){
				System.out.println("No more tickets reamin.");
				cp.getTotalSale();
				active = false;
			}else{
				System.out.println("Is there a Sale? [y / n]");
				String sale = sc.next();
				
				if(sale.equalsIgnoreCase("y")){
					System.out.println("Is the sale over the phone or in Person?");
					System.out.println("[Input should be \"phone\" or \"person\"]");
					String saleType = sc.nextLine();
					cp.SaleDay(saleType);
				}else if(sale.equalsIgnoreCase("n")){
					cp.getTotalSale();
					active = false;
				}else{
					System.out.println("Invalid option");
				}
			}	
		}while(active);
	}
}
