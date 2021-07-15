package labPractice;

public class Runs 
{
	public static void main (String[] args)
	{
        final int FLIPS = 10; // number of coin flips
        int currentRun =0; // length of the current run of HEADS
        int maxRun =0; // length of the maximum run so far
        
        // Create a coin object
        Coin c = new Coin();
        
        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
        	// Flip the coin & print the result
        	c.flip();
        	System.out.print(c + " ");
        	
        	// Update the run information
        	if(c.isHeads())
        	{
        		currentRun++;
        		if(currentRun > maxRun)
        			maxRun = currentRun;
        	}
        	else
        	{
        			currentRun = 0;
        	}
        }
        // Print the results
        
        System.out.println("\nThe longest run of Heads is: " + maxRun);
	}
}
