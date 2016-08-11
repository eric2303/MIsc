package com.fdmgroup.bank.customers;

import com.fdmgroup.bank.accounts.Account;

public class CompanyCustomer extends Customer{

	public CompanyCustomer(String name, String address, int taxID) {
		super(name,address,taxID);
	}
	public void addDeposit(float amount){
		for (Account account : getAccountList()){
			account.deposit(amount);
		}
	}

}
