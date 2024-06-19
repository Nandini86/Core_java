package com.tns.generics;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// generic example class work for string
		GenericExample <String>sobj=new GenericExample<String>();
		sobj.add("hello");
		System.out.println(sobj.get());
		
		GenericExample <Integer>iobj=new GenericExample<Integer>();
		iobj.add(22);
		System.out.println(iobj.get());
		
		
	}

}
