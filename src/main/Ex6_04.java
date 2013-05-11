package main;

/*
 * Write a program that simulates the decay of a sample that contains
 * 10,000 atoms of radioactive material.
 * Each atom has a 50% chance of decaying in a given year.
 * The output of the program should show the number of atoms remaining at
 * the end of each year.
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class Ex6_04 extends ConsoleProgram {
	public void run() {
		println("There are " + N_ATOMS + " atoms initially");
		int count = 1;
		int n = N_ATOMS;
		
		while (true) {
			n = nDecayed(n);
			println("There are " + n + " atoms at the end of year " + count);
			count += 1;
			if (n == 0) {
				break;
			}
		}
	}
	
	/**
	 * For a number of atoms, return number remaining after randomly decaying
	 * each atom at a 50% probability
	 * @param n = number of initial atoms
	 * @return nDecayed = number of atoms remaining
	 */
	private int nDecayed(int n) {
		int nDecayed = 0;
		for (int i = 0; i < n; i++) {
			if (rgen.nextBoolean()) {
				nDecayed += 1;
			}
		}
		return nDecayed;
	}
/* private constants */
	private static final int N_ATOMS = 10000; //number of initial atoms in sample

/* create random number generator instance */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
