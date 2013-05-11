package main;

/*
 * generate lyrics to bottles of beer
 */

import acm.program.*;

public class Ex4_1 extends ConsoleProgram {
	public void run(){
		println("This program prints the annoying lyrics of 'bottles of beer'");
		int nBottles = readInt("How many bottles would you like to start with? ");
		/* print the annoying lyrics */
		for (int i = nBottles; i > 0 ; i--) {
			println(i + " bottle" + (i == 1 ? "" : "s") + " of beer on the wall.");
			println(i + " bottle" + (i == 1 ? "" : "s") + " of beer.");
			println("You take one down, pass it around,");
			if (i == 0) break;
			println((i - 1) + " bottle" + ((i - 1) == 1 ? "" : "s") + " of beer on the wall!");
			println("");
		}
	}
}