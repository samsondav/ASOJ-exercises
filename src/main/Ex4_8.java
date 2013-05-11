package main;

/*
 * This program counts backwards from the value START
 * to zero, as in the countdown preceding a rocket
 * launch.
 * 
 * Rewrite to use while loop.
 */

import acm.program.*;

public class Ex4_8 extends ConsoleProgram {

/* Specifies the value from which to start counting down */
	private static final int START = 10;

	public void run() {
		int t = START;
		while (t >= 0) {
			println(t);
			t -=1;
		}
		println("Liftoff!");
	}

}
