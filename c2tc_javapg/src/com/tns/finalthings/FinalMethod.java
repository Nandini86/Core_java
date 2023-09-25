package com.tns.finalthings;
// program to demonstrate final method
 class FinalMethod {
	FinalMethod(){
		System.out.println("default constructor");
		
	}
	void display() {
		System.out.println("hello");
	}
	final int a=22;
	// final method
	final void show() {
		System.out.println("value of a"+ a);
		
	}
}
