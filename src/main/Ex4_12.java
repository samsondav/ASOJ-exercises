package main;

/*
 * read in list of integers, one per line until user enters SENTINEL
 * when SENTINEL is read, display largest value in list
 */

import acm.program.*;

public class Ex4_12 extends ConsoleProgram {
	/* private constants */
	private static final int SENTINEL = 0;
	
	public void run() {
		println("This program finds the largeset integer in a list.");
		println("Enter values, one per line, using a 0 to signal the end of the list.");
		int nLargest = 0; //initialise variable
		while (true) {
			int n = readInt(" ? ");
			if (n > nLargest) {
				nLargest = n;
			}
			if (n == 0) break; //break when we see a SENTINEL
		}
		println("The largest value is "+ nLargest);
	}
}
