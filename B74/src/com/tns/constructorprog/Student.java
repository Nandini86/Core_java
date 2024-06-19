package com.tns.constructorprog;

public class Student extends Citizen{
	private int rollno;
	private String collageName;
	
	
	public Student() {
		super();
	}
	
//	public Student(int rollno, String collageName) {
//		super();
//		this.rollno = rollno;
//		collageName = collageName;
//	}
	public int getRollno() {
		return rollno;
	}
	public Student(String name, long adharno, String address, long phno) {
		super(name, adharno, address, phno);
		this.rollno=rollno;
		this.collageName=collageName;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getcollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		collageName = collageName;
	}
	
	
	
}
