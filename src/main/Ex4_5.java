package main;

/*
 * read integers one per line until the
 * user enters a special sentinel value to signal the
 * end of the input. At that point, the program
 * prints out the average of the numbers entered so far.
 */

import acm.program.*;

public class Ex4_5 extends ConsoleProgram {

	public void run() {
		println("This program averages a list of integers.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		int total = 0;
		int count = 0;
		while (true) {
			int value = readInt(" ? ");
			if (value == SENTINEL) break;
			total += value;
			count += 1;
		}
		double average = (double) total / count;
		println("The average is " + average + ".");
	}

/* Private constants */
	private static final int SENTINEL = -1;  /* Specifies the end-of-data value */

}
