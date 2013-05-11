package main;

/*
 * calculate digital root of an integer
 * digital root defined as summing digits of an integer repeatedly
 * until only a single digit remains
 * 
 * it's dumb but it works like this example:
 * 
 * 1729 --> 1 + 7 + 2 + 9 = 19
 * 19 --> 1 + 9 = 10
 * 10 --> 1 + 0 = 1
 * answer = 1
 * 
 */

import acm.program.*;

public class Ex4_7 extends ConsoleProgram {
	
	public void run() {
		println("This program finds the digital root of an integer.");
		int n = readInt("Enter a positive integer: ");
		int dsum = 0;
		while (true) {
			while (n > 0) { 	// digitsum loop
				dsum += n % 10;
				n /= 10;
			}
			/* break when condition reached: dsum only one digit long */
			if (dsum / 10 == 0) break;
			n = dsum;
			dsum = 0; // must reset dsum before running digitsum loop again
		}
		println("The digital root is " + dsum);
	}

}
