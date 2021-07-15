package homework2; //Problem #1
import java.util.*;
/*
 * Write an application called NameApp that prompts for and reads the 
 * user’s first and last name (separately). 
 * Then print a string composed of 
 * -- the first letter of the user’s last name
 * -- followed by the first five characters of the user’s first name
 * -- followed by a random integer in the range 1 to 99. 
 * Assume that the first name is at least five letters long. 
 * NOTE: Similar algorithms are sometimes used to generate usernames for a 
 * new computer account.
 */

public class NameApp 
{
	public static void main(String[] args)
	{
		String firstName, lastName, result = "";
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(99) + 1;
		
		System.out.println("Enter the first name: ");
		firstName = sc.next();
		System.out.println("Enter the last name: ");
		lastName = sc.next();
		
		result += lastName.charAt(0) + firstName.substring(0, 5) + num;
		
		System.out.print(result);
		
		
	}
}
