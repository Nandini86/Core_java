package com.tns.finalthings;
// program to demonstrate final variable
public class FinalVariable {
	//final int x; error
	final int x;
	final static int z=10;
	final static int m;
	
	void change(){
		x=30;
		z=35;
	}
	static {
		z=666;
		m=22;
	}
	
	
	
	

}
