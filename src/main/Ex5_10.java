package main;

/*
 * draw Edgar Allan Poe's House of Usher
 */

import acm.program.*;
import acm.graphics.*;

public class Ex5_10 extends GraphicsProgram {
	public void run() {
		/* draw main house */
		double xHouseInitial = X_PADDING; //add some padding
		double yHouseInitial = getHeight() - TURRET_HEIGHT - Y_PADDING; //stupidly chose origin to be top left
		drawHouse(xHouseInitial, yHouseInitial);
		/* draw trees */
		double treeBlockHeight = TREE_HEIGHT * 2 / 3;
		double treeRoofHeight = TREE_HEIGHT * 1 / 3;
		double xTreesInitial = xHouseInitial + HOUSE_WIDTH + 2 * TURRET_WIDTH;
		double yTreesInitial = yHouseInitial + TURRET_HEIGHT - TREE_HEIGHT;
		drawTower((xTreesInitial + GARDEN_LENGTH / 3.0), yTreesInitial, TREE_WIDTH, TREE_HEIGHT, TREE_FRAC);
		drawTower((xTreesInitial + GARDEN_LENGTH * 2.0 / 3.0), yTreesInitial, TREE_WIDTH, TREE_HEIGHT, TREE_FRAC);
		drawTower((xTreesInitial + GARDEN_LENGTH), yTreesInitial, TREE_WIDTH, TREE_HEIGHT, TREE_FRAC);
	}
	// draw house at origin x, y
	private void drawHouse(double x, double y) {
		// draw both turrets
		drawTower(x, y, TURRET_WIDTH, TURRET_HEIGHT, TURRET_ROOF_FRAC);
		drawTower((x + TURRET_WIDTH + HOUSE_WIDTH), y, TURRET_WIDTH, TURRET_HEIGHT, TURRET_ROOF_FRAC);
		//draw house outline
		drawTower((x + TURRET_WIDTH), (y + (TURRET_HEIGHT - HOUSE_HEIGHT)), HOUSE_WIDTH, HOUSE_HEIGHT, HOUSE_ROOF_FRAC);
		//put windows
		double xWindowLeft = x + TURRET_WIDTH + HOUSE_WIDTH / 4;
		double yWindows = y + TURRET_HEIGHT - 0.75 * ((HOUSE_HEIGHT) * (1 - HOUSE_ROOF_FRAC));
		drawWindow(xWindowLeft, yWindows);
		drawWindow((xWindowLeft + HOUSE_WIDTH / 2), yWindows);
		// put door
		double xDoor = x + TURRET_WIDTH + (HOUSE_WIDTH - DOOR_WIDTH) / 2;
		double yDoor = y + TURRET_HEIGHT - DOOR_HEIGHT;
		drawTower(xDoor, yDoor, DOOR_WIDTH, DOOR_HEIGHT, 0.3); //hard coded door pointiness. so shoot me
	}
	// draw pointy tower at origin x, y. Variable roofFrac specifies height of roof as a fraction of the height of the whole tower
	private void drawTower(double x, double y, double width, double height, double roofFrac) {
		double roofHeight = height * roofFrac;
		double blockHeight = height - roofHeight;
		add(new GRect(x, (y + roofHeight), width, blockHeight));
		// left side of roof
		add(new GLine(x, (y + roofHeight), (x + width / 2), y));
		// right side of roof
		add(new GLine((x + width / 2), y, (x + width), (y + roofHeight)));
	}
	// draw a circular window with CENTER x, y
	private void drawWindow(double x, double y) {
		double x0 = x - WINDOW_DIAMETER / 2;
		double y0 = y - WINDOW_DIAMETER / 2;
		add(new GOval(x0, y0, WINDOW_DIAMETER, WINDOW_DIAMETER));
	}
/* Fudge factors */
	private static final int X_PADDING = 10; // padding to left of house on pixels
	private static final int Y_PADDING = 10; // padding underneath house on pixels

/* House dimensions */
	private static final int HOUSE_WIDTH = 200; // width of house not including turrets
	private static final int HOUSE_HEIGHT = 350; // height of house
	private static final double HOUSE_ROOF_FRAC = 0.4; // fraction of house which is roof - relative, NOT pixels

	private static final int WINDOW_DIAMETER = 40; // in pixels
	private static final int DOOR_HEIGHT = 100; //in pixels
	private static final int DOOR_WIDTH = 40; //in pixels
/* Turret dimensions */
	private static final int TURRET_HEIGHT = 400; // height of turrets to either side of house
	private static final int TURRET_WIDTH = 50; // width of turrets
	private static final double TURRET_ROOF_FRAC = 0.2; // fraction of turrent which is pointy
	
/* Tree dimensions */
	private static final int TREE_HEIGHT = 250; // height of decayed trees
	private static final int TREE_WIDTH = 30; // width of trees
	private static final double TREE_FRAC = 0.4; // fraction of tree which is pointy
	private static final int GARDEN_LENGTH = 300; // length of tree garden
}
