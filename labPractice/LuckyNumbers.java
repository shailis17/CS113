package labPractice;
import java.util.*;

public class LuckyNumbers 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int lucky1, lucky2, lucky3;
		
		//use nextInt with no parameter to generate a number b/w 50 and 79
		lucky1 = Math.abs(rand.nextInt()) % 30 + 50;
		// lucky1 = rand.nextInt(30) + 50;
		// lucky1 = (int)(rand.nextFloat()*30) + 50;
		
		//random int between 90 and 100 using next int with a parameter
		lucky2 = rand.nextInt(11) + 90;
		
		//between 11 and 30 using nextFloat
		lucky3 = (int)(rand.nextFloat()*20) + 11;
		
		System.out.println("Your lucky numbers are " + lucky1 + 
				", " + lucky2+ ", and " + lucky3);
	}

}
