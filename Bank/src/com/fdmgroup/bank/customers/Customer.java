package com.fdmgroup.bank.customers;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.bank.accounts.Account;
import com.fdmgroup.bank.uidGenerator.Generator;

public abstract class Customer {
	private int id;
	private String name;
	private String address;
	private int taxID;
	private List<Account> accountList;
	public Customer(String name, String address, int taxID) {
		this.id = Generator.getInstance().getCustomerID();
		this.name = name;
		this.address = address;
		this.taxID = taxID;
		this.accountList = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTaxID() {
		return taxID;
	}
	public void setTaxID(int taxID) {
		this.taxID = taxID;
	}
	public int getId() {
		return id;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void addAccount(Account account){
		this.accountList.add(account);
	}
	public void removeAllAccount(){
		accountList.clear();
	}

}
