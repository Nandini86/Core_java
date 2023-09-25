package com.tns.constructor;
//program to demonstrate constructors
public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
	// default constructor
	public Customer() {
		System.out.println("default constructor");
	}
	// parameterized constructor
	public Customer(String customerName,int customerId,String customerCity) {
		this();// calling default constructor
		
		this.customerName=customerName;
		this.customerId=customerId;
		this.customerCity=customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	
//	@Override
//	public String toString() {
//		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
//				+ customerCity + "]";
//	}
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

}
