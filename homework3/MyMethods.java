package homework3;

/*
 * PART 1:
 * Implement a method named surface that accepts 3 integer parameters 
 * named width, length, and height as user input. It will return the 
 * total surface area (6 sides) of the rectangular box it represents. 
 * Surface Area is 2(length * width) + 2(length * height) + 2(height * width)
 *
 * PART 2:
 * Implement a method named swapFaceValues that accepts 2 Die objects. 
 * Use the Die class developed in class. The method swaps the face values 
 * of the two die objects. For example, if die1 has face value 3 and die2 
 * has face value 5, after the method executes, the face values of die1 and 
 * die2 will be 5 and 3, respectively.
 */

public class MyMethods 
{
	public int surface(int width, int length, int height)
	{
		return (2*length * width) + (2*length*height) + (2*height*width);
	}
	
	public void swapFaceValues(Die d1, Die d2)
	{
		int newFace = d1.getFaceValue();
		d1.setFaceValue(d2.getFaceValue());
		d2.setFaceValue(newFace);
	}
}
