package chapter5;

/*
	An object of this class is used to count things,
	so it records a count that is a nonnegative whole number.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 2.
	Last Changed: 25 June 2017.
 */

public class Counter {
	
	private int increase, decrease, counter;
	private static final int MINIMUM = 0;
	
	/*Set current value of counter to zero.
	 *Run this method first.*/
	public int setCurrent(){
		return counter = MINIMUM;
	}
	
	/*Increase counter by a certain integer.
	 *Only non-decimal numbers can be used.*/
	public int increaseCounter(int incValue){
		increase = incValue;
		return counter += increase;
	}
	
	/*Decrease counter by a certain integer.
	 *Only non-decimal numbers can be used.
	 *If value will be less than zero, counter will
	 *be set to zero.*/
	public int decreaseCounter(int decValue){
		decrease = decValue;
		counter -= decrease;
		if(counter < 0){
			counter  = MINIMUM;
		}else{
			return counter;
		}
		return counter;
	}
	
	/*Return current integer of counter.*/
	public void showCounter(){
		System.out.println("Current counter is: " + counter);
	}
}