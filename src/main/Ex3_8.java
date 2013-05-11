package main;

import acm.program.*;

/*
 * compute average of four integers
 */

public class Ex3_8 extends ConsoleProgram {
	public void run() {
		println("Compute average of four integers. Enter values below.");
		println("a = ");
		int a = readInt();
		println("b = ");
		int b = readInt();
		println("c = ");
		int c = readInt();
		println("d = ");
		int d = readInt();
		double average = ((double) (a + b + c + d)) / 4.0;
		println("average = " + average);
	}
}
