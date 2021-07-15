package homework4;

/*
 * Define a class Circle that represent a circle with a given center and 
 * radius. The Circle class should have a center attribute named center 
 * as well as a floating point radius. 
 * The center is a point object, defined by the class Point. 
 * The class should also have these members:
 *    - the constructor of the class, which should take parameters to 
 *      initialize all attributes
 *    - a getter for each instance data
 *    - a setter for each instance data
 *    - a toString() method that returns the summary of a Circle object
 */

public class Circle 
{
	private Point center;
	private double radius;
	
	public Circle(Point c, double r)
	{
		center = c;
		radius = r;
	}
	
	public Point getCenter()
	{
		return center;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setCenter(Point newC)
	{
		center = newC;
	}
	
	public void setRadius(double newR)
	{
		radius = newR;
	}
	
	public String toString()
	{
		return "Circle centered at " + center + " with radius " + radius;
	}
}
