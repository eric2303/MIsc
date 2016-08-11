package com.fdmgroup.bank.customers;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	private final List<Customer> customerList;
	public Customers() {
		this.customerList = new ArrayList<Customer>();
	}
	public void addCustomer(Customer customer){
		customerList.add(customer);
	}
	public void removeCustomer(Customer customer){
		customer.removeAllAccount();
		customerList.remove(customer);
	}

}
