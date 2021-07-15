package homework9;

/*
 * PROBLEM 1:
 * Modify the Firm example from this chapter such that all employees can be given different vacation 
 * options depending on their classification. Provide a method called vacation that returns the number 
 * of vacation days a person has. Give all employees a standard number of vacation days (14), then 
 * override the method in the various employee classes as appropriate. Modify the driver program to 
 * demonstrate this new functionality.
 */

public class Firm 
{
	//  Creates a staff of employees for a firm and pays them.    
	public static void main(String[] args)    
	{        
		Staff personnel = new Staff();        
		
		personnel.vacations();
	}
}
