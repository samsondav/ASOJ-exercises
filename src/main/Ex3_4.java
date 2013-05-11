package main;

/*
 * Ask user for radius of a circle and compute area
 */

import acm.program.*;

public class Ex3_4 extends ConsoleProgram {
	public void run() {
		println("This program computes the area of a circle");
		println("Input radius: ");
		double radius = readDouble();
		double area = (radius * radius) * VALUE_OF_PI;
		println("Area of circle with radius " + radius + " is " + area);
	}
	
	/* static constants */
	private static final double VALUE_OF_PI = 3.14159265359;
}
