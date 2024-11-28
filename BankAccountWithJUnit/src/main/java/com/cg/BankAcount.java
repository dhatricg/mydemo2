package com.cg;

public class BankAcount {
	double balance;
	 
	public BankAcount() {
		super();
		this.balance = 0.0;
	}
 
	public double getBalance() {
		return balance;
	}
 
	public void deposit(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("deposit should be positive");
		}
		balance= balance + amount;
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("withdraw should be positive");
		}
		if(amount > balance) {
			throw new IllegalArgumentException("insufficient funds");
		}
		balance = balance - amount;
	}

 
	

 

}
