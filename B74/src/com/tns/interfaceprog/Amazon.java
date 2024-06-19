// Program to demonstrate interface
package com.tns.interfaceprog;

public interface Amazon {
	void welcome();
	void subscribe();//abstract methods
	
	default void serviceCharge() {// default
		int amt=100;
		System.out.println("The membership charge is"+amt);
	}
	static void aboutUs() {// static
		System.out.println("The web service provider ");
		
	}

}
