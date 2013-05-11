package main;

/*
 * display values of the fibbonacci sequence smaller than 10,000
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

public class Ex4_10 extends ConsoleProgram {
	/* until what value do we print? */
	private static final int FINAL_VALUE = 10000; //warning, totals over 8 digits long cause overflow due to short int
	
	public void run() {
		int fNMinusTwo = 0;
		int fNMinusOne = 1;
		int fN = 0; //it's not really 0 but we are just initialising it here
		
		int n = 0; //counter to show term number
		while (true) {
			if (fN > FINAL_VALUE) break;
			n += 1;
			println("f" + n + " = " + fN);
			fNMinusTwo = fNMinusOne;
			fNMinusOne = fN;
			fN = fNMinusTwo + fNMinusOne;
		}
	}

}
