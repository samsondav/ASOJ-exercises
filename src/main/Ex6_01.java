package main;

/*
 * display the name of a card randomly chosen from a complete
 * deck of 52 playing cards. Each card consists of a rank
 * (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
 * and a suit (clubs, diamonds, hearts, spades)
 * Your program should display the complete name of the card
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class Ex6_01 extends ConsoleProgram {
	public void run() {
		println("This program displays a randomly chosen card.");
		int randomCardIndex;
		int randomCardSuit;
		while (true) {
			randomCardIndex = rgen.nextInt(1, 13);
			randomCardSuit = rgen.nextInt(0, 3);
			println(indexToName(randomCardIndex) + " of " + indexToSuit(randomCardSuit));
			readLine("Press enter to generate another...");
		}
	}
/** Convert card index to proper name. If out of range integer is supplied,
 *  method returns "Joker"
 * 
 * @param index of playing card in range 1-13
 * @return name of playing card as string
 */
	private String indexToName(int n) {
		if (n == 1) {
			return("Ace");
		} else if (n == 11) {
			return("Jack");
		} else if (n == 12) {
			return("Queen");
		} else if (n == 13) {
			return("King");
		} else if (n > 1 && n < 11) {
			return("" + n); //cast integer to string
		} else {
			return("Joker");
		}
	}
/**
 * Convert index in range 0 - 3 to a card suit.
 * Order is: Spades, Clubs, Hearts, Diamonds
 * If out of range index is supplied, method returns "Null"
 * 
 * @param index of suit in range 0 - 3
 * @return suit as string
 */
	private String indexToSuit(int n) {
		switch (n) {
			case 0: return("Spades");
			case 1: return("Clubs");
			case 2: return("Hearts");
			case 3: return("Diamonds");
			default: return("Null");
		}
	}
	
/* create an instance variable for the random number generator */
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
