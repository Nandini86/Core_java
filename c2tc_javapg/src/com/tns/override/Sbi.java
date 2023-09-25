package com.tns.override;

public class Sbi  extends Rbi {
	@Override
	super.getRateofIntrest();
	public float getRateofIntrest() // override the method
	{
		return 8.7f;
		//super.getRateofIntrest();

		
	}
	

}
