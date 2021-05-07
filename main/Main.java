package main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//STUDENT 1
		Weekend student1 = new Weekend();
		student1.addDetails("Shehan","Malabe",'M',2000,"IT","ProjectManager");
		String studentid = student1.generateID();
		student1.addMark(90.0, 65.0, 42.0, 90.0, 80.0);
		student1.showDetails();
		System.out.println("Student ID:"+studentid);
		System.out.println();
		
		
		//STUDENT 2	
		Weekday student2= new Weekday();	
		student2.addDetails("Shenaya","Metro",'F',2000,"CSN","Monday");
		String studentid2 = student2.generateID();
		student2.addMark(100.0, 85.0, 92.0, 70.0, 80.0);
		student2.showDetails();
		System.out.println("Student ID:"+studentid2);
		System.out.println();
		
	
		//ENROLLMENT
		Enroll sem1 = new Enroll();
		sem1.enrollStudent(studentid, "IT");
		sem1.enrollStudent(studentid2, "IT");
		System.out.println("\nEnrolled Student Details");
		sem1.displayEnrolledStudents();
		System.out.println();
		
		
		
		//SPECIALIZATION
		Specialization spe = new Specialization();
		spe.addSpecialization("SE", 2.75);
		spe.addSpecialization("IT", 3.75);
//		spe.showDegreeDetails();
		System.out.println();
	}

}
