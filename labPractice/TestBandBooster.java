package labPractice;
import java.util.*;

public class TestBandBooster 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BandBooster b1, b2;
		
		System.out.println("Enter the name of the first band booster: ");
		b1 = new BandBooster(sc.nextLine());
		System.out.println("Enter the name of the second band booster: ");
		b2 = new BandBooster(sc.nextLine());	
		
		System.out.println("Week 1: How many boxes did " + b1.getName() + " sell? ");
		b1.updateSales(sc.nextInt());
		System.out.println("Week 1: How many boxes did " + b2.getName() + " sell? ");
		b2.updateSales(sc.nextInt());
		
		System.out.println("Week 2: How many boxes did " + b1.getName() + " sell? ");
		b1.updateSales(sc.nextInt());
		System.out.println("Week 2: How many boxes did " + b2.getName() + " sell? ");
		b2.updateSales(sc.nextInt());
		
		System.out.println("Week 3: How many boxes did " + b1.getName() + " sell? ");
		b1.updateSales(sc.nextInt());
		System.out.println("Week 3: How many boxes did " + b2.getName() + " sell? ");
		b2.updateSales(sc.nextInt());
		
		System.out.print(b1 + "\n" + b2);
	}
}
