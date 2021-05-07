package main;
import java.util.*;

import java.util.HashMap;

public class Specialization {
	
	Map<String,Double> degreeDetails;
	
	public Specialization() {
		
		 degreeDetails = new HashMap<>();
		
	}
	
	public void addSpecialization(String specialization,double gpa) {
		
		degreeDetails.put(specialization, gpa);
		
	}
	
	public void showDegreeDetails() {
		for (Map.Entry pairEntry: degreeDetails.entrySet()) {
			System.out.println(pairEntry.getKey()+":"+ pairEntry.getValue());
		}
	}
	

}
