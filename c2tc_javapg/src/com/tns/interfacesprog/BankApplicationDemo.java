package com.tns.interfacesprog;

public class BankApplicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank=new BankImpl();
		Account account=new Account(123455,"suma",15550,bank);
		//deposit
		account.deposit(2000);
		System.out.println(account);
		// withdraw the money
		account.withdraw(10000);
		System.out.println(account);
	}

}
