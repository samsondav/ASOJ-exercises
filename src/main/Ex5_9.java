package main;

/*
 * Draw house
 */

import acm.program.*;
import acm.graphics.*;

public class Ex5_9 extends GraphicsProgram {
	public void run() {
		double x = getWidth() / 2;
		double y = getHeight() / 2;
		// draw main house
		drawHouseOutline(x, y);
		// draw top windows
		drawWindow((x - HOUSE_WIDTH / 4), (y - HOUSE_HEIGHT / 4), X_PANES_UPSTAIRS, Y_PANES_UPSTAIRS);
		drawWindow((x + HOUSE_WIDTH / 4), (y - HOUSE_HEIGHT / 4), X_PANES_UPSTAIRS, Y_PANES_UPSTAIRS);
		// draw bottom windows
		drawWindow((x - HOUSE_WIDTH / 4), (y + HOUSE_HEIGHT / 4), X_PANES_DOWNSTAIRS, Y_PANES_DOWNSTAIRS);
		drawWindow((x + HOUSE_WIDTH / 4), (y + HOUSE_HEIGHT / 4), X_PANES_DOWNSTAIRS, Y_PANES_DOWNSTAIRS);
		// draw door
		drawDoor(x, (y + (HOUSE_HEIGHT - DOOR_HEIGHT) / 2));
	}
	private void drawHouseOutline(double x, double y) {
		// draw house with body centered at x, y
		double x0 = x - HOUSE_WIDTH / 2;
		double y0 = y - HOUSE_HEIGHT / 2;
		GRect sq = new GRect(x0, y0, HOUSE_WIDTH, HOUSE_HEIGHT);
		add(sq);
		// left roof side
		add(new GLine(x0, y0, x, (y0 - ROOF_HEIGHT)));
		// right roof side
		add(new GLine(x, (y0 - ROOF_HEIGHT), (x0 + HOUSE_WIDTH), y0));
		
	}
	private void drawWindow(double x, double y, int xPanes, int yPanes) {
		// draw window centered at x, y with defined number of panes
		double x0 = x - (xPanes * PANE_WIDTH) / 2;
		double y0 = y - (yPanes * PANE_HEIGHT) / 2;
		println("xpanes = " + xPanes); //DEBUG
		for (int i = 0; i < xPanes; i++) { //rows
			for (int j = 0; j < yPanes; j++) {
				add(new GRect((x0 + i * PANE_WIDTH), (y0 + j * PANE_HEIGHT), PANE_WIDTH, PANE_HEIGHT));
			}
		}
	}
	private void drawDoor(double x, double y) {
		// draw door centered at x, y with dimensions height, width
		double x0 = x - DOOR_WIDTH / 2;
		double y0 = y - DOOR_HEIGHT / 2;
		// draw door
		add(new GRect(x0, y0, DOOR_WIDTH, DOOR_HEIGHT));
		// draw knob with diameter DOOR_WIDTH / 8
		add(new GOval((x + DOOR_WIDTH / 4), (y - DOOR_WIDTH / 16), (DOOR_WIDTH / 8), (DOOR_WIDTH / 8)));
	}
	
/* Dimensions of the house outline */
	private static final int HOUSE_WIDTH = 350; // in pixels
	private static final int HOUSE_HEIGHT = 250; // not including roof
	private static final int ROOF_HEIGHT = 76;
	
/* Dimensions of the windows */
	private static final int PANE_WIDTH = 23;
	private static final int PANE_HEIGHT = 33;
	private static final int X_PANES_UPSTAIRS = 3;
	private static final int Y_PANES_UPSTAIRS = 3;
	private static final int X_PANES_DOWNSTAIRS = 2;
	private static final int Y_PANES_DOWNSTAIRS = 2;
	
/* Dimensions of the front door */
	private static final int DOOR_WIDTH = 47;
	private static final int DOOR_HEIGHT = 100; 
}
