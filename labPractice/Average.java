package labPractice;

//Read three integers from the user and print their average 

import java.util.Scanner; 
public class Average 
{
	public static void main(String[] args) 
	{
		int val1, val2, val3;
		double average;
		Scanner sc = new Scanner(System.in) ;
		
		// get three values from user
		System.out.println("Please enter three integers and " +
								"I will compute their average");
		val1 = sc.nextInt();
		val2 = sc.nextInt();
		val3 = sc.nextInt();
		
		average = (val1 + val2 + val3)/3.0;
		
		System.out.print("Average: " + average);
	}
}
