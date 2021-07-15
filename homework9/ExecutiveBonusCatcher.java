package homework9;

import java.util.*;

/*
 *  PROBLEM 3:
 *  Modify the solution to PROBLEM 2 (submit a second file for this) such that it catches and handles the 
 *  exception if it is thrown. Handle the exception by printing an appropriate message and keeping the bonus=0, 
 *  and then continue entering more executive data. Let the program conclude by printing the total number of 
 *  executives with valid bonuses, i.e. positive, more than $1000, as well as the average pay.
 */

public class ExecutiveBonusCatcher 
{
	public static void main(String[] args) throws BonusTooLowException
	{
		Scanner sc = new Scanner(System.in);
		BonusTooLowException problem = new BonusTooLowException("Bonus value is entered  is too low");
		
		System.out.println("How many Executive employees are there? ");
		int len = sc.nextInt();
		sc.nextLine(); //bring cursor to next line 
		Executive[] execs = new Executive[len];
		
		int valid = 0;
		double totalPay = 0;
		
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
			try
			{
				if(bonus < 1000)
					throw problem;
				else
					valid++;
			}
			catch(BonusTooLowException problem1)
			{
				System.out.println(problem1.getMessage() + " and the bonus will be $0");
				bonus = 0;
			}
			
			execs[i].awardBonus(bonus);
			
			double payment = execs[i].pay();
			
			System.out.println("Executive was paid $" + payment);            
			System.out.println("-----------------------------------");   
			
			totalPay += payment;
		}
		
		System.out.println("CONCLUSION: ");
		System.out.println(valid + " out of " + len + " executives were awarded valid bonuses");
		System.out.println("Executives were paid $" + totalPay/len + " on average");
		
	}
}
