package com.tns.lambda;

import java.util.ArrayList;

public class LambdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(50);
		li.add(20);
		li.add(660);
		 li.forEach(e->System.out.println(e));
		
	//	li.forEach(element->System.out.println(element));
		
		}
	}


