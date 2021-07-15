package homework3;

/*
 * To test methods above, write an application, TestMethods, that will 
 * instantiate an instance (object) of the class MyMethods to invoke the 
 * methods below. The application should have at least one invocation of 
 * each method
 */

public class TestMethods 
{
	public static void main(String[] args) 
	{
		MyMethods test = new MyMethods();
		Die dice1 = new Die();
		Die dice2 = new Die();
		
		System.out.println(test.surface(2, 3, 4));

		System.out.println(dice1 + "\n" + dice2);
		test.swapFaceValues(dice1, dice2);
		System.out.print(dice1 + "\n" + dice2);
	}
}
