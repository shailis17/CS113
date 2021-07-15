package labPractice;
/*Write a driver program TestStudent that creates two students (Student objects):
1. John with midterm scores 90, 85
2. Jill with midterm scores 88, 98
The program prints to the screen:
- each student's midterms' average
- the average of midterm2 scores for these two students
- summary of each student
*/

public class TestStudent 
{
	public static void main(String[] args)
	{
		Student john = new Student("John", 90, 85);
		Student jill = new Student("Jill", 88, 98);
		
		System.out.println("John\'s midterm average = " + john.getAvg());
		System.out.println("Jill\'s midterm average = " + jill.getAvg());
		
		double mid2Avg = (john.getMid2() + jill.getMid2())/2;
		System.out.print("Midterm 2 Avg = " + mid2Avg);
		
		System.out.print(john + "\n" + jill);

	}
}
