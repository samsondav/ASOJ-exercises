package main;
/*
 * File: DrawStarMap.java
 * ----------------------
 * This program creates a five-pointed star every time the
 * user clicks the mouse on the canvas.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class DrawStarMap extends GraphicsProgram {

/* Initialize the mouse listeners */
	public void init() {
		addMouseListeners();
	}

/* Called whenever the user clicks the mouse */
	public void mouseClicked(MouseEvent e) {
		GRect star = new GRect(STAR_SIZE, STAR_SIZE);
		star.setFilled(true);
		add(star, e.getX(), e.getY());
	}

/* Private constants */
	private static final double STAR_SIZE = 20;

}
