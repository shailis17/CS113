package homework3;
import java.util.*;

/*
 * Write an application Kennel that instantiates two Dog objects and 
 * updates the name and age with data from the user. The program will 
 * display the information about each object (Hint: toString() method) 
 * as well as the average age in “person years”.
 */

public class Kennel 
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2, avgPersonAge;
		
		System.out.println("Enter the name of the first dog: ");
		name1 = sc.nextLine();
		System.out.println("Enter the name of the second dog: ");
		name2 = sc.nextLine();
		System.out.println("Enter the age of the first dog: ");
		age1 = sc.nextInt();
		System.out.println("Enter the age of the second dog: ");
		age2 = sc.nextInt();
		
		dog1.setName(name1);
		dog1.setAge(age1);
		dog2.setName(name2);
		dog2.setAge(age2);
		
		avgPersonAge = (dog1.toPersonYears() + dog2.toPersonYears())/2;
		
		System.out.print(dog1 + ", " + dog2 + ", Average age in person years: " + avgPersonAge);			
	}
}
