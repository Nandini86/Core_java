package com.tns.collection;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generic class with string type datamember
		GenericClass<String>stringobj=new GenericClass<String>();
		stringobj.set("hello");
		System.out.println(stringobj.get());
		//generic class with integer type datamember
		GenericClass<Integer>intobj=new GenericClass<Integer>();
		intobj.set(10);
		System.out.println(intobj.get());
		
	}

}
