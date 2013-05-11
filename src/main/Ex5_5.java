package main;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Ex5_5 extends GraphicsProgram {	
	
	/* draw image of archery target with center dot plus 2 rings
	 * 
	 */
	public void run() {
		double xCenter = getWidth() / 2;
		double yCenter = getHeight() / 2;
		double ringThickness = (OUTER_RADIUS - INNER_RADIUS) / (N_CIRCLES - 1);
		// draw Target, putting down circles from outside in
		for (int i = (N_CIRCLES - 1); i >= 0; i--) {
			/* i specifies ring number, innermost circle is 0, outermost is N_CIRCLES - 1 */
			if (i % 2 == 0) {
				add(createFilledCircle(xCenter, yCenter, (INNER_RADIUS + i * ringThickness), Color.red));
			} else if (i % 2 != 0) {
				add(createFilledCircle(xCenter, yCenter, (INNER_RADIUS + i * ringThickness), Color.white));
			}
		}
	}
	/*
	 * Create a circular GOval object centered at (x, y) with radius r.
	 * The GOval is set to be filled and colored in the specified color.
	 */
	private GOval createFilledCircle(double x, double y, double r, Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	/* Private constants */
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}
