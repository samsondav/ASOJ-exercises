package main;

/*
 * read in a temperature in degrees Fahrenheit,
 * return corresponding temperature in Celsius
 */

import acm.program.*;

public class Ex3_5 extends ConsoleProgram {
	public void run(){
		println("This program converts Fahrenheit to Celsius");
		println("Enter Fahrenheit temperature: ");
		double tempFahrenheit = readDouble();
		/* standard conversion formula */
		double tempCelsius = (tempFahrenheit - 32) * (5.0 / 9.0);
		println("Celsius equivalent = " + tempCelsius);
	}
}
