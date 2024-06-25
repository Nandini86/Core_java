//Program to demonstrate Static variable
package com.tnsif.staticprograms;

public class Employee {
	// instance variable
	private String name;
	private int id;
	
	static String companyName="TNSIF";

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	
	
	
	
	
	

}
