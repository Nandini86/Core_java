package com.tns.lambda;

public class Withoutparameters {

	public static void main(String[] args) {
	Message m=()->{return "hello";};
	System.out.println(m.greet());
	}

}
