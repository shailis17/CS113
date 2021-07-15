package labPractice;
import java.util.*;

/*
 * Write a complete Java program that simulates the rolling of a pair of
 * dice. For each die in the pair, the program should generate a random 
 * number between 1 and 6 (inclusive). It should print out the result of
 * the roll for each die and the total roll (the sum of the two dice), 
 * all appropriately labeled. You must use the Random class and math class. 
 * The RandomNumbers program in listing 3.2 of the text may be helpful. 
 */

public class RollingDice 
{

	public static void main(String[] args) 
	{
		int dice1, dice2, sum;
		Random rand = new Random();
		dice1 = rand.nextInt(6) + 1;
		dice2 = (int)(Math.random()*5) + 1;
		sum = dice1 + dice2; 
		
		System.out.println("Dice #1: " + dice1);
		System.out.println("Dice #2: " + dice2);
		System.out.print("Sum = " + sum);
		
		
	}

}
