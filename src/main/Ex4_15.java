package main;

/*
 * -- BouncingBall --
 * bounce a ball inside the boundaries of a graphics window:
 * 
 * 1) begin by placing a GOval in the center to represent the ball
 * 2) on each time step, shift the position of the ball by dx and dy pixels,
 * where dx and dy initially have value 1
 * 3) when the leading edge of the ball touches a window boundary, make ball bounce
 * by negating dx or dy as appropriate
 * 
 * run the animation for an infinite length of time
 * 
 */

import acm.graphics.*;
import acm.program.*;

public class Ex4_15 extends GraphicsProgram {

	public void run() {
		double xInitial = (getWidth() - BALL_SIZE) / 2;
		double yInitial = (getHeight() - BALL_SIZE) /2;
		GOval ball = new GOval(xInitial, yInitial, BALL_SIZE, BALL_SIZE);
		ball.setFilled(true);
		add(ball);
		int dx = DX_STEP;
		int dy = DY_STEP;
		while(true) {
			ball.move(dx, dy);
			pause(PAUSE_TIME);
			println("Coordinates of ball = (" + ball.getX() + ", " + ball.getY() + ")");
			println("Bounding coordinates = (" + getWidth() + ", " + getHeight() + ")");
			if ((ball.getX() >= (getWidth() - BALL_SIZE)) || ball.getX() <= 0) {
				dx = -dx;
			}
			if ((ball.getY() >= (getHeight() - BALL_SIZE)) || ball.getY() <= 0) {
				dy = -dy;
			}
		}
	}

/* Private constants */
	private static final int DX_STEP = 1; //in pixels
	private static final int DY_STEP = 1; //in pixels
	private static final int PAUSE_TIME = 1;
	private static final double BALL_SIZE = 50;

}
