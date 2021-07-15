package homework3;

/*
 * Write a class called Dog that contains instance data that 
 * represents the dog’s name and age. In addition, the class 
 * should have the following methods:
 * -- A default constructor, which initializes name to “dog” and age to 0
 * -- A getter for each instance data
 * -- A setter for each instance data
 * -- A method toPersonYears() that computes and returns the age of the dog in “person years” (seven times the dog’s age)
 * -- A toString method that returns a one-line description of the dog including name and age.
 */

public class Dog 
{
	private String name;
	private int age;
	
	public Dog()
	{
		name = "dog";
		age = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public int toPersonYears()
	{
		return age*7; 
	}
	
	public String toString()
	{
		return name + ": " + age;
	}
}
