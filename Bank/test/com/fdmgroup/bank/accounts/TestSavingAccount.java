package com.fdmgroup.bank.accounts;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.bank.customers.PersonalCustomer;

public class TestSavingAccount {
	PersonalSavingAccount savingAccount;
	@Before
	public void setUp() throws Exception {
		savingAccount = new PersonalSavingAccount(new PersonalCustomer("Eric", "Toronto", 2));
	}

	@Test
	public void testWithdraw() {
		Float result = savingAccount.getBalance();
		assertTrue(result==0.0);
		savingAccount.withdraw(10);
		result = savingAccount.getBalance();
		assertTrue(result==0.0);
	}

	@Test
	public void testGetInterestRate() {
		Float result = savingAccount.getInterestRate();
		assertTrue(result==0.0);
	}

	@Test
	public void testSetInterestRate() {
		savingAccount.setInterestRate((float) 10.0);
		Float result = savingAccount.getInterestRate();
		assertTrue(result==10.0);
	}

}
