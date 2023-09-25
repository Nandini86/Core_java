package com.tns.exception;

public class NestedTryCatch {
	
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("String length"+slength);
		String anotherString="hello";
		int y=6;
		try {// outer try
			try {
				System.out.println(str.charAt(y));// exception occured
			}
			catch(ArithmeticException  ex) {
				System.out.println("Airthemtion exception"+ex.getMessage());
			}
			
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println("indexoutofbound"+ex.getMessage());
			}
			//System.out.println("string length"+ anotherString.length());
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception is thrown"+ npe.getMessage());
		}
	}

}
