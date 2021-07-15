package labPractice;
import java.util.Scanner;

public class Paint 
{
	public static void main(String[] args) 
	{
		final int COVERAGE = 350;
		//paint covers 350 sq ft/gal 
		int length, width,  height; 
		double totalSqFt, paintNeeded;
		Scanner sc = new Scanner(System.in);
		//Prompt for and read in the length of the room
		System.out.print("Enter length of room: ");
		length = sc.nextInt();
		//Prompt for and read in the width of the room
		System.out.print("Enter width of room: ");
		width = sc.nextInt();
		//Prompt for and read in the height of the room
		System.out.print("Enter height of room: ");
		height = sc.nextInt();		
	//Compute the total square feet to be painted--think dimensions of each wall
		totalSqFt = (2*length*height) + (2*width*height);
	//Compute the amount of paint needed
		paintNeeded = totalSqFt/350.0;
	//Print the length, width, and height of the room and the 
	//number of gallons of paint needed. 
		System.out.print("Room length: " + length + "\nRoom width: " + width + 
							"\nRoom height: " + height + "\nGals of paint: " 
								+ paintNeeded);
		
	}
}
