package main;

/*
 * draw a gay pyramid
 * 
 */

import acm.program.*;
import acm.graphics.*;

public class Ex4_11 extends GraphicsProgram {
	
	private static final int BRICK_WIDTH = 20; //width of each brick in pixels
	private static final int BRICK_HEIGHT = 10; //height of each brick in pixels
	private static final int BRICKS_IN_BASE = 20; //number of bricks in base of pyramid
	
	public void run() {
		double windowWidth = getWidth();
		double windowHeight = getHeight();
		double xInitial = (windowWidth - (BRICK_WIDTH * BRICKS_IN_BASE)) / 2;
		double yInitial = (windowHeight + (BRICK_HEIGHT * BRICKS_IN_BASE)) / 2; //not perfectly centered but close enough
		for (int j = 0; j < BRICKS_IN_BASE; j++){ // iterate to next row
			for (int i = j; i < BRICKS_IN_BASE; i++) { // draw one row
				GRect brick = new GRect((xInitial + i * BRICK_WIDTH), yInitial, BRICK_WIDTH, BRICK_HEIGHT);
				add(brick);
			}
			xInitial -= BRICK_WIDTH / 2;
			yInitial -= BRICK_HEIGHT;
		}
	}
}
