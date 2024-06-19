package com.tns.interfaceexampletwo;

public class NonPrime  implements Accounts{
	
int amt;

	
	public NonPrime(int amt) {
	super();
	this.amt = amt;
}


	@Override
	public void delivayCharges() {
		// TODO Auto-generated method stub
		System.out.println("deliverycharges"+amt);
		
	}

	

}
