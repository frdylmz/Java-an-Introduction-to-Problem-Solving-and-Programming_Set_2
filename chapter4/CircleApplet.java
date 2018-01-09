package chapter4;

/*
	This program will draw six circles
	evenly spaced between each other
	on a horizontal line.
	Author: Josias JJ Oberholster.
	Chapter 4 Exercise 17.
	Last Changed: 10 May 2017.
 */

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class CircleApplet extends JApplet {

	public static final int DIAMETER = 10;
	public static final int X_CO = 10;
	public static final int Y_CO = 10;	
	public static final int CIRCLENUMBER = 6;
	public static final int DIAMETERINC = 10;
	public static final int X_MOVE = 70;
	
	
	public void paint(Graphics g){
		
		for(int x = 1; x <= CIRCLENUMBER; x++){
			g.setColor(Color.black);
			
			g.fillOval(X_CO + X_MOVE * x, Y_CO, DIAMETER + DIAMETERINC * x, DIAMETER + DIAMETERINC * x);
		}
	}
}
