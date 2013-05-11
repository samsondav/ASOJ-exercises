package main;
/*
 * This program draws a traditional stoplight with a red, yellow,
 * and green light in a gray rectangular frame.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Ex5_6 extends GraphicsProgram {

	public void run() {
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;
		add(createFilledRect(cx, cy, FRAME_WIDTH, FRAME_HEIGHT, Color.GRAY));
		add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.RED));
		add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.YELLOW));
		add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.GREEN));
	}

/*
 * Creates a circular GOval object centered at (x, y) with radius r.
 * The GOval is set to be filled and colored in the specified color.
 */
	private GOval createFilledCircle(double x, double y, double r,
	                                 Color color) {
		GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
/*
 * Create a rectangular GRect object centered at (x, y) with dimensions (a, b).
 * Set GRect filled and colored in specified color.
 */
	private GRect createFilledRect(double x, double y, double a, double b, Color color) {
		GRect rect = new GRect(x - (a / 2), y - (b / 2), a, b);
		rect.setColor(color);
		rect.setFilled(true);
		return rect;
	}
/* Private constants */
	private static final double FRAME_WIDTH = 50;
	private static final double FRAME_HEIGHT = 100;
	private static final double LAMP_RADIUS = 10;

}
