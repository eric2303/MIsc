package com.fdmgroup.bank.accounts;

import com.fdmgroup.bank.customers.Customer;

public abstract class CheckingAccount extends Account{
	private int checkNumber;
	public CheckingAccount(Customer customers) {
		super(customers);
		this.checkNumber = 0;
	}
	public int nextCheck(){
		int currCheck = this.checkNumber;
		this.checkNumber += 1;
		return currCheck;
	}

}
