package chapter5;

/*
	This program will test the Rectangle class.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.9.
	Last Changed: 31 May 2017.
 */

public class RectangleTest {

	public static void main(String[] args){
		
		Rectangle rec = new Rectangle();
		Rectangle2 rec2 = new Rectangle2();
		
		rec.setDimentions(13,  22);
		rec2.setDimentions(130, 55);
		
		System.out.println("The area of our rectangle is: " + rec.getArea());
		System.out.println("The are of out rectangle2 is: " + rec2.getArea());
	}
}
