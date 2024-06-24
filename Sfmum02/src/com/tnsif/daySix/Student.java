package com.tnsif.daySix;

public class Student  extends Citizen{
	
	private int rollNo;
	private String collageName;
	
	public Student() {
		super();
	}
	


	


	public Student(String name, long adhaarNo, String address, long phno, int rollNo, String collageName) {
		super(name, adhaarNo, address, phno);
		// TODO Auto-generated constructor stub
		
		this.rollNo=rollNo;
		this.collageName= collageName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}






	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collageName=" + collageName + "]";
	}






	



	


	
	
	

}
