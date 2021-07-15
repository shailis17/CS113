package labPractice.polymorphism;

import java.text.DecimalFormat;

public class PaintThings 
{
	public static void main (String[] args)
	{
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck = new Rectangle(20, 35);
		Sphere bigBall = new Sphere(15);
		Cylinder tank = new Cylinder(10, 30);
		double deckAmt, ballAmt, tankAmt;
		
		deckAmt = paint.amount(deck);
		ballAmt = paint.amount(bigBall);
		tankAmt = paint.amount(tank);
		
		DecimalFormat df = new DecimalFormat("0.#");
		
		System.out.println("Number of gallons of paint needed... ");
		System.out.println("Deck: " + df.format(deckAmt));
		System.out.println("Big Ball: " + df.format(ballAmt));
		System.out.println("Tank: " + df.format(tankAmt));
	}
}