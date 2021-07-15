package homework6;
import java.util.*;

/*
 * Design and implement an application that reads an arbitrary
 * number of integers that are in the range 0 to 50 inclusive 
 * and counts how many occurrences of each are entered. 
 * After all input has been processed, print all of the values 
 * (with the number of occurrences) that were entered one or more 
 * times.
 */

public class problemOne 
{
	public static void main (String[] args)
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
				
		int[] nums = new int[51];
		
		for(int i=0; i < nums.length; i++)
		{
			nums[i]= 0;
		}
		
		int input = 0;
		
		System.out.println("Enter as many numbers as you would like in range 0-50. Enter -1 to stop.");
		
		while(input != -1)
		{
			input = sc.nextInt();
			if(input < 0 || input > 50)
				System.out.println("INVALID INPUT... TRY AGAIN");
			else
			{
				for(int x=0; x <nums.length; x++)
				{
					if(input == x)
						nums[x]++;
				}
			}
			
		}
		
		for(int i=0; i <nums.length; i++)
		{
			if(nums[i] > 0)
				System.out.println(i + ": " + nums[i]);
		}
	}
}
