package main;

public class Weekend extends Student{

	protected String jobTitle;
	
	Weekend(){
		
	};
	

	
	public void addDetails(String name,String address,char sex,int bornYear,String specialization,String jobTitle) {
		super.addDetails(name, address, sex, bornYear, specialization);
		this.jobTitle = jobTitle;
	}
	
	public String generateID() 
	{
	
		String generatedID = null;
		String ID;	
		try {	
			

		
			//declaring range for the ID number to be generated.
			int min = 1000;
			int max = 10000;
	          
			Integer randomID = (int)Math.floor(Math.random()*(max-min+1)+min);		
			
			ID = randomID.toString();
			generatedID = ("IT"+ID);
			
			if(!generatedID.contains("IT") ||   4>ID.length()) 
			{
				
				throw new IDInvalidException("Invalid ID.Regenerating ID...");
			}
			
			}
		catch (IDInvalidException e) 
			{
				//catching the custom exception here and calling the generateID function again.
			
				System.out.println("Error"+ e );
				System.out.println("Error"+ e );
				int min = 1000;
				int max = 10000;
		          
				Integer randomID = (int)Math.floor(Math.random()*(max-min+1)+min);		
				
				ID = randomID.toString();
				generatedID = ("IT"+ID);
			}
		
		
	
		return generatedID;
		
	};
	
	public void showDetails() {
		System.out.println("Student name :"+ super.name);
		System.out.println("Student Adress :"+ super.address);
		System.out.println("Gender :"+ super.sex);
		System.out.println("Student Year :"+ super.bornYear);
		System.out.println("Student Job Title :"+ super.specialization);
		System.out.println("Student Freeday :"+ this.jobTitle);
		
	}
	
	

	
	

}
