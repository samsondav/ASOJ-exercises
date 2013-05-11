package main;

/*
 * This program draws a checkerboard.  The dimensions of the
 * checkerboard is specified by the constants NROWS and
 * NCOLUMNS, and the size of the squares is chosen so
 * that the checkerboard fills the available vertical space.
 * 
 * TODO:
 * 1) center horizontally
 * 2) draw set of red and black checkers
 */

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Ex4_14 extends GraphicsProgram {

	public void run() {
		drawBoard();
	}
	
/* Private functions */
	private void drawBoard() {
		double sqSize = (double) getHeight() / NROWS;
		int windowWidth = getWidth();
		double xOffset = (windowWidth - (NROWS * sqSize)) / 2;
		for (int i = 0; i < NROWS; i++) {
			for (int j = 0; j < NCOLUMNS; j++) {
				double x = j * sqSize;
				double y = i * sqSize;
				GRect sq = new GRect((x + xOffset), y, sqSize, sqSize);
				if ((i + j) % 2 != 0) { //for black squares only
					sq.setFilled(true);
					sq.setFillColor(Color.gray);
					add(sq); //must draw square before checker
					if (i < 3) {
						// case for drawing red checkers
						GOval checker = new GOval((x + xOffset), y, sqSize, sqSize);
						checker.setFilled(true);
						checker.setFillColor(Color.red);
						add(checker);
					} else if (i >= (NROWS - 3)) {
						// case for drawing black checkers
						GOval checker = new GOval((x+xOffset), y, sqSize, sqSize);
						checker.setFilled(true);
						checker.setFillColor(Color.black);
						add(checker);
					}
				} else {
					add(sq);
				}
			}
		}
	}
/* Private constants */
	private static final int NROWS = 8;     /* Number of rows    */
	private static final int NCOLUMNS = 8;  /* Number of columns */

}
