package main;

/*
 * return number of digits in a positive integer n
 * 
 */
import acm.program.*;


public class Ex5_4 extends ConsoleProgram {
	public void run () {
		int n = readInt("Count digits in an integer. Enter integer: ");
		println("Number of digits in " + n + " is " + countDigits(n));
	}
	
	/* take positive integer n and return number of digits */
	private int countDigits(int n) {
		int count = 0;
		while (n > 0) {
			count += 1;
			n /= 10;
		}
		return count;
	}
}
