package labPractice;

public class TestArrays 
{
	public static void main(String[] args) 
	{
		int[] myArray = {5, 6, 7, 3, 11, 9};
		reverseArray(myArray);
		
		for(int num : myArray)
		{
			System.out.print(num + "  ");
		}
	}
	
	public static void reverseArray(int[] numArray)
	{
		int left = 0, right = numArray.length - 1;
		
		while(left < right)
		{
			int temp = numArray[left];
			numArray[left] = numArray[right];
			numArray[right] = temp;
			
			left++;
			right--;
		}
	}

}
