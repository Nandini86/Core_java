package com.tns.nestedinterface;

public interface MyInterface {// outer interface
	void calculateArea();
	interface MyInnerInterface{// inner interface
		int id=20;//static final by default
		void print();
	}
	

}
