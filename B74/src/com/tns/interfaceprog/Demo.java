package com.tns.interfaceprog;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Amazon a=new Amazon();
		Amazon a= new NonPrime();
		Amazon p=new Prime();
		p.welcome();
		p.subscribe();
		Amazon.aboutUs();
		
	}

}
