package chapter5;

/*
	This class will test the Counter class.
	Author: Josias JJ Oberholster.
	Chapter 5 Programming Project 2.
	Last Changed: 25 June 2017.
*/

public class CounterTest {

	public static void main(String[] args){
		
		Counter c = new Counter();
		
		c.setCurrent();
		c.showCounter();
		
		c.increaseCounter(5);
		c.showCounter();
		
		c.decreaseCounter(3);
		c.showCounter();
		
		c.decreaseCounter(5);
		c.showCounter();
		
		c.increaseCounter(20);
		c.showCounter();
	}
}
