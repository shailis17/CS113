package labPractice;
/*Write a class Student that contains the following members:
-an instance data, name
-two integer midterm scores
-a default constructor with initial values "",0,0 (optional-> constructor with parameter)
-a setter/getter for each instance data
-a method average that returns the average of the two midterm scores
-a toString method that returns the student name and each midterm score
*/

public class Student 
{
	private String name;
	private int midterm1, midterm2;
	
	public Student()
	{
		
	}
	
	public Student(String newName, int score1, int score2)
	{
		name = newName;
		midterm1 = score1;
		midterm2 = score2;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMid1(int score1)
	{
		midterm1 = score1;
	}
	
	public int getMid1()
	{
		return midterm1;
		
	}
	
	public void setMid2(int score2)
	{
		midterm2 = score2;
	}
	
	public int getMid2()
	{
		return midterm2;
	}
	
	public double getAvg()
	{
		return (midterm1+midterm2)/2;
	}
	
	public String toString()
	{
		return "Name: " + name + "\nMidterm 1: " + midterm1 + "\nMidterm 2: " + midterm2;
	}
}
