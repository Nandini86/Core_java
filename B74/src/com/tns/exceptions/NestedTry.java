package com.tns.exceptions;
// Program to demonstrate nested try block
public class NestedTry {
	public static void check() {
		String str="tns";
		int slength=str.length();
		int arr[] = null;
		
		int y=6;
		try {// outer try
			//int z=y/0;// exception occured
			try {// inner try
				
				System.out.println(arr[0]);// exception occurs
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {// inner catch
				System.out.println("Indexout of bound"+ex.getMessage());
			}
			catch(NullPointerException ex) {
				System.out.println("NullPointer"+ex.getMessage());
			}
			}
		catch(ArithmeticException  ex) {// outer  catch
			System.out.println("Arithmetic exception"+ex.getMessage());
		}
	}
	
	
}
