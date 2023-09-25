package com.tns.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point();
		System.out.println(p);
		Point p1=new Point(1.5f);
		System.out.println(p1);
		Point p2=new Point(1.5f,2.5f);
		System.out.println(p2);

	}

}
