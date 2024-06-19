package com.tns.lamdaprograms;

public class ThredDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{System.out.println("hi");};
		Thread t1=new Thread(r);
		t1.start();

	}

}
