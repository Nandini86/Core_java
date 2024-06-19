package com.tns.generics;

public class GenericMethod {
	
	public <T>void displayArrayElements(T[]elements){// generic method
		for(T ele:elements) {
			System.out.println("element is"+ele);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod obj = new GenericMethod();// create an obj
		Integer[] intarry= {10,20,30,40};
		String [] str= {"hello","hai"};
		obj.displayArrayElements(intarry);
		obj.displayArrayElements(str);
		

	}

}
