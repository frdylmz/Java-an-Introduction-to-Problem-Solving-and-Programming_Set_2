package chapter4;

/*
	This is a simple program used to loop
	circles next to each other.
	Author: Josias JJ Oberholster.
	Chapter 4 Self-Test Question 26.
	Last Changed: 3 May 2017.
 */

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class CircleLoop extends JApplet {

	public static final int OvalWidth = 100;
	public static final int OvalHeight = 100;
	public static final int X_POSITION = 20;
	public static final int Y_POSITION = 20;
	
	public void paint(Graphics g){
		
		int i;
		
		for(i = 1; i <= 48; i += 8){
			
			g.setColor(Color.cyan);
			g.fillOval(X_POSITION * i + 8, Y_POSITION , OvalWidth, OvalHeight);
			
			g.setColor(Color.black);
			g.drawOval(X_POSITION * i + 8, Y_POSITION, OvalWidth, OvalHeight);
		}
	}
}