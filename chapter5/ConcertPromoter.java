package chapter5;

/*
	This class will record tickets sold for a performance.
	Tickets will be sold over phone before the day of the
	concert, after that the tickets will be sold in person.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 10.
	Last Changed: 7 July 2017.
*/

import java.util.Scanner;

public class ConcertPromoter {

	private String bandName;
	private int venueCapacity, ticketSold, salesMade, ticketRemain;
	private int phoneSaleMade, venueSalesMade, ticketSalesMade;
	private static final int PHONE_TICKETS_PRICE = 100;
	private static final int VENUE_TICKETS_PRICE = 150;
	Scanner sc = new Scanner(System.in);
	
	/*Input will be a String.
	 *Will create band name.*/
	public void setBandName(String name){
		bandName = name;
	}
	
	/*No input required.
	 *Will return band name.*/
	public String getBandName(){
		return bandName;
	}
	
	/*Input will be integer.
	 *Will produce the venue capacity, which will be the amount
	 *of tickets that can be sold.*/
	public void setVenueCapacity(int cap){
		venueCapacity = cap;
		ticketRemain = venueCapacity;
	}
	
	/*No input required.
	 *Will return the venue capacity, which will be the amount of
	 *tickets available.*/
	public int getVenueCapacity(){
		return venueCapacity;
	}
	
	/*No input required.
	 *Will return amount of tickets left.*/
	public int getTicketsLeft(){
		return ticketRemain;
	}
	
	/*Input will be the amount on tickets bought at said point.
	 *Method will reduce the amount left, by the amount that was bought.
	 *if tickets reach 0 or less, then a message will appear informing
	 *the buyer that no more tickets area available.*/
	private void TicketSale(int amount){
		ticketSold = amount;
		ticketSalesMade += amount;
		ticketRemain -= ticketSold;
		if(ticketRemain >= 0){
			System.out.println(ticketSold + " tickets baught.");
		}else{
			System.out.println("Not enough tickets are available.");
			ticketSalesMade -= amount;
			ticketRemain += ticketSold;
		}
	}
	
	/*Input will be a string of either phone or person.
	 *Depending on the input, the method will run that block.*/
	public void SaleDay(String day){
		if(day.equalsIgnoreCase("phone")){
			System.out.println("Tickets are available over phone only");
			System.out.println("Ticket price: R" + PHONE_TICKETS_PRICE);
			System.out.println("How many tickets will be bought?");
			System.out.println("[Tickets Remaining: " + ticketRemain + " for " + bandName + "]");
			salesMade = sc.nextInt();
			TicketSale(salesMade);
			phoneSaleMade = salesMade * PHONE_TICKETS_PRICE;
		}else if(day.equalsIgnoreCase("person")){
			System.out.println("Tickets are available at venue only");
			System.out.println("Ticket price: R" + VENUE_TICKETS_PRICE);
			System.out.println("How many tickets will be bought?");
			System.out.println("[Tickets Remaining: " + ticketRemain + " for " + bandName + "]");
			salesMade = sc.nextInt();
			TicketSale(salesMade);
			venueSalesMade = salesMade * VENUE_TICKETS_PRICE;
		}else{
			System.out.println("ERROR: invalid option.");
			System.out.println("Sales are made over \"Phone\" or in \"Person\"");
		}
	}
	
	/*No input required.
	 *Will show total amount of tickets sold, total amount of tickets remaining,
	 *and the total sale made.*/
	public void getTotalSale(){
		System.out.println("Total amount of tickets sold: " + ticketSalesMade);
		System.out.println("Total amount of tickets remaining: " + ticketRemain);
		System.out.println("Total sale made: R" + (phoneSaleMade + venueSalesMade));
	}
}