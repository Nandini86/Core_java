package com.tns.exceptions;

public class WithoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d=0;
		try {
		int a=45/d;// exception occured
		System.out.println("hello everyone");// will not be executed
		}
	
		finally {
			System.out.println("This will execute for sure");
		}
	}

}
