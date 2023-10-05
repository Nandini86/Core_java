// Program to illustrate Data Encapsulation
package com.tnsif.prog;

public class Encapsulation {
	protected int serialnum;// datamembers
	 public String name;
	int age;
	public void show()// member function
	{
		System.out.println("serial number"+serialnum+ "\t Name: "+name  +"\t Age :"+ age);
	}
public Encapsulation(){// explici default constructor
	System.out.println("heelo");
}
}
