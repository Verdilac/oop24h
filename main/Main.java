package main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Specialization spe = new Specialization();
		spe.addSpecialization("SE", 2.75);
		spe.addSpecialization("IT", 3.75);
		
		spe.showDegreeDetails();
		
		Weekday std1 = new Weekday("Lathindu","Malabe",'M',2000,"IT","Monday");
		
		
		String std1ID = std1.generateID();
		System.out.println(std1ID);
		
	}

}
