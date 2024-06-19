package com.tns.override;

public class Sbi extends Rbi {
	public float getRateofIntrest() {
	System.out.println(	super.getRateofIntrest());// super class method
		
		return 5.5f;
		
	}
}
