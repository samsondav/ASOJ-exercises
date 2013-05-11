package main;

/*
 * print scrolling headline saying "DEWEY DEFEATS TRUMAN"
 * headline initially appears at right edge of screen and moves quickly
 * from right to left
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Ex4_16 extends GraphicsProgram {
	public void run() {
		GLabel headline = new GLabel(HEADLINE, getWidth(), FONT_SIZE);
	    headline.setFont(new Font("Sans", Font.BOLD, FONT_SIZE));
		add(headline);
		while ((headline.getX() + headline.getWidth()) > 0) { //halt when the entire text field has scrolled off the left side
			headline.move(-STEP_SIZE, 0);
			pause(PAUSE_TIME);
			println("animating..."); //DEBUG
		}
	println("Halt."); //DEBUG
	}
/* Private constants */
	private static final String HEADLINE = "DEWEY DEFEATS TRUMAN";
	private static final int FONT_SIZE = 200; //in pixels
	private static final int STEP_SIZE = 2; //in pixels
	private static final int PAUSE_TIME = 10;
}
