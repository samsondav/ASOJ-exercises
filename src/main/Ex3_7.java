package main;

/*
 * convert metric weight in kg to lb and oz.
 */

import acm.program.*;

public class Ex3_7 extends ConsoleProgram {
	public void run() {
		println("This program converts kilograms into pounds and ounces");
		println("Enter a number of kilograms: ");
		double kilos = readDouble();
		double totalOunces = kilos * POUNDS_IN_KILO * OUNCES_IN_POUND;
		int pounds = ((int) totalOunces) / OUNCES_IN_POUND;
		double remainderOunces = totalOunces - (OUNCES_IN_POUND * pounds);
		println("That's " + pounds + "lb and " + remainderOunces + " ounces");
	}
	/* constants */
	private static final double POUNDS_IN_KILO = 2.2;
	private static final int OUNCES_IN_POUND = 16;
}
