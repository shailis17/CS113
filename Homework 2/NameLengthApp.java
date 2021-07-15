package homework2; //Problem 2
import java.util.*;
/*
 * Write an application that prompts the user for three student 
 * names. The program calculates and prints to the screen the 
 * average name length as well as a string containing name initials. 
 * For example, if the names are �John�, �Jake�, �Jill�, the program 
 * should print:
		4.0 
		JJJ
 */

public class NameLengthApp 
{
	public static void main(String[] args) 
	{
		String name1, name2, name3;
		char i1, i2, i3;
		int len1, len2, len3;
		double avgLen;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 names: \nName #1:");
		name1 = sc.next();
		System.out.print("Name #2: ");
		name2 = sc.next();
		System.out.print("Name #3: ");
		name3 = sc.next();
		
		len1 = name1.length();
		len2 = name2.length();
		len3 = name3.length();
		avgLen = (len1 + len2 + len3)/3;
		
		i1 = name1.charAt(0);
		i2 = name2.charAt(0);
		i3 = name3.charAt(0);
		
		System.out.println(avgLen + "\n" + i1 + i2 + i3);
	}
}
