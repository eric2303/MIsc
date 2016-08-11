package com.fdmgroup.bank.accounts;

import com.fdmgroup.bank.customers.PersonalCustomer;

public class PersonalCheckingAccount extends CheckingAccount{

	public PersonalCheckingAccount(PersonalCustomer customer) {
		super(customer);
	}

}
