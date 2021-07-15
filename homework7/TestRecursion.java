package homework7;

public class TestRecursion 
{
	public static void main(String[] args)
	{
		System.out.println("PROBLEM 1: printDigits()");
		printDigits(23145);
		System.out.println("PROBLEM 2: sumArray()");
		int[] a = {1,3,2};
		System.out.println(sumArray(a)); 
		System.out.println("PROBLEM 3: pascalTriangle()");
		pascalTriangle(9);
	}
		
	/*
	 * PROBLEM 1:
	 * Implement a recursive method printDigits() that takes an 
	 * integer num as a parameter and prints its digits, one digit per line.
	 * For example, the output for the method call printDigits(23145) would display
	 * 	2
	 *  3 
	 *  1 
	 *  4 
	 *  5
	 */
	public static void printDigits(int num)
	{
		int digit = num % 10;
		num /= 10;
		
		if(num == digit)
		{
			if(num != 0)
			{
				System.out.println(num);
			}
		}
		else
		{
			printDigits(num);
			System.out.println(digit);
		}
	}
	
	/*
	 * PROBLEM 2: 
	 * Implement a recursive method sumArray() that takes an integer array, 
	 * numArray and returns the sum of all numbers in it.
	 * For example: 
	 *   int[] a ={1,3,2};
	 *   System.out.println(sumArray(a)); 
	 *   will display 6
	 */
	
	public static int sumArray(int[] numArray)
	{
		int sum = 0, i = numArray.length - 1;
		sum += numArray[i];
		
		if(i == 0)
		{
			return sum;
		}
		else
		{
			int[] newArray = new int[i];
			for(int x = 0; x < newArray.length; x++)
			{
				newArray[x] = numArray[x];
			}
			
			return sum + sumArray(newArray);
		}
	}
	
	/*
	 * PROBLEM 3: 
	 * Design and implement a recursive method pascalTriangle() 
	 * to determine and print the Nth line of Pascal's Triangle, as shown below. 
	 * Each interior value is the sum of the two values above it. 
	 * Hint: use an array to store the values on each line."
	 */
	
	public static int[] pascalTriangle(int n)
	{
		int[] row = new int[n];
		row[0] = 1;
		
		
		if(n < 2)
		{
			System.out.println("1");
			return row;
		}
		else
		{
			row[row.length-1] = 1;
			int[] prevRow = pascalTriangle(n-1);
			for(int r = 1; r < n - 1; r++) 
			{
				row[r] = prevRow[r - 1] + prevRow[r];
			}
				
			
			for(int num : row)
			{
				System.out.print(num + " ");
			}
			
			System.out.print("\n");
			return row;
		}
	}

}
