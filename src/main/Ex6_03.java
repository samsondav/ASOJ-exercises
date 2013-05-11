package main;

import acm.program.*;
import acm.util.RandomGenerator;

/*
 * Generate a value for pi using Monte Carlo integration
 * Use concept of dart board
 * Simulate throwing darts at the board. The ratio of area of the circle to the board
 * is pi / 4
 * 
 * Generate two random numbers x and y, each in range -1 to 1.
 * The point x, y lies inside the circle if x^2 + y^2 < 1
 * 
 * Simulate throwing 10,000 darts then display an approximate value for pi
 */
public class Ex6_03 extends ConsoleProgram {
	public void run() {
		double x;
		double y;
		int countInCircle = 0;
		int countOutOfCircle = 0;
		println("Generating approximate value for pi using Monte Carlo method with " + ITERATIONS + " iterations.");
		println("Calculating...");
		for (int i = 0; i < ITERATIONS; i++) {
			x = randomCoord();
			y = randomCoord();
			if (dartInCircle(x, y)) {
				countInCircle += 1;
			} else {
				countOutOfCircle += 1;
			}
			// user friendly updates every 100000 iterations
			if (i % 10000000 == 0) {
				println("Iteration: " + i);
			}
		}
		double pi = piApprox(countInCircle, countOutOfCircle);
		println("Approximate value for pi = " + pi);
	}
	
/**
 * given the proportion of counts inside and outside a circle on a square background,
 * calculate an approximation for pi
 * 
 * @param inCircle - number of hits inside circle
 * @param outCircle - number of hits outside circle but inside framing square
 * @return double pi
 */
	private double piApprox(double inCircle, double outCircle) {
		double pi = 4 * (inCircle / (inCircle + outCircle));
		return pi;
	}
/**
 * Generates a random coordinate between -1 and 1
 * 
 * @return double random number from -1 to 1
 */
	private double randomCoord() {
		return rgen.nextDouble(-1.0, 1.0);
	}
	
/**
 * Converts dart coordinates into boolean depending if inside
 * a circular target on a square board
 * 
 * @param x coordinate of dart
 * @param y coordinate of dart
 * @return if the dart is in the target, return true. Else, return false
 */
	private boolean dartInCircle(double x, double y) {
		if (x * x + y * y < 1 ) {
			return true;
		} else {
			return false;
		}
	}
/* private constants */
	private static final int ITERATIONS = 100000000; // number of random "darts" to throw
	
/* create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
