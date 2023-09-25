package com.tns.staticprog;

public class MyClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MyClass.display();
		MyClass ob=new MyClass();// const invoke
		System.out.println(ob);
		MyClass.display();
		
		MyClass obOne=new MyClass();
		System.out.println(obOne);
		MyClass.display();
	}

}
