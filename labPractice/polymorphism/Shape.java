package labPractice.polymorphism;

/*
 * Write an abstract class Shape with the following 
 * properties:
	- An instance variable shapeName of type String
 	- An abstract method area()
	- A toString method that returns the name of the sh
 */

public abstract class Shape //don't instantiate
{
	protected String shapeName;
	
	public Shape(String name)
	{
		shapeName = name;
	}
	
	public abstract double area();
	
	public String toString()
	{
		return shapeName;
	}
}
