package com.tns.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {
	public static  void operations() {
		Set<Integer>numSet=new HashSet<Integer>();
		// add an element
		numSet.add(12);
		// add a list of numbers to the set
		numSet.addAll(Arrays.asList(new Integer[] {1,4,6,7,8}));
		System.out.println("set elements are"+numSet);
		//size
		System.out.println("set elements are"+numSet.size());
		//create a new set class and initialize with list of elements
		Set<Integer>oddSet=new HashSet<Integer>();
		oddSet.addAll(Arrays.asList(new Integer[] {1,3,7,5,9}));
		System.out.println("set elements are"+oddSet);
	//contains()
		System.out.println("numset contains element 3"+numSet.contains(3));
		// intersection=>retainAll
		Set<Integer>set_intersection=new HashSet<Integer>(numSet);
		set_intersection.retainAll(oddSet);
		System.out.println(set_intersection);
		
		//difference=>removeAll
		//union=>addAll
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
