package main;

/* File: LibraryRecordTest.java
 * ----------------------------
 * Simple test of the LibraryRecord class.
 */

import acm.program.*;

public class LibraryRecordTest extends ConsoleProgram {

	public void run() {
		LibraryRecord newBook = new LibraryRecord("Harry Potter 8", "J.K. Rowling", 987654321, "Shiny new publishers, inc", 2013);
		LibraryRecord oldBook = new LibraryRecord("Ancient scroll", "Some old dude", 12345, "Gutenberg press, inc", 1645, false);
		LibraryRecord selfhelpBook = new LibraryRecord("How to be rich like Bill Gates", "Smarmy bastard", 777777777, "Awesome publishing, co", 2000);
		println(oldBook.toString());
		println(newBook.getTitle() + " was published in " + newBook.getYearOfPublication());
		if (selfhelpBook.isCirculating()) {
			println(selfhelpBook.toString() + " is in circulation");
		} else {
			println(selfhelpBook.toString() + " is NOT in circulation");
		}
	}
}
