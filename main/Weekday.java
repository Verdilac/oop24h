package main;
import java.util.*;

public class Weekday extends Student implements ManageStudent {
	
	protected String freeDay;
	
	Weekday(String name,String address,char sex,int bornYear,String specialization,String freeDay){
		super(name,address,sex,bornYear,specialization);
		this.freeDay = freeDay;
	}
	
	public String generateID() {
		int min = 1000;
	      int max = 100000;
	        
	      
	      System.out.println("Random value in int from "+min+" to "+max+ ":");
	      Integer random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      
	      return ("IT"+random_int.toString());
	      
	};
	

}
