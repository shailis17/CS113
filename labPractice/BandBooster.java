package labPractice;

public class BandBooster 
{
	private String name;
	private int boxesSold;
	
	public BandBooster(String n)
	{
		name = n;
		boxesSold = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void updateSales(int numSold)
	{
		boxesSold += numSold;
	}
	
	public String toString()
	{
		return name + ": " + boxesSold + " boxes";
	}
}
