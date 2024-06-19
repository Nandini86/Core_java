package com.tns.collection;

public class WrapperDemo {

	public static void main(String[] args) {
		// wrapping
		int a=10;// primitive
		Integer i= new Integer(a);// to object type
		System.out.println("i is a object of type integer"+i);
		// unwrapping
		int unwrap=i.intValue();
	}

}
