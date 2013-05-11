package main;

/*
 * write a predicate method askYesNoQuestion(prompt) that does the following:
 * print String prompt as a question and wait for response
 * if user enters yes, return true
 * if user enters no, return false
 * if user enters anything else, gently remind user we need a yes or no answer and repeat the question
 */

import acm.program.*;

public class Ex5_7 extends ConsoleProgram {
	public void run() {
		boolean mrBool = askYesNoQuestion("Would you like instructions? ");
		println("User-entered value was evaluated to be: " + mrBool);
	}
	private boolean askYesNoQuestion(String prompt) {
		int easter = 0;
		String response;
		while (true) {
			response = readLine(prompt);
			if (response.equals("yes")) {
				return true;
			} else if (response.equals("no")) {
				return false;
			} else if (easter < 3) {
				println("Please answer yes or no.");
				easter += 1;
			} else {
				println("Just freakin' write yes or no. It's not that hard, buckwheat.");
			}
		}
	}
}
