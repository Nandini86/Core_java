package com.tns.abstraction;
// program to demonstrate abstract 
public abstract class Shape {
	protected  float area;
	abstract void calArea();// abstarct method
	// concrete method
	void show() {
		System.out.println("area of shape is"+area);
	}

}
