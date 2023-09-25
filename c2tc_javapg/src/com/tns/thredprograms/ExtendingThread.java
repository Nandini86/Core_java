package com.tns.thredprograms;
// create a thread by using extend thread class
public class ExtendingThread extends Thread {
	public void run() {// running state
		System.out.println("hello");
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread t=new ExtendingThread();//new state
		t.start();// runnable state
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}

}
