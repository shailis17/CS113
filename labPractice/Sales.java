package labPractice;
import java.util.Scanner;

public class Sales
{
	public static void main(String[] args)
	{
		final int SALESPEOPLE = 5;
		int[] sales = new int[SALESPEOPLE];
		int sum;
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + i + ": ");
			sales[i] = sc.nextInt();
		}
		
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		
		sum = 0;
		
		int max = sales[0], idMax = 0;
		int min = sales[0], idMin = 0;
		
		for (int i=0; i<sales.length; i++)
		{
			System.out.println(" " + i + " " + sales[i]);
			sum += sales[i];
			
			//Find and print the salesperson with the max sale
			//ex: Salesperson 3 had the highest sale with $4500
			if(sales[i] > max)
			{
				max = sales[i];
				idMax = i;
			}
			
			if(sales[i] < min)
			{
				min = sales[i];
				idMin = i;
			}
		}
		
		System.out.println("\nTotal sales: $" + sum);
		System.out.println("Avegage sale: $" + (sum/sales.length) );
		System.out.println("Salesperson " + (idMax + 1) + " had the highest sale with $" + max);
		System.out.println("Salesperson " + (idMin +1) + " had the lowest sale with $" + min);
		
		//As the user to enter a value and print the id/sale of each 
		//sales person who exceeded that amount and the total number
		//people who exceeded
		
		int target, count = 0; 
		System.out.println("\nEnter the target sale: ");
		target = sc.nextInt();
		System.out.println("The salespeople who exceeded that amount are: ");
		for (int i=0; i<sales.length; i++)
		{
			if(sales[i] > target)
			{
				System.out.println("Salesperson " + (i+1) + ": $" + sales[i]);
				count++;
			}
		}
		System.out.println("A total of " + count + " salespeople exceeded $" + target + " sales");
	}
}