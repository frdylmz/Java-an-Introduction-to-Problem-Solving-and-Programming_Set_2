package chapter5;

/*
	Class that represents a rectangle.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.10.
	Last Changed: 31 May 2017.
 */

public class Rectangle2 {

	private int width;
	private int height;
	
	public void setDimentions(int newWidth, int newHeight){
		
		width = newWidth;
		height = newHeight;
	}
	
	public int getArea(){
		return width * height;
	}
}
