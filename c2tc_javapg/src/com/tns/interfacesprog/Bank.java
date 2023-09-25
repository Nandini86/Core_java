package com.tns.interfacesprog;

public interface Bank {
	// by default it will be constant and final
	double MIN_BALANCE=1000;
	double DEPOSIT_LIMIT=25000;
	double INTREST_Rate=7.8;
	// default it will be public and abstract
	void deposit(Account account, double amount);
	void withdraw(Account account, double amount);

}
