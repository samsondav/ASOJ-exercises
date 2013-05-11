package main;

/*
 * raiseIntToPower
 * 
 */
import acm.program.*;


public class Ex5_3 extends ConsoleProgram {
	public void run () {
		println("Display table of values of 2^k for k = 0 through k = 10");
		for (int k = 0; k <= 10; k++) {
			println("2^" + k + " = " + raiseIntToPower(2, k));
		}
	}
	private int raiseIntToPower(int n, int k) {
		/* return n^k. only works for positive k */
		if (k == 0) {
			return 1; //by definition
		} else {
			int output = n;
			for (int i = 1; i < k; i++){
				output *= n;
			}
			return output;
		}
	}
}
