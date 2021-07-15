package homework4;

import java.util.Scanner;

/*
 * Write an application CircleTest that first creates two Points objects, 
 * point1 with random coordinates from 1 to 10, inclusive, and point2 with 
 * coordinates 0,0. The program will then instantiate two circles with the 
 * following radius/center requirements:
 *   - Radius entered from the keyboard and point2 as the center
 *   - Radius 5.5 and point1 as the center
 *   
 * The program prints to the screen the summary of each circle as well as 
 * the distance between their centers (for full credit, you  MUST use the 
 * circle  objects).
 */

public class CircleTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double r2;
		
		Point point1 = new Point(3,4);
		Point point2 = new Point(0,0);
		
		Circle c1 = new Circle(point1, 5.5);
		
		System.out.print("Enter the radius for the circle centered at (0,0)");
		r2 = sc.nextDouble();
		Circle c2 = new Circle(point2, r2);
		
		double distance = point1.distance(point2);
		System.out.print(c1 + "\n" + c2 + "\nDistance between the centers = " + distance);
	
	}
}
