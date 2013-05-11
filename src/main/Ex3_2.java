package main;

/*
 * Read two numbers: account balance and an annual interest rate expressed as a percentage
 * Display new balance after one year
 * Display new balance after two years
 */

import acm.program.*;

public class Ex3_2 extends ConsoleProgram {
	public void run() {
		println("Interest calculation program");
		println("Enter starting balance: ");
		double balance = readDouble();
		println("Enter annual interest rate: ");
		double rate = readDouble();
		double balanceAfterOneYear = balance + (balance * (rate / 100));
		balance = balanceAfterOneYear;
		double balanceAfterTwoYears = balance + (balance * (rate / 100));
		println("Balance after one year = " + balanceAfterOneYear);
		println("Balance after two years = " + balanceAfterTwoYears);
	}
}
