package main;
import java.util.*;

public class Weekday extends Student implements ManageStudent {
	
	protected String freeDay;

	
	
	
	Weekday(){
	
	};
	

	
	public void addDetails(String name,String address,char sex,int bornYear,String specialization,String freeDay) {
		super.addDetails(name, address, sex, bornYear, specialization);
		this.freeDay = freeDay;
	}
	
	
	
	
	
	public String generateID() 
	{
	
		String generatedID = null;
		String ID;	
		try {	
			

		
		
			int min = 1000;
			int max = 100000;
	          
			Integer randomID = (int)Math.floor(Math.random()*(max-min+1)+min);		
			
			ID = randomID.toString();
			generatedID = ("IT"+ID);
			
			if(!generatedID.contains("IT") ||   4>ID.length()) 
			{
				
				throw new IDInvalidException("as");
			}
			
			}
		catch (IDInvalidException e) 
			{
				generateID();
			}
		
		
	
		return generatedID;
		
	};
	
	public  void showDetails() {
		System.out.println("Student name :"+ super.name);
		System.out.println("Student Adress :"+ super.address);
		System.out.println("Gender :"+ super.sex);
		System.out.println("Student Year :"+ super.bornYear);
		System.out.println("Student Job Title :"+ super.specialization);
		System.out.println("Student Freeday :"+ this.freeDay);
	}
	

	

}
