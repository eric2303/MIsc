package com.fdmgroup.bank.accounts;

import com.fdmgroup.bank.customers.Customer;

public abstract class SavingAccount extends Account{
	private float interestRate;
	public SavingAccount(Customer customers) {
		super(customers);
		this.interestRate = 0;
		
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public void withdraw(float amount) {
		if((this.getBalance() - amount)>0){
			this.withdraw(amount);
		}
	}

}
