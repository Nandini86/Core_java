package com.tns.thread;

public class CreatingThreadFirst  extends Thread{
	public void run() {
		System.out.println("hello");
		
	}
	
	

	public static void main(String[] args) {
		CreatingThreadFirst ob=new CreatingThreadFirst();// new
		ob.start();// runnable state
		//ob.start();

		ob.run();
		ob.run();
		
		
	}

}
