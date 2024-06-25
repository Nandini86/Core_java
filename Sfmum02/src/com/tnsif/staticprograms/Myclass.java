package com.tnsif.staticprograms;

public class Myclass {
	private int section;// instance variable
	private static int srNo;// static variable
	static {// static block
		System.out.println("---Static Block");
		srNo=1000;
		
	}
	Myclass(){// default constructor
		System.out.println("----default constructor-------");
		srNo++;
		section++;
		
	}
	
	static void display() {// static method
		System.out.println("----Static method-------");
		System.out.println("serialno is" +srNo);
	}

	@Override
	public String toString() {
		return "Myclass [serialno=" + srNo + "]";
	}

}
