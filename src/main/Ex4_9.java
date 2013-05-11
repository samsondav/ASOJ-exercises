package main;

/*
 * display values f0 through f15 of the fibbonacci sequence
 * 
 * sequence:
 * 
 * f0 = 0
 * f1 = 1
 * f2 = 1 (f0 + f1)
 * f3 = 2 (f1 + f2)
 * f4 = 3 (f2 + f3)
 * f5 = 5 (f3 + f4)
 * f6 = 8 (f4 + f5)
 * etc...
 * 
 */

import acm.program.*;

public class Ex4_9 extends ConsoleProgram {
	/* how many terms of Fibbonacci to print */
	private static final int FINAL_TERM = 15; //warning, using short int overflows after n = 45
	
	public void run() {
		int fNMinusTwo = 0;
		int fNMinusOne = 1;
		int fN = 0; //it's not really 0 but we are just initialising it here
		for (int n = 0; n <= FINAL_TERM; n++) {
			println("f" + n + " = " + fN);
			fNMinusTwo = fNMinusOne;
			fNMinusOne = fN;
			fN = fNMinusTwo + fNMinusOne;
		}
	}

}
