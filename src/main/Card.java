package main;

/*
 * Exercise 6_08 from The Art and Science of Java
 * 
 * Implement a new class called Card that includes the following entries:
 * 
 * 1) Named constants for the four suits
 * CLUBS, DIAMONDS, HEARTS, SPADES
 * and the four ranks traditionally represented in words (ACE, JACK, QUEEN, KING)
 * The value of the rank constants should be 1, 11, 12, 13
 * 
 * 2) A constructor that takes a rank and a suit and returns a Card with those values
 * 
 * 3) Getter methods getRank and getSuit that retrieve rank and suit components of a card
 * 
 * 4) An implementation of toString that returns the complete name of the card, as in exercise 1
 * 
 */

import acm.program.*;

/**
 * The Card class is used to represent playing cards
 * @author tom
 *
 */
public class Card extends ConsoleProgram {
	
	/**
	 * Creates a new Card object with the specified suit and rank
	 * 
	 * Rank index corresponds to cards logically - ACE: 1, 2: 2 etc
	 * 0, 1, 2, 3 correspond to SPADES, CLUBS, HEARTS, DIAMONDS respectively
	 * 
	 * @param rank The card rank as an integer from 1 to 13
	 * @param suit The card suit as an integer from 0 to 3
	 */
	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
	}
	
	/**
	 * Gets the rank of this card
	 * @return integer rank of card from 1 to 13
	 */
	public int getRank() {
		return cardRank;
	}
	
	/**
	 * Gets the suit of this card
	 * @return The suit of the card as a string
	 */
	public String getSuit() {
		return indexToSuit(cardSuit);
	}
	
	/**
	 * Creates a string identifying the playing card.
	 * Example format: "Ace of Spades" or "2 of Clubs"
	 * @return The string used to display this card
	 */
	public String toString() {
		String cardName = indexToRank(cardRank) + " of " + indexToSuit(cardSuit);
		return cardName;
	}
	
	/**
	 * convert integer index to card suit
	 * @param index of suit
	 * @return Suit name as string
	 */
	private String indexToSuit(int index) {
		switch (index) {
		case 0: return "Spades";
		case 1: return "Clubs";
		case 2: return "Hearts";
		case 3: return "Diamonds";
		default: return "NullSuit";
		}
	}
	
	/**
	 * convert integer index to card rank for named cards
	 * @param index of card - should be 1, 11, 12 or 13
	 * @return Rank name as string
	 */
	private String indexToRank(int index) {
		switch (index) {
		case 1: return "Ace";
		case 11: return "Jack";
		case 12: return "Queen";
		case 13: return "King";
		default: return "" + index;
		}
	}
	/* named constants */
	private int cardSuit; //suit of the card as integer. 0, 1, 2, 3 correspond to SPADES, CLUBS, HEARTS, DIAMONDS respectively
	private int cardRank; //rank index of card from 1 - 13
}
