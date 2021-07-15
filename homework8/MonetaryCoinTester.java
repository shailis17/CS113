package homework8;
import java.util.*;

/*
 * Create a main driver class to instantiate 35 monetary coins 
 * (use an array for this) with random monetary values. The driver 
 * flips all the coins, computes, and prints to the screen the 
 * average monetary value of all coins with HEAD face.
 */

public class MonetaryCoinTester 
{
	public static void main(String[] args) 
	{
		MonetaryCoin[] coins = new MonetaryCoin[35];
		int count = 0, sum = 0;
		double avg;
		
		for(int i = 0; i < coins.length; i++)
		{
			int val = (int)(Math.random()*100+1);
			coins[i] = new MonetaryCoin(val); //flips in constructor call to super
			if(coins[i].isHeads())
			{
				count++;
				sum += coins[i].getValue();
				//System.out.println(coins[i]);
			}	
		}
		
		//System.out.println("\n Sum" + sum + " count: " + count);
		
		avg = (double)sum/count;
		avg = Math.round(avg);
		System.out.print("Avg val of coins with HEADs face: " + avg);
	}
}
