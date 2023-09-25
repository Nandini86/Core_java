package com.tns.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>ar=new ArrayList<Student>();
		ar.add(new Student(222,"bbb","london"));
		ar.add(new Student(242,"aaa","nyc"));
		ar.add(new Student(121,"ccc","bang"));
		for(int i=0;i<ar.size();i++)
		System.out.println(ar.get(i));
		
		System.out.println("------------------");
		Collections.sort(ar,new SortbyRoll());
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		System.out.println("------------------");
		Collections.sort(ar,new SortbyName());
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		

		
	}

}
