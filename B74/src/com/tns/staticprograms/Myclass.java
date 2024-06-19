package com.tns.staticprograms;
//program to demonstrate static method and block
public class Myclass {

	private int section;// instance variable
	private static int srNo;// static variable
	
	// static block
	static {
		System.out.println("----staticblock--------");
		srNo=1000;
	}
	//default constructor
	Myclass(){
		System.out.println("----default constructor--------");
		srNo++;
		section++;
	}
	
	
	// static method
		static void display() {
			//System.out.println("section"+section);
			System.out.println("serialNo"+srNo);
		}
		
	@Override
	public String toString() {
		return "Myclass [section=" + section + "]";
	}
	
}
