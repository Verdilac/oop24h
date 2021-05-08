package main;
import java.util.*;

import java.util.HashMap;

public class Specialization {
	
	//declaring map which will later be assigned when the constructor is called.
	protected Map<String,Double> degreeDetails;
	
	 Specialization() {
		
		 degreeDetails = new HashMap<>();
		
	}
	
	public void addSpecialization(String specialization,double gpa) {
		
		degreeDetails.put(specialization, gpa);
		
	}
	
	public void showDegreeDetails() {
		
		//iterating through the Map and concatanating The key with the value 
		for (Map.Entry pairEntry: degreeDetails.entrySet()) {
			System.out.println(pairEntry.getKey()+":"+ pairEntry.getValue());
		}
	}
	

}
