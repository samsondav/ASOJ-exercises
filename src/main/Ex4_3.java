package main;

/*
 * read in positive integer N
 * calculate and display sum of first N odd integers
 * 
 * e.g. if N = 4 then program should display 16
 * because 16 = 1 + 3 + 5 + 7
 *  
 */
import acm.program.*;

public class Ex4_3 extends ConsoleProgram {
	public void run() {
		println("This program calculates and displays the sum of the first N odd integers");
		int n = readInt("Enter a value for N: ");
		int total = 0; 	// initialise total variable
		for (int i = 1; i < (n * 2); i += 2) {
			total += i;
		}
		println("Result = " + total);
	}
}
