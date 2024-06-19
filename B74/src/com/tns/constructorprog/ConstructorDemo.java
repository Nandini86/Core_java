package com.tns.constructorprog;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc=new Scanner(System.in);
//		String name,city;
//		int id;
//		System.out.println("enter customer id");
//		id=sc.nextInt();
//		sc.nextLine();
//		
//		System.out.println("enter name");
//		name=sc.nextLine();
//		
//		System.out.println("enter city");
//		city=sc.nextLine();
		Customer c1=new Customer("renu",22,"jaipur");// calling parameterized  constructor
//		c1.setCustomerId(id);
//		c1.setCustomerName(name);
//		c1.setCustomerCity(city);
//		System.out.println(c1.getCustomerCity());
//		System.out.println(c1.getCustomerId());
//		System.out.println(c1.getCustomerName());
	boolean output=	((c1) instanceof Customer);
	System.out.println(output);
	
		
	}
	

}
