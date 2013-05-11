package main;

/*
 * calculate number of people/things coming from St Ives
 * Number of things:
 * A man with seven wives
 * each wife has seven sacks
 * each sack has seven cats
 * each cat has seven kits
 */

import acm.program.*;

public class Ex3_9 extends ConsoleProgram {
	public void run() {
		println("How many were coming FROM St Ives?");
		int total = MEN * WIVES_PER_MAN * SACKS_PER_WIFE * CATS_PER_SACK * KITS_PER_CAT;
		total += MEN; /* increment to include the extra man/men */
		println("Answer: " + total);
	}
	/* constants */
	private static final int MEN = 1;
	private static final int WIVES_PER_MAN = 7;
	private static final int SACKS_PER_WIFE = 7;
	private static final int CATS_PER_SACK = 7;
	private static final int KITS_PER_CAT = 7;
}
