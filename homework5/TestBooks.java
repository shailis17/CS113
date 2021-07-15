package homework5;
import java.util.*;
/*
 * Write an application TestBooks that asks the user repeatedly for 
 * books read during summer (use a sentinel value to control the end 
 * of input). The application repeatedly creates book objects, and 
 * then prints to the screen information about the “smallest” book, 
 * (i.e. the book with the smallest number of pages), as well as the 
 * average number of pages per book
 * 
 * HINT: This program MUST make use of the compareTo method in order 
 *       to find the “smallest” book.
 */

public class TestBooks 
{
	public static void main (String[] args)
	{
		int sumPages = 0, count = 0;
		double avgSize;
		Scanner sc = new Scanner(System.in);
		Book stop = new Book(0, "stop");
		
		int pgs;
		String title;
		System.out.println("Enter the title and names off all the books" + " you read over the summer when prompted");
		System.out.println("Enter \"stop\" (all lowercase) as the title and \"0\" as the number of pages to stop the prompt");
		
		System.out.println("Enter the title: ");
		title = sc.nextLine();
		System.out.println("Number of pages: ");
		pgs = sc.nextInt();
		sc.nextLine();
		
		Book smallestBook = new Book(pgs, title);
		Book b = new Book(pgs, title);
		
		while(b.equals(stop) == false)
		{			
			sumPages += b.getPages();
			count++;
			
			if(smallestBook.compareTo(b) == 1)
				smallestBook = b;
			
			System.out.println("Enter the title: ");
			title = sc.nextLine();
			System.out.println("Number of pages: ");
			pgs = sc.nextInt();
			sc.nextLine();
			
			b = new Book(pgs, title);
		}
		
		avgSize = sumPages/count;
		
		System.out.println("The smallest book is " + smallestBook);
		System.out.println("The average number of pages read is: " + avgSize);
	}
	
}
