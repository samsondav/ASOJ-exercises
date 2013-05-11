package main;

/*
 * display integers between 1 and 100 that are
 * divisible by EITHER 6 or 7 but not both
 */

import acm.program.*;

public class Ex4_4 extends ConsoleProgram {
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (i % 6 == 0 && i % 7 == 0) {
				// special case, do nothing
			} else if (i % 6 == 0 || i % 7 == 0) {
				println(i);
			}
		}
	}
}
