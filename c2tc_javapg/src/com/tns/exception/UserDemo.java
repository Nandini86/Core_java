package com.tns.exception;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UserDefined.validate();
		} catch (Age e) {
			// TODO Auto-generated catch block
			System.out.println("caught exception"+e.getMessage());
		}	
	}

}
