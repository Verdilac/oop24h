package main;

public class Weekend extends Student{

	protected String jobTitle;
	
	Weekend(){
		
	};
	

	
	public void addDetails(String name,String address,char sex,int bornYear,String specialization,String jobTitle) {
		super.addDetails(name, address, sex, bornYear, specialization);
		this.jobTitle = jobTitle;
	}
	
	public String generateID() {
		int min = 1000;
	    int max = 100000;
	        
	      
//	    System.out.println("Random value in int from "+min+" to "+max+ ":");
	    Integer randomID = (int)Math.floor(Math.random()*(max-min+1)+min);
	      
	      return ("IT"+randomID.toString());    
	};
	
	public void showDetails() {
		System.out.println("Student name :"+ super.name);
		System.out.println("Student Adress :"+ super.address);
		System.out.println("Gender :"+ super.sex);
		System.out.println("Student Year :"+ super.bornYear);
		System.out.println("Student Job Title :"+ super.specialization);
		System.out.println("Student Job Title :"+ this.jobTitle);
		
	}
	
	

	
	

}
