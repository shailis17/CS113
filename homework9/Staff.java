package homework9;

import java.util.Scanner;

import homework9.FirmClasses.Volunteer;

public class Staff 
{
	private StaffMember[] staffList;    
	
	//  Constructor: Sets up the list of staff members.    
	public Staff()    
	{        
		staffList = new StaffMember[4];        
		staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);        
		staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);        
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);        
		staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);              
		((Executive)staffList[0]).awardBonus(500.00);        
		((Hourly)staffList[3]).addHours(40);    
	}    

	//  Pays all staff members.    
	public void payday ()    
	{        
		double amount;        
		for (int count=0; count < staffList.length; count++)       
		{            
			System.out.println(staffList[count]);            
			amount = staffList[count].pay();  // polymorphic            
			if (amount == 0.0)                
				System.out.println("Thanks!");            
			else                
				System.out.println("Paid: " + amount);            
			System.out.println("-----------------------------------");        
		}
	}
	
	public void vacations()
	{
		for (int count=0; count < staffList.length; count++)       
		{            
			System.out.println(staffList[count]);     
			int daysLeft = staffList[count].vacation();  // polymorphic            
			System.out.println("Vacation Days Left: " + daysLeft);            
			System.out.println("-----------------------------------");        
		}
	}

}
