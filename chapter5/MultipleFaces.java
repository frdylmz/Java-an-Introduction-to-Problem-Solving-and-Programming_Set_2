package chapter5;

/*
	This applet will draw multiple faces, thanks to the
	help of methods.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.23.
	Last Changed: 5 June 2017.
 */

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class MultipleFaces extends JApplet {

	public static final int FACE_DIAMETER = 50;
	public static final int X_FACE0 = 10;
	public static final int Y_FACE0 = 5;
	
	public static final int EYE_WIDTH = 5;
	public static final int EYE_HEIGHT = 10;
	public static final int X_RIGHT_EYE0 = 20;
	public static final int Y_RIGHT_EYE0 = 15;
	public static final int X_LEFT_EYE0 = 45;
	public static final int Y_LEFT_EYE0 = Y_RIGHT_EYE0;
	
	public static final int NOSE_DIAMETER = 5;
	public static final int X_NOSE0 = 32;
	public static final int Y_NOSE0 = 25;
	
	public static final int MOUTH_WIDTH = 30;
	public static final int MOUTH_HEIGHT = 0;
	public static final int X_MOUHT0 = 20;
	public static final int Y_MOUTH0 = 35;
	public static final int MOUTH_START_ANGLE = 180;
	public static final int MOUTH_EXTENT_ANGLE = 180;
	
	/*
		g is the drawing area. pos indicates the position of the 
		face. As pos increases, the face is drawn lower and further
		to the right.
	 */
	private void drawFacesAndMouth(Graphics g, int pos){
		g.setColor(Color.black);
		g.drawOval(X_FACE0 + 50 * pos, Y_FACE0 + 30 * pos, FACE_DIAMETER, FACE_DIAMETER);
		
		//Draw eyes
		g.setColor(Color.blue);
		g.fillOval(X_RIGHT_EYE0 + 50 * pos, Y_RIGHT_EYE0 + 30 *pos, EYE_WIDTH, EYE_HEIGHT);
		g.fillOval(X_LEFT_EYE0 + 50 * pos, Y_LEFT_EYE0 + 30 * pos, EYE_WIDTH, EYE_HEIGHT);
		
		//Draw nose
		g.setColor(Color.black);
		g.fillOval(X_NOSE0 + 50 * pos, Y_NOSE0 + 30 * pos, NOSE_DIAMETER, NOSE_DIAMETER);
	}
	
	public void paint(Graphics canvas){
		int i;
		
		for(i = 0; i < 5; i++){
			//Draw one face
			if(i % 2 == 0){ //If i is even
				//Make face yellow
				canvas.setColor(Color.yellow);
				canvas.fillOval(X_FACE0 + 50, Y_FACE0 + 30, FACE_DIAMETER, FACE_DIAMETER);
			}
			
			drawFacesAndMouth(canvas, i);
			
			//Draw mouth
			canvas.setColor(Color.red);
			canvas.drawArc(X_MOUHT0 + 50 * i, Y_MOUTH0 + 30 * i, MOUTH_WIDTH, MOUTH_HEIGHT + 3 * i, MOUTH_START_ANGLE, MOUTH_EXTENT_ANGLE);
		}
		
		//i == 5
		//Draw kissing face
		drawFacesAndMouth(canvas, i);
		
		//Draw mouth in shape of a kiss:
		canvas.setColor(Color.red);
		canvas.fillOval(X_MOUHT0 + 50 * i + 10, Y_MOUTH0 + 30 * i, MOUTH_WIDTH - 20, MOUTH_HEIGHT - 20);
		
		//Add text
		canvas.setColor(Color.black);
		canvas.drawString("Kiss. Kiss", X_FACE0 + 50 * i + FACE_DIAMETER, Y_FACE0 + 30 * i);
		
		//Draw blushing face
		i++;
		
		//Draw face circle
		canvas.setColor(Color.pink);
		canvas.fillOval(X_FACE0 + 50 * i, Y_FACE0 + 30 * i, FACE_DIAMETER, FACE_DIAMETER);
		drawFacesAndMouth(canvas, i);
		
		//Draw mouth
		canvas.setColor(Color.red);
		canvas.drawArc(X_MOUHT0 + 50 * i, Y_MOUTH0 + 30 * i, MOUTH_WIDTH, MOUTH_HEIGHT + 3 * (i - 2), MOUTH_START_ANGLE, MOUTH_EXTENT_ANGLE);
		
		//Add text
		canvas.setColor(Color.black);
		canvas.drawString("Tee Hee.", X_FACE0 + 50 * i + FACE_DIAMETER, Y_FACE0 + 30 * i);
	}
}