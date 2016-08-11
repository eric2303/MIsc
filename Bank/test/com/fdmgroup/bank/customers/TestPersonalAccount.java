package com.fdmgroup.bank.customers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.bank.accounts.Account;
import com.fdmgroup.bank.accounts.PersonalCheckingAccount;
import com.fdmgroup.bank.accounts.PersonalSavingAccount;

public class TestPersonalAccount {
	PersonalCustomer customer;
	@Before
	public void setUp() throws Exception {
		customer = new PersonalCustomer("Eric", "Toronto", 3);
		customer.addAccount(new PersonalCheckingAccount(customer));
		customer.addAccount(new PersonalSavingAccount(customer));
	}

	@Test
	public void testResetAccounts() {
		for (Account account : customer.getAccountList()){
			account.deposit(1000);
		}
		customer.resetAccounts();
		for (Account account : customer.getAccountList()){
			assertTrue(account.getBalance()==0.0);
		}
	}

}
