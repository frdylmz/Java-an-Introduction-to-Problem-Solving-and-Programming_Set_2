package chapter4;

/*
	This program will create a spiral
	of circles.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 20.
	Last Changed: 28 May 2017;
 */

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Project20 extends JApplet{

	private static final int CIRCLE_NUMBER = 9;
	private static final int CIRCLE_RADIUS = 50;
	private static final int RADIUS_CHANGE = 5;
	private static final int X_COORDINATE = 300;
	
	public void paint(Graphics g){
		
		int circle = CIRCLE_NUMBER;
		int radius = CIRCLE_RADIUS;
		int xCoordinate = X_COORDINATE;
		int color = 0;
		int turn = 0;
		int yCoordinate = 300;
		boolean active = true;
		
		do{
			turn++;
			color++;
			switch(color){
				case 1:
					g.setColor(Color.red);
					break;
				case 2:
					g.setColor(Color.green);
					break;
				case 3:
					g.setColor(Color.blue);
					color = 0;
					break;
			}
			
			switch(turn){
				case 1:
					xCoordinate = 200;
					yCoordinate = 200;
					break;
				case 2:
					xCoordinate = 250;
					yCoordinate = 175;
					break;
				case 3:
					xCoordinate = 200;
					yCoordinate = 150;
					break;
				case 4:
					xCoordinate = 150;
					yCoordinate = 150;
					break;
				case 5:
					xCoordinate = 100;
					yCoordinate = 200;
					break;
				case 6:
					xCoordinate = 100;
					yCoordinate = 275;
					break;
				case 7:
					xCoordinate = 200;
					yCoordinate = 350;
					break;
				case 8:
					xCoordinate = 300;
					yCoordinate = 300;
					break;
				case 9:
					xCoordinate = 350;
					yCoordinate = 250;
					break;
			}
			
			radius -= RADIUS_CHANGE;
			g.fillOval(xCoordinate, yCoordinate, radius, radius);
			
			circle--;
			if(circle == 0){
				break;
			}
		}while(active);
	}
}
