package main;

/*
 * Reverse the digits of a positive integer.
 */

import acm.program.*;

public class Ex4_6 extends ConsoleProgram {

	public void run() {
		println("This program reverses the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		int nReverse = 0;
		while (n > 0) {
			nReverse += n % 10;
			n = n / 10;
			/* break to avoid loop-and-a-half problem.
			 * otherwise we end up with an extra 0 at the end
			 */
			if (n == 0) break;
			nReverse *= 10;
		}
		println("The reversed number is " + nReverse);
	}

}
