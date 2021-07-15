package labPractice.Inheritance;

public class DogTest 
{
	public static void main(String[] args)
	{
		Dog dog = new Dog("Spike");
		System.out.println(dog.getName() + " says " + dog.speak());
		
		Labrador lab = new Labrador("Haley", "black");
		System.out.println(lab.getName() + " says " + lab.speak());
		
		Yorkshire york = new Yorkshire("Rex");
		System.out.println(york.getName() + " says " + york.speak());
	}
}
