package chapter4;

/*
	This program shows a figure
	that assumes a running position.
	Author: Josias JJ Oberholster.
	Chapter 4 Programming Project 21.
	Last Changed: 28 May 2017.
 */

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Project21 extends JApplet{
	
//Set Leg	
	private static final int LEG_DOWN_X = 38;
	private static final int LEG_DOWN_Y = 125;
	private static final int LEG_DOWN_WIDTH = 20;
	private static final int LEG_DOWN_HEIGHT = 60;
	
	private static final int LEG_X_UP_1 = 38;
	private static final int LEG_X_UP_2 = 0;
	private static final int LEG_Y_UP = 110;
	private static final int LEG_UP_WIDTH = 60;
	private static final int LEG_UP_HEIGHT = 20;
	
//Set Arm
	private static final int ARM_DOWN_X = 38;
	private static final int ARM_DOWN_Y = 75;
	private static final int ARM_DOWN_WIDTH = 20;
	private static final int ARM_DOWN_HEIGHT = 40;
	
	private static final int ARM_X_UP_1 = 55;
	private static final int ARM_X_UP_2 = 0;
	private static final int ARM_Y_UP = 75;
	private static final int ARM_UP_WIDTH = 40;
	private static final int ARM_UP_HEIGHT = 20;
	
//Set Body
	private static final int BODY_X = 25;
	private static final int BODY_Y = 60;
	private static final int BODY_WIDTH = 45;
	private static final int BODY_HEIGHT = 70;

//Set Face	
	private static final int Face_X = 20;
	private static final int Face_Y = 20;
	private static final int Face_DOWN_WIDTH = 50;
	private static final int Face_DOWN_HEIGHT = 50;
	private static final int LEFT_EYE_X = 30;
	private static final int RIGT_EYE_X = 50;
	private static final int EYE_Y = 30;
	private static final int EYE_SIZE = 10;
	private static final int NOSE_X = 43;
	private static final int NOSE_Y = 43;
	private static final int NOSE_SIZE = 5;
	private static final int MOUTH_X = 30;
	private static final int MOUTH_Y = 55;
	private static final int MOUTH_WIDTH = 30;
	private static final int MOUTH_HEIGHT = 8;
	private static final int MOUTH_ARC = 180;
	
	public void paint(Graphics g){
		
		int xOffset = 0;
		int legDownX1 = 0, legDownY1 = 0, legDownX2 = 0, legDownY2 = 0, legDownWidth = 0, legDownHeight = 0,
			armDownX1 = 0, armDownY1 = 0, armDownX2 = 0, armDownY2 = 0, armDownWidth = 0, armDownHeight = 0;
		
		for(int turn = 1; turn <= 5; turn++){
			
			if(turn % 2 == 0){
				legDownX1 = LEG_DOWN_X;
				legDownY1 = LEG_DOWN_Y;
				legDownX2 = LEG_DOWN_X;
				legDownY2 = LEG_DOWN_Y;
				legDownWidth = LEG_DOWN_WIDTH;
				legDownHeight = LEG_DOWN_HEIGHT;
				
				armDownX1 = ARM_DOWN_X;
				armDownY1 = ARM_DOWN_Y;
				armDownX2 = ARM_DOWN_X;
				armDownY2 = ARM_DOWN_Y;
				armDownWidth = ARM_DOWN_WIDTH;
				armDownHeight = ARM_DOWN_HEIGHT;
			}else{
				legDownX1 = LEG_X_UP_1;
				legDownY1 = LEG_Y_UP;
				legDownX2 = LEG_X_UP_2;
				legDownY2 = LEG_Y_UP;
				legDownWidth = LEG_UP_WIDTH;
				legDownHeight = LEG_UP_HEIGHT;
				
				armDownX1 = ARM_X_UP_1;
				armDownY1 = ARM_Y_UP;
				armDownX2 = ARM_X_UP_2;
				armDownY2 = ARM_Y_UP;
				armDownWidth = ARM_UP_WIDTH;
				armDownHeight = ARM_UP_HEIGHT;
			}
			
			g.setColor(Color.black);
	//Draw Left Arm
			g.fillOval(armDownX1 + xOffset, armDownY1, armDownWidth, armDownHeight);
	//Draw left Leg
			g.fillOval(legDownX1 + xOffset, legDownY1, legDownWidth, legDownHeight);
	//Draw Body
			g.fillOval(BODY_X + xOffset, BODY_Y, BODY_WIDTH, BODY_HEIGHT);
	//Draw Right Arm
			g.fillOval(armDownX2 + xOffset, armDownY2, armDownWidth, armDownHeight);
	//Draw Right Leg
			g.fillOval(legDownX2 + xOffset, legDownY2, legDownWidth, legDownHeight);
	//Draw Face
			switch(turn){
			case 1:
				g.setColor(Color.white);
				break;
			case 2:
				g.setColor(Color.pink);
				break;
			case 3:
				g.setColor(Color.red);
				break;
			case 4:
				g.setColor(Color.yellow);
				break;
			case 5:
				g.setColor(Color.green);
				break;
			}
			g.fillOval(Face_X + xOffset, Face_Y, Face_DOWN_WIDTH, Face_DOWN_HEIGHT);
			g.setColor(Color.black);
			g.drawOval(Face_X + xOffset, Face_Y, Face_DOWN_WIDTH, Face_DOWN_HEIGHT);
			g.fillOval(LEFT_EYE_X + xOffset, EYE_Y, EYE_SIZE, EYE_SIZE);
			g.fillOval(RIGT_EYE_X + xOffset, EYE_Y, EYE_SIZE, EYE_SIZE);
			g.fillOval(NOSE_X + xOffset, NOSE_Y, NOSE_SIZE, NOSE_SIZE);
			g.drawArc(MOUTH_X + xOffset, MOUTH_Y, MOUTH_WIDTH, MOUTH_HEIGHT, MOUTH_ARC, MOUTH_ARC);
			
			xOffset = 100 * turn;
		}
		
	}
}