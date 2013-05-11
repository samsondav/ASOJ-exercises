package main;

/*
 * compute quadratic equation for abitrary user-defined coefficients
 */
import acm.program.*;

public class Ex5_1 extends ConsoleProgram {
	public void run() {
		println("Enter coefficients for the quadratic equation:");
		double a = readDouble("a: ");
		double b = readDouble("b: ");
		double c = readDouble("c: ");
		double discriminant = b * b - 4 * a * c;
		if (discriminant < 0) {
			println("Equation has no real roots");
		} else {
			double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			println("First solution is " + x1);
			println("Second solution is " + x2);
		}
	}
}
