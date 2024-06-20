package com.tnsif.daytwoprograms;
//Program to demonstarte constructor
public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
	
	public Customer() // explicit 
	{
		System.out.println("default Constructor");
	}
	
	public Customer(int customerId, String customerName,String customerCity ) // parameterized constructor
	{
		
		this.customerId=customerId;
		this.customerName= customerName;
		this.customerCity =customerCity;
		
		
	}
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}

	
}
