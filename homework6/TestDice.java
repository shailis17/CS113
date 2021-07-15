package homework6;
/*
 * Using the Die class previously developed, write an application 
 * TestDice, that creates and populates an array of 50 die objects
 * with random face values. The application rolls each die, 
 * calculates and print to the screen the number of Die objects 
 * in the array with an even face value.
 */

public class TestDice 
{
	public static void main (String[] args)
	{
		Die[] myDie = new Die[50];
		int count = 0;
		
		for(int i = 0; i < 50; i++)
		{
			Die d = new Die();
			myDie[i] = d;
			
			if(d.getFaceValue() % 2 == 0)
				count++;
		}
		
		System.out.println("Total dice with even face values = " + count);
		
	}
}
