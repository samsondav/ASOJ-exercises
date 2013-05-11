package main;

/*
 * Write a program that poses a series of simple arithmetic problems for a student to answer
 * 
 * 1) It should ask five questions (coded as named constant)
 * 2) Each question should consist of a single addition or subtraction problem involving two numbers
 * 3) None of the numbers involved, including the answer, should be less than 0 or greater than 20
 * 4) The program should give the student three chances to answer the question.
 * ---If correct, indicate it and go on to next question
 * ---If not correct after three tries, give the correct answer and go on to another problem
 */

import acm.program.*;
import acm.util.*;

public class Ex6_07 extends ConsoleProgram {
	public void run() {
		println("Welcome to Maths Quiz - the lamest program ever written!");
		int answer;
		int a;
		int b;
		int counter;
		
		for(int i = 0; i < NUM_ROUNDS; i++) {
			/* loop generates random integers, keeping range between MIN and MAX inclusive */
			while (true) {
				a = rgen.nextInt(MIN, MAX);
				b = rgen.nextInt(MIN, MAX);
				if (a + b >= MIN && a + b <= MAX){
					break;
				}
			}
			answer = readInt("What is " + a + " + " + b + "? ");
			counter = 1;
			while (true) {
				if (answer == (a + b)) {
					println(gratzMessage());
					break;
				} else if (counter == MAX_TRIES) {
					println(UBER_FAILZ + (a + b));
					break;
				} else {
					answer = readInt(FAILZ);
					counter +=1;
				}
			}
		}
	}
	
	/**
	 * @returns a random message of congratulations
	 */
	private String gratzMessage() {
		switch (rgen.nextInt(0, 3)) {
		case 0: return "you're a fucking genius";
		case 1: return "gratz mofo, you can do 1st grade maths";
		case 2: return "get yourself a cookie, that was the right answer";
		case 3: return "WTF? That's right - you're not as stupid as you look...";
		default: return "HEAD EXPLOSION - something went wrong with the warp core captain...";
		}
	}
	/* RandomGenerator instance for this class */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	/* private constants */
//	private static final String GRATZ = "gratz mofo, you can do 1st grade maths"; // lame congratulatory text
	private static final String FAILZ = "no, that's wrong - try again: "; // print this if user got it wrong
	private static final String UBER_FAILZ = "Jesus Christ, are you retarded? The answer is "; //print if the user got it wrong more than MAX_TRIES times
	
	private static final int MIN = 0;
	private static final int MAX = 20; //apparently the kids can't count beyond 20 so keep ALL integers including answers in this range
	private static final int MAX_TRIES = 3; // the user gets this many tries to get a question right, otherwise we print answer and move on to the next
	
	private static final int NUM_ROUNDS = 5; // ask five different problems
}
