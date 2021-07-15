package homework5;

/*
 * Define a class named Book that contains:
 * -- An int data field named pages that stores the number of pages of the book
 * -- A String data field named title that represents the title of the book
 * -- A constructor with parameters for initializing pages and title
 * -- The getter and setter methods for all data
 * -- A toString method that returns book information, including the book title 
 *    and the number of pages
 * -- The equals method that returns true if two books have the same title and 
 *    the same number of pages.
 * -- The compareTo method that compares two books and returns -1 if the first 
 *    book has less pages than the second one, 1 if the first book has more pages 
 *    than the second one, and 0 if both books have same number of pages as the second one.
 */

public class Book 
{
	private int pages;
	private String title;
	
	public Book(int pgs, String theTitle)
	{
		pages = pgs;
		title = theTitle;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setPages(int pgs)
	{
		pages = pgs;
	}
	
	public void setTitle(String theTitle)
	{
		title = theTitle;
	}
	
	public String toString()
	{
		return title + ": " + pages + " pages";
	}
	
	public boolean equals(Book other)
	{
		if(title.equals(other.title) && pages == other.pages)
			return true;
		else
			return false;
	}
	
	public int compareTo(Book other)
	{
		if(pages < other.pages)
			return -1;
		else if(pages > other.pages)
			return 1;
		else
			return 0;
	}
	
}
