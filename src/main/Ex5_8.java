package main;
/*
 * file: Ex5_8.java
 * ----------------
 * This program draws a three-car train consisting on an engine,
 * a boxcar, and a caboose. 
 * -- COMPLETE --
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Ex5_8 extends GraphicsProgram {

	public void run() {
		double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
		double x = (getWidth() - trainWidth) / 2;
		double y = getHeight();
		double dx = CAR_WIDTH + CONNECTOR;
		drawEngine(x, y);
		drawBoxcar(x + dx, y, Color.GREEN);
		drawCaboose(x + 2 * dx, y);
	}

/* Draws an engine whose origin is at (x, y) */
	private void drawEngine(double x, double y) {
		drawCarFrame(x, y, Color.BLACK);
		drawSmokestack(x, y);
		drawEngineCab(x, y);
		drawCowcatcher(x, y);
	}

/* Draws the smokestack */
	private void drawSmokestack(double x, double y) {
		// complete //
		double x0 = x + CONNECTOR + SMOKESTACK_INSET;
		double y0 = y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT;
		GRect smokestack = new GRect(x0, y0, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
		smokestack.setColor(Color.BLACK);
		smokestack.setFilled(true);
		add(smokestack);
	}

/* Draws the engine cab */
	private void drawEngineCab(double x, double y) {
		// complete //
		double x0 = x + CONNECTOR + CAR_WIDTH - CAB_WIDTH;
		double y0 = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
		GRect cab = new GRect(x0, y0, CAB_WIDTH, CAB_HEIGHT);
		cab.setColor(Color.black);
		cab.setFilled(true);
		add(cab);
	}

/* Draws the cowcatcher in the front of the engine */
	private void drawCowcatcher(double x, double y) {
		// complete //
		double cWidth = CONNECTOR; // set width of cowcatcher
		double cHeight = CAR_HEIGHT / 2; // set height of cowcatcher
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		add(new GLine((x0 - cWidth), y0, x0, (y0 - cHeight)));
		add(new GLine((x0 - cWidth / 2), y0, x0, (y0 - cHeight)));
		add(new GLine((x0 - cWidth), y0, x0, y0));
	}

/* Draws a boxcar in the specified color */
	private void drawBoxcar(double x, double y, Color color) {
		drawCarFrame(x, y, color);
		double xRight = x + CONNECTOR + CAR_WIDTH / 2;
		double xLeft = xRight - DOOR_WIDTH;
		double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
		add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
		add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
	}

/* Draws a red caboose */
	private void drawCaboose(double x, double y) {
		// complete //
		drawCarFrame(x, y, Color.RED);
		double xCupola = x + CONNECTOR + (CAR_WIDTH - CUPOLA_WIDTH) / 2;
		double yCupola = y - CAR_BASELINE - CAR_HEIGHT - CUPOLA_HEIGHT;
		GRect cupola = new GRect(xCupola, yCupola, CUPOLA_WIDTH, CUPOLA_HEIGHT);
		cupola.setFilled(true);
		cupola.setFillColor(Color.RED);
		add(cupola);
	}

/* Draws the common part of a train car */
	private void drawCarFrame(double x, double y, Color color) {
		double x0 = x + CONNECTOR;
		double y0 = y - CAR_BASELINE;
		double top = y0 - CAR_HEIGHT;
		add(new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
		drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
		drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
		GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
		r.setFilled(true);
		r.setFillColor(color);
		add(r);
	}

/* Draws a wheel centered at (x, y) */
	private void drawWheel(double x, double y) {
		double r = WHEEL_RADIUS;
		GOval wheel = new GOval(x - r, y - r, 2 * r, 2 * r);
		wheel.setFilled(true);
		wheel.setFillColor(Color.GRAY);
		add(wheel);
	}

/* Private constants */

/* Dimensions of the frame of a train car */
	private static final double CAR_WIDTH = 75;
	private static final double CAR_HEIGHT = 36;

/* Distance from the bottom of a train car to the track below it */
	private static final double CAR_BASELINE = 10;

/* Width of the connector, which overlaps between successive cars */
	private static final double CONNECTOR = 6;

/* Radius of the wheels on each car */
	private static final double WHEEL_RADIUS = 8;

/* Distance from the edge of the frame to the center of the wheel */
	private static final double WHEEL_INSET = 16;

/* Dimensions of the cab on the engine */
	private static final double CAB_WIDTH = 35;
	private static final double CAB_HEIGHT = 8;

/* Dimensions of the smokestack and its distance from the front */
	private static final double SMOKESTACK_WIDTH = 8;
	private static final double SMOKESTACK_HEIGHT = 8;
	private static final double SMOKESTACK_INSET = 8;

/* Dimensions of the door panels on the boxcar */
	private static final double DOOR_WIDTH = 18;
	private static final double DOOR_HEIGHT = 32;

/* Dimensions of the cupola on the caboose */
	private static final double CUPOLA_WIDTH = 35;
	private static final double CUPOLA_HEIGHT = 8;
}