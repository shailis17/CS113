package labPractice;

public class StringPlay 
{
	public static void main (String[] args)
	{
		String college = new String("PoDunk College"); //String as an object
		String town = "Anytown, USA"; //part (a) ... using a String literal
		
		int stringLength;
		String change1, change2, change3;
		
		stringLength = college.length(); //part (b)
		
		System.out.println (college + " contains " + stringLength + " characters.");
		change1 =  college.toUpperCase(); // part (c)
		System.out.println(change1);
		change2 =  change1.replace('O', '*'); // part (d)
		System.out.println(change2);
		change3 =  college.concat(", " + town); // part (e)
		
		System.out.print("The final string is " + change3);
		
	}
}
