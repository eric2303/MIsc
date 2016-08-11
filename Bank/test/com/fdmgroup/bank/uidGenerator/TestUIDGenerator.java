package com.fdmgroup.bank.uidGenerator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUIDGenerator {
	int accountID;
	int customerID;
	@Before
	public void setUp() throws Exception {
		accountID =  Generator.getInstance().getAccountID();
		customerID = Generator.getInstance().getCustomerID();
	}

	@Test
	public void testGetAccountID() {
		
		assertTrue(Generator.getInstance().getAccountID()==(accountID+5));
	}

	@Test
	public void testGetCustomerID() {
		int result = Generator.getInstance().getCustomerID(); 
		assertTrue(result==(customerID+7));
	}

}
