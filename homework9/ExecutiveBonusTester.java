package homework9;

import java.util.*;

/*
 * PROBLEM 2:
 * Implement a class called BonusTooLowException, designed to be thrown when a bonus value is 
 * less than $1000. Using the Executive class from Chapter 10, create a main program that creates 
 * and populates an Executive array with information entered by the user (array size as well). 
 * If a bonus value is entered that is too low, i.e. less than $1000 throw the exception. Allow 
 * the thrown exception to terminate the program.
 */

public class ExecutiveBonusTester 
{
	public static void main(String[] args) throws BonusTooLowException
	{
		Scanner sc = new Scanner(System.in);
		BonusTooLowException problem = new BonusTooLowException("Bonus value is entered  is too low");
		
		System.out.println("How many Executive employees are there? ");
		int len = sc.nextInt();
		sc.nextLine(); //bring cursor to next line 
		Executive[] execs = new Executive[len];
		
		for(int i = 0; i < execs.length; i++)
		{
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Address: ");
			String address = sc.nextLine();
			System.out.println("Phone Number: ");
			String phone = sc.nextLine();
			System.out.println("Social Security Number: ");
			String ssn = sc.nextLine();
			System.out.println("Pay Rate: ");
			double payrate = sc.nextDouble();
			execs[i] = new Executive(name, address, phone, ssn, payrate);
			
			System.out.print("Award a bonus: ");
			int bonus = sc.nextInt();
			sc.nextLine(); //bring cursor to the next line
			if(bonus < 1000)
				throw problem;
			else
				execs[i].awardBonus(bonus);
			
			System.out.println("Executive was paid $" + execs[i].pay());            
			System.out.println("-----------------------------------");   
		}
		
	}
}
