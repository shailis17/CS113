package homework1;

import java.util.*;

public class milligramsConverter 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of milligrams: ");
		int mg = sc.nextInt();
		
		int kg = mg/1000000;
		mg -= (kg*1000000);
		
		int g = mg/1000;
		mg -= (g*1000);
		
		
		
		System.out.print(kg + "kg " + g + "g " + mg + "mg");

	}

}
