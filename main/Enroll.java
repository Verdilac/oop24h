package main;

import java.util.HashMap;
import java.util.Map;

public class Enroll {
	
	protected Map<String,String> enrollmentDetails;
	
	public Enroll() {
		
		 enrollmentDetails = new HashMap<>();
		
	}
	
	public void enrollStudent(String studentID,String specialization) {
		
		enrollmentDetails.put(studentID,specialization);
		
	}
	
	public void displayEnrolledStudents() {
		for (Map.Entry pairEntry: enrollmentDetails.entrySet()) {
			System.out.println(pairEntry.getKey()+":"+ pairEntry.getValue());
		}
	}

}
