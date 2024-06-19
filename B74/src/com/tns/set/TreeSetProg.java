package com.tns.set;
import java.util.Iterator;
//Progran to demonstrate treesetoperations
import java.util.TreeSet;

public class TreeSetProg {
public static void treeSetOperations() {
	TreeSet<Integer>num_treeset=new TreeSet<>();
	num_treeset.add(76);
	num_treeset.add(56);
	num_treeset.add(156);
	num_treeset.add(16);
	//num_treeset.add(null);// exception arises
	System.out.println("tresset elements are"+num_treeset);
	// call iterator
	Iterator<Integer>iter=num_treeset.iterator();
	System.out.println("elements of iterator are");
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
}
}
