package com.tns.scanner;

import java.util.Scanner;

public class PersonEXec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob=new Scanner(System.in);
		String name;
		System.out.println("enterperson name");
		name=ob.next();
		System.out.println("enter income");
		int income=ob.nextInt();
		
		Person  pp=new Person();//
		pp.setName(name);
		pp.setIncome(income);
		TaxClaculation calc=new TaxClaculation();
		calc.calculateTax(pp);
		System.out.println("after calculation tax");
		System.out.println(pp);
		
				

	}

}
