package main;

import acm.program.*;
import acm.util.*;

public class Ex6_05 extends ConsoleProgram {
	public void run() {
		int wallet = INITIAL_STAKE;
		String response;
		
		while (true) {
			response = readLine("You have $" + wallet + ". Would you like to play? ");
			if (response.equals("yes")) {
				wallet -= COST_TO_PLAY;
				wallet += pullBanditArm();
			} else if (response.equals("no")) {
				break;
			} else {
				println("Enter yes or no.");
			}
		}
	}
	
/**
 * 	Simulates pulling arm of one arm bandit.
 *  Prints a line showing the results.
 *  
 *  In this method symbols are represented by the following indices:
 *  
 *  BAR - 0
 *  BELL - 1
 *  PLUM - 2
 *  ORANGE - 3
 *  CHERRY - 4
 *  LEMON - 5
 *  
 *  @return integer representing payout
 */
	private int pullBanditArm() {
		int wheel1 = spin();
		int wheel2 = spin();
		int wheel3 = spin();
		int payout = payout(wheel1, wheel2, wheel3);
		if (payout == 0) {
			println(symbolFromIndex(wheel1) + symbolFromIndex(wheel2) + symbolFromIndex(wheel3) + "-- You lose");
		} else {
			println(symbolFromIndex(wheel1) + symbolFromIndex(wheel2) + symbolFromIndex(wheel3) + "-- You win $" + payout);
		}
		return payout;
	}

/**
 * @params are indexes on each of the three wheels
 * @return integer amount of payout. If no payout, return 0.
 */
	private int payout(int a, int b, int c) {
		if (a == 0 && b == 0 && c == 0) return 250; // JACKPOT baby :D
		if (a == 1 && b == 1 && (c == 0 || c == 1)) return 20;
		if (a == 2 && b == 2 && (c == 0 || c == 2)) return 14;
		if (a == 3 && b == 3 && (c == 0 || c == 3)) return 10;
		if (a == 4) {
			if (b == 4) {
				if (c == 4) {
					return 7;
				} else {
					return 5;
				}
			} else {
				return 2;
			}
		}
		return 0;
		
	}
/**
 * @return a random integer between 0 and 5 inclusive, all of equal probability
 */
	private int spin() {
		return rgen.nextInt(0, 5);
	}
	
/**
 * @param index - an integer from 0 to 5 defining index of symbol
 * @return string - the human name of the symbol
 */
	private String symbolFromIndex(int index) {
		switch (index) {
		case 0: return("BAR    ");
		case 1: return("BELL   ");
		case 2: return("PLUM   ");
		case 3: return("ORANGE ");
		case 4: return("CHERRY ");
		case 5: return("LEMON  ");
		default: return("NULL");
		}		
	}
/* private constants */
	private static final int INITIAL_STAKE = 50; // initial stake in dollars
	private static final int COST_TO_PLAY = 1; // it costs a dollar to play
/* initialise private RandomGenerator instance */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}