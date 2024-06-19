package com.tns.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOperations {
	
	void allOperations() {
		
		//created an integer array which is the source
		Integer[] values=new Integer[] {1,2,3 ,4,5,6,7};
		// creating a stream using stream method
		Stream <Integer>st=Arrays.stream(values);
		// limit
		System.out.println("the first 2 no's in the array are");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		// skip
		System.out.println("skip first  2 no's in the array are");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		// filter
				System.out.println("no's greater than 5");
				st.filter(num->num>5).map(num->num*num).forEach(System.out::println);
				
				
		
	}

}
