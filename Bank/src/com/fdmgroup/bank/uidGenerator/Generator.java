package com.fdmgroup.bank.uidGenerator;

public class Generator {
	private int accountID = 1000;
	private int customerID = 2000000;
	private static Generator instance = null;
	private Generator() {
		//this do nothing
	}
	public static Generator getInstance(){
		if (instance == null){
			instance = new Generator();
		}
		return instance;
	}
	public int getAccountID(){
		int id = accountID;
		accountID += 5;
		return id;
	}
	public int getCustomerID(){
		int id = customerID;
		customerID += 7;
		return id;
	}

}
