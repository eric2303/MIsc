package com.fdmgroup.bank.accounts;

import com.fdmgroup.bank.customers.Customer;
import com.fdmgroup.bank.uidGenerator.Generator;

public abstract class Account {
	private int accountID;
	private float balance;
	private Customer customer;
	public Account(Customer customer) {
		this.accountID = Generator.getInstance().getAccountID();
		this.customer = customer;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getAccountID() {
		return accountID;
	}
	public void deposit(float amount){
		this.balance +=amount;
	}
	public void withdraw(float amount){
		this.balance -=amount;
	}
	public void correct(float amount){
		this.balance =amount;
	}
	public Customer getCustomer() {
		return customer;
	}
	

}
