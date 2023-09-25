package com.tns.exception;

import java.util.InputMismatchException;

// Try with multiple catch block
public class Division {
	public static void divide() {
		int a=6,b=0,c;
		try {
		c=a/b;
		System.out.println("Division is"+c);
		
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception caught"+e.getMessage());	
//		}
//		catch(InputMismatchException e) {
//			System.out.println("Exception caught"+e.getMessage());	
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Exception caught"+e.getMessage());	
//		}
	finally{
		System.out.println("Finally block executed");
		
	}
	}
}
