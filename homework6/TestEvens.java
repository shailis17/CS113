package homework6;
import java.util.*;

/*
 * Using an array containing integers: 2, 7, 8, 3, 4, 10 and a 
 * target value entered by the user embed the method SmallEven() 
 * that takes two parameters: an integer array, numArray, and an 
 * integer, target. The method returns the number of integers in 
 * the array that are even and smaller than target.
 */


public class TestEvens 
{
	public static void main (String[] args)
	{
		int[] nums = {2, 7, 8, 3, 4, 10};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target number: ");
		int t = sc.nextInt();
		
		int numSmall = SmallEven(nums, t);
		
		System.out.print("# of even numbers less than " + t + " = " + numSmall);
	}
	
	public static int SmallEven(int[] numArray, int target)
	{
		int count = 0;
		
		for(int num : numArray)
		{
			if(num < target & num % 2 == 0)
				count++;
		}
		
		return count;
	}
}
