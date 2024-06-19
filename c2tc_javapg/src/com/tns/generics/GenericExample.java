package com.tns.generics;

public class GenericExample<T> {// Generic class
	
	T obj;// object of generic class
	
	void add(T obj) {
		this.obj=obj;
		
	}
	T get() {
		return obj;
	}
	

}
