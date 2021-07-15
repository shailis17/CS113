package labPractice;
import java.util.*;

public class LoveCS 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of times the message will appear: ");
		int numOfTimes = sc.nextInt();
		
		int count = 1, sum = 0;
		
		while(count <= numOfTimes)
		{
			System.out.print("I Love Computer Science!!");
			sum += count;
			count++;
		}
		
		System.out.print("This message was printed " + numOfTimes + 
							" times.\nThe sume of the numbers 1 to " +
				            numOfTimes + " is " + sum);
	}
}
