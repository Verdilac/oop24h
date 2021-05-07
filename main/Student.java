package main;

public class Student  {

	protected String name;
	protected String address;
	protected char  sex;
	protected int bornYear;
	protected String specialization;
	
	
	protected double sub1;
	protected double sub2;
	protected double sub3;
	protected double sub4;
	protected double sub5;
	
	
//	Student(String name,String address,char sex,int bornYear,String specialization){
//		
//		this.name = name;
//		this.address = address;
//		this.sex = sex;
//		this.bornYear = bornYear;
//		this.specialization = specialization;
//	}
	public void addDetails(String name,String address,char sex,int bornYear,String specialization){
		
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
	}
	
	public  void addMark(double sub1,double sub2,double sub3,double sub4,double sub5) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		
		
	}
	
	
	
}
