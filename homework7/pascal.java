package homework7;

public class pascal 
{
	public static void main(String[] args)
	{
		pascalTriangle(9);
	}
	
	public static int[] pascalTriangle(int n) 
	{
	    int[] row = new int[n];
	    row[0] = 1;

	    if (n < 2) 
	    {
	        System.out.println("1");
	        return row;
	    } 
	    
	    else 
	    {
	    	row[row.length - 1] = 1;
	    	int[] prevRow = pascalTriangle(n - 1);
	//  for (int r = 1; r < n / 2; r++) {
	//  row[r] = prevRow[r - 1] + prevRow[r];
	//  row[row.length - 1 - r] = row[r];
	//  }
		    for(int r = 1; r < n - 1; r++) 
		    {
		        row[r] = prevRow[r - 1] + prevRow[r];
		    }
	
		    for (int num : row) 
		    {
		        System.out.print(num + " ");
		    }
	
		    System.out.print("\n");
		    return row;
	    }
	}
}
