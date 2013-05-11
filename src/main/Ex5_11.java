package main;

/*
 * Write a predicate method isPrime(n) that returns true if an integer is prime
 * Initially implement using brute force
 * Then try to come up with efficiency improvements
 */
import acm.program.*;

public class Ex5_11 extends ConsoleProgram {
	public void run() {
		int n;
		while (true) {
			n = readInt("Enter an integer: ");
			if (n == SENTINEL) {
				break;
			} else if (isPrime(n)) {
				println("Woo, you found one - n is prime.");
			} else {
				println("Sorry, n is NOT prime");
			}
		}
	}
	// returns true if n is prime, false if not prime
	private boolean isPrime(int n) {
		// prime finding algorithm 0.1 - BRUTE FORCE :D
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static final int SENTINEL = 0; //user entered sentinel terminates program
}
