package com.tns.generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// created an object of type string
		GenericClass <String>stringobj=new GenericClass();
		stringobj.set("hello");
		System.out.println(stringobj.get());
		
		GenericClass <Integer>intobj=new GenericClass();
		intobj.set(22);
		System.out.println(intobj.get());
		
		GenericClass <Double>floatobj=new GenericClass();
		floatobj.set(6.6);
		System.out.println(floatobj.get());

	}

}
