package com.tnsif.staticprograms;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee companyName;// calling static varible
		Employee ob=new Employee("suma",22);// calling instance variable using constructor
		
		System.out.println(" Company Name is"+Employee.companyName);
		Employee ob1=new Employee("ramya",23);
		System.out.println(ob);
		System.out.println(ob1);

	}

}
