package com.tns.exceptions;

public class NestedCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] arr={1,2,3};
			System.out.println(arr[5]);
			int x=2/0;
		}
		
		
		catch(ArithmeticException  ex) {// outer  catch
			System.out.println("Arithmetic exception"+ex.getMessage());
		}	
		catch(ArrayIndexOutOfBoundsException ex) {// inner catch
			System.out.println("Indexout of bound"+ex.getMessage());
			
			}
		
			
		
	}
}
