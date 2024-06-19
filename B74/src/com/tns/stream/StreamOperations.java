package com.tns.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] values=new Integer[] {3,4,7,8,7,3};// get the inputr
		Stream<Integer> stream = Arrays.stream(values);
		
		// map function

		System.out.println("square of no"+Arrays.toString(values));
		stream.map(num->num*num).forEach(System.out::println);
		
		//limit returns first 2 elements
		System.out.println("first 2 elements");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		//limit skip first 2 elements
				System.out.println(" skip first 2 elements");
				Arrays.stream(values).skip(2).forEach(System.out::println);
		List <Integer>list=Arrays.asList(1,1,3,4,5,3,2);	
		System.out.println("distinct elements");
	long c=	list.stream().distinct().count();
		System.out.println(c);
		
		
	}

}
