package chapter5;

/*
	This class will set a maximum and minimum accepted value.
	Author: Josias JJ Oberholster.
	Chapter 5 Exercise 5.
	Last Changed: 11 June 2017.
 */

public class Accepted {

	private int minimum, maximum;
	public int lowest, highest, given;
	public boolean run;
	
	//Set lowest integer amount
	public int SetLowest(int low){
		return lowest = low;
	}
	
	//Set highest integer amount
	public int setHighest(int high){
		return highest = high;
	}
	
	/*
	Will stop if lowest and highest are within rage, 
	otherwise, will continue
	*/
	public boolean getValue(){
		minimum = lowest;
		maximum = highest;
		
		if((given > lowest) && (given < highest)){
			System.out.println("The amount is accepted.");
			return run = false;
		}else{
			System.out.println("The amount is not accepted");
			System.out.println("Try again\n");
			return run = true;
		}
	}
}
