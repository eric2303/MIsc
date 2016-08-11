package com.fdmgroup.bank.accounts;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fdmgroup.bank.customers.PersonalCustomer;

public class testCheckingAccount {
	PersonalCheckingAccount checkingAccount;
	@Before
	public void setUp() throws Exception {
		checkingAccount = new PersonalCheckingAccount(new PersonalCustomer("Eric", "Toronto", 1));
	}

	@Test
	public void testNextCheck() {
		int result = checkingAccount.nextCheck();
		assertTrue(result==0);
		result = checkingAccount.nextCheck();
		assertTrue(result==1);
	}

	@Test
	public void testWithdraw() {
		Float result = checkingAccount.getBalance();
		assertTrue(result==0.0);
		checkingAccount.withdraw(10);
		result = checkingAccount.getBalance();
		assertTrue(result==-10.0);
	}
	
	@Test
	public void testDeposit(){
		Float result = checkingAccount.getBalance();
		assertTrue(result==0.0);
		checkingAccount.deposit(10);;
		result = checkingAccount.getBalance();
		assertTrue(result==10.0);
	}

}
