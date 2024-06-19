package com.tns.lambda;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Greet g=(int a)->{return a*a;};
//		System.out.println(g.square(6));
		
		ArrayList <Integer>l= new ArrayList<>();
		
		l.add(55);
		l.add(56);
		l.add(76);
		l.forEach(element->System.out.println(element));
	}

}
