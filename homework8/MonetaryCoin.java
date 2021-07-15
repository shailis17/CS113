package homework8;

/*
 * Design and implement a class called MonetaryCoin that 
 * is derived from the Coin class presented in Chapter 5 (see below). 
 * Store an int value in the monetary coin that represents its value 
 * in cents, add getter and setter methods for the monetary value as 
 * well as a toString method.
 */

public class MonetaryCoin extends Coin
{
	private int value;
	
	public MonetaryCoin(int val)
	{
		super();
		value = val;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int v)
	{
		value = v;
	}
	
	public String toString()
	{
		return Integer.toString(value);
	}
}
