package main;

/*
 * simulate flipping a coin repeatedly and continue until three
 * consecutive heads are tossed.
 * Then display the total number of times the coin was flipped
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class Ex6_02 extends ConsoleProgram {
	public void run() {
		// this program interally represents boolean value of 1 as heads, 0 as tails
		boolean previousFlip;
		int consecutiveHeads = 0;
		boolean previousIsHeads = false;
		int counter = 0;
		boolean isHeads;
		
		while (true) {
			isHeads = rgen.nextBoolean();
			counter += 1;
			println(headsOrTails(isHeads));
			if (isHeads && previousIsHeads) {
				consecutiveHeads += 1;
			} else {
				consecutiveHeads = 0; // reset counter
			}
			if (consecutiveHeads == 2) {
				println("It took " + counter + " flips to get 3 consecutive heads");
				break;
			}
			previousIsHeads = isHeads;
		}
	}

/**
 * takes a boolean index true or false and returns a string "Heads or tails"
 * 
 * @return string "Heads" or "Tails"
 */
	private String headsOrTails(boolean isHeads) {
		if (isHeads) {
			return("Heads");
		} else {
			return("Tails");
		}
	}
	
/* create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
