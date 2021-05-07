package main;

public class Weekend extends Student{

	protected String jobTitle;
	
	Weekend(String name,String address,char sex,int bornYear,String specialization,String jobTitle){
		super(name,address,sex,bornYear,specialization);
		this.jobTitle = jobTitle;
	}
	

}
