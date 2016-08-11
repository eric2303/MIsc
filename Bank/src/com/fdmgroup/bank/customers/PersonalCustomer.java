package com.fdmgroup.bank.customers;

import com.fdmgroup.bank.accounts.Account;

public class PersonalCustomer extends Customer{

	public PersonalCustomer(String name, String address, int taxID) {
		super(name,address,taxID);
	}
	
	public void resetAccounts(){
		for (Account account : getAccountList()){
			account.correct(0);
		}
	}

}
