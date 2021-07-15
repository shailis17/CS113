package labPractice;
import java.util.*;

public class RightTriangle 
{
	public static void main(String[] args) 
	{
		double side1, side2, hypotenuse;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lengths of the two sides of "
				+ "a right triangle (seperated by a blank space)");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		
		hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		
		System.out.print("Length of hypotenuse: " + hypotenuse);
	}
}
