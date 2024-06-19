package com.tns.lamdaprograms;
// program to demonstrate Runnable interface by using lamda expression
public class TestDemo {

	private static final String Null = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable basic=()->{ String threadName=Null;
System.out.println("thread name"+threadName);};

// Instantiating 2 threads
//	Thread thread1=new Thread (basic);
//	Thread thread2=new Thread (basic);
//	thread1.start();
//	thread2.start();
//	
	
	
	}

}
