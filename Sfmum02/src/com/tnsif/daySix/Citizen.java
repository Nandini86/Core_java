// Program to demonstrate single inheritance
package com.tnsif.daySix;

public class Citizen {
	private String name;
	private long adhaarNo;
	private String address;
	private long phno;
	
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Citizen(String name, long adhaarNo, String address, long phno) {
		super();
		this.name = name;
		this.adhaarNo = adhaarNo;
		this.address = address;
		this.phno = phno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getAdhaarNo() {
		return adhaarNo;
	}


	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarNo=" + adhaarNo + ", address=" + address + ", phno=" + phno + "]";
	}
	
	

}
