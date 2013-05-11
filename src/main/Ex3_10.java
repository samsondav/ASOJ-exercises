package main;
/*
 * This program draws a Tic-Tac-Toe board as an illustration
 * of the GLine class.  The version uses explicit coordinate
 * values which makes the program difficult to extend or
 * maintain.  In Chapter 3, you will learn how to constants
 * and expressions to calculate these coordinate values.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Ex3_10 extends GraphicsProgram {
	
	public void run() {
		double windowWidth = getWidth();
		double windowHeight = getHeight();;
		double xInitial = (windowWidth - BOARD_SIZE) / 2;
		double yInitial = (windowHeight - BOARD_SIZE) / 2;
		/* draw the grid using xInitial and yInitial as starting points */
		add(new GLine(xInitial, (yInitial + BOARD_SIZE / 3), (xInitial + BOARD_SIZE), (yInitial + BOARD_SIZE / 3)));
		add(new GLine(xInitial, (yInitial + (2 * BOARD_SIZE) / 3), (xInitial + BOARD_SIZE), (yInitial + (2 * BOARD_SIZE) / 3)));
		add(new GLine((xInitial + BOARD_SIZE / 3), yInitial, (xInitial + BOARD_SIZE / 3), (yInitial + BOARD_SIZE)));
		add(new GLine(xInitial + (2 * BOARD_SIZE / 3), yInitial, (xInitial + (2 * BOARD_SIZE / 3)), (yInitial + BOARD_SIZE)));
	}
	/* BOARD_SIZE constant is width of board in pixels  */
	private static final double BOARD_SIZE = 200.0;
}
