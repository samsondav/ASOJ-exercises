package main;

import acm.program.*;
/*
 * write a predicate method isPerfect(n) that returns true if n is perfect, false otherwise
 * a perfect number is a number that is equal to the sum of it's proper divisors.
 * 
 * e.g:
 * 6 is a perfect number because it is the sum of 1, 2 and 3 which are integers
 * less than 6 that divide evenly into six (proper divisors)
 * 
 * similarly, so is 28 because it is the sum of 1, 2, 4, 7 and 14
 * 
 */
public class Ex5_12 extends ConsoleProgram {
	public void run() {
		println("Testing for perfect numbers in range a to b...");
		int a = readInt("enter a: ");
		int b = readInt("enter b: ");
		println("Testing...");
		for (int i = a; i <= b; i++) {
			if (isPerfect(i)) {
				println(i + " is PERFECT :)");
			}
		}
	}
	private boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		} else { 
		return false;
		}
	}

}
