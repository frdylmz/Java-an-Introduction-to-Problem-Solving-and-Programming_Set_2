package chapter5;

/*
	Class that represents a rectangle.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.9.
	Last Changed: 31 May 2017.
 */

public class Rectangle {

	private int width;
	private int height;
	private int area;
	
	public void setDimentions(int newWidth, int newHeight){
		
		width = newWidth;
		height = newHeight;
		area = width * height;
	}
	
	public int getArea(){
		return area;
	}
}
