package com.fdmgroup.bank.customers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.bank.accounts.Account;
import com.fdmgroup.bank.accounts.BusinessCheckingAccount;
import com.fdmgroup.bank.accounts.BusinessSavingsAccount;

public class TestCompanyCustomer {
	CompanyCustomer customer;
	@Before
	public void setUp() throws Exception {
		customer = new CompanyCustomer("Eric", "Toronto", 3);
		customer.addAccount(new BusinessCheckingAccount(customer));
		customer.addAccount(new BusinessSavingsAccount(customer));
	}

	@Test
	public void testAddDeposit() {
		customer.addDeposit(1000);
		for (Account account : customer.getAccountList()){
			assertTrue(account.getBalance()==1000.0);
		}
	}

}
