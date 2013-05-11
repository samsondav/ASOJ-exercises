package main;
/*
 * Simple test of the Card class
 */

import acm.program.*;

public class CardTest extends ConsoleProgram {
	public void run() {
		Card a = new Card(1, 0); // ace of spades
		Card b = new Card(10, 1); // 10 of clubs
		Card c = new Card(11, 3); // jack of diamonds
		Card d = new Card(12, 2); // queen of hearts
		println(a.toString());
		println("rank = " + a.getRank());
		println("suit = " + a.getSuit());
		println(b.toString());
		println("rank = " + b.getRank());
		println("suit = " + b.getSuit());
		println(c.toString());
		println("rank = " + c.getRank());
		println("suit = " + c.getSuit());
		println(d.toString());
		println("rank = " + d.getRank());
		println("suit = " + d.getSuit());
	}
}
