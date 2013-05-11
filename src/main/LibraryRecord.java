package main;
/* Exercise 6_09 from The Art and Science of Java
 * 
 * Using the Student class from Figure 6-5 as a model, implement a new class
 * called LibraryRecord that keeps track of the following information for a 
 * library book:
 * 
 * Title
 * Author
 * Library of Congress catalog number
 * Publisher
 * Year of Publication
 * Whether the book is circulating or not circulating
 * 
 */

/**
 * The LibraryRecord class keeps track of the following pieces of data
 * about a library book: the title, the author, the LoC catalog number,
 * the publisher, the year of publication, whether the book is circulating
 * or non-circulating.
 * All of this information is entirely private to the class.
 * Clients can obtain this data only by using the various methods
 * defined by the class.
 */

public class LibraryRecord {
		
/**
 * Creates a new LibaryRecord object with the specified title, author, LoC number,
 * publisher, year of publication.
 *
 * Note: initialises book circulation to true
 */
	public LibraryRecord(String title, String author, int loc, String publisher, int year) {
		bookTitle = title;
		bookAuthor = author;
		bookLOC = loc;
		bookPublisher = publisher;
		bookYear = year;
		bookIsCirculating = true;
	}
	
/**
 * Creates a new LibaryRecord object with the specified title, author, LoC number,
 * publisher, year of publication and whether circulating or not.
 * 
 */
	public LibraryRecord(String title, String author, int loc, String publisher, int year, boolean isCirculating) {
		this(title, author, loc, publisher, year);
		this.bookIsCirculating = isCirculating;
	}
		
/**
 * Gets the title of this book.
 * @return The title of the book
 */
	public String getTitle() {
		return bookTitle;
	}

/**
 * Gets the author of this book.
 * @return The author of this book
 */
	public String getAuthor() {
		return bookAuthor;
	}

/**
 * Gets this book's Library of Congress number
 * @return The LoC of this book
 */
	public int getLOC() {
		return bookLOC;
	}

/**
 * Gets the publisher of this book.
 * @return The publisher of this book
 */
	public String getPublisher() {
		return bookPublisher;
	}

/**
 * Gets the year the book was published.
 */
	public int getYearOfPublication() {
		return bookYear;
	}

/**
 * Returns whether the book is circulating or not.
 * @return Whether the book is circulating
 */
	public boolean isCirculating() {
		return bookIsCirculating;
	}

/**
 * Sets the circulating flag
 * @params boolean Flag - set true if book is circulating, false if not
 */
	public void setCirculating(boolean flag) {
		this.bookIsCirculating = flag;
	}
	
/**
 * Creates a string identifying this student.
 * @return The string used to display this book
 */
	public String toString() {
		return bookTitle + " by " + bookAuthor;
	}

/* Private instance variables */
	private String bookTitle;
	private String bookAuthor;
	private int bookLOC;
	private String bookPublisher;
	private int bookYear;
	private boolean bookIsCirculating;
}
