package homework1;
import java.util.*;

public class gramsToPounds 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of grams: ");
		double grams = sc.nextDouble();
		double pounds = grams/453.592;
		System.out.print(grams + "g = " + pounds + "lbs");
	}
}
