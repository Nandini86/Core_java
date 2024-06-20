package com.tnsif.daytwoprograms;

import java.util.Scanner;

// program to demonstrate scanner class
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer ob= new Customer();// constructor is invoked
		ob.setCustomerId(22);
		ob.setCustomerName("manu");
		ob.setCustomerCity("banglore");
		System.out.println(ob);
		
		Customer obone= new Customer(2,"sonu", "madras");
		System.out.println(obone);
	
		}



}

