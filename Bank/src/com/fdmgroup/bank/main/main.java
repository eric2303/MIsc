package com.fdmgroup.bank.main;


import com.fdmgroup.bank.accounts.Account;
import com.fdmgroup.bank.accounts.BusinessCheckingAccount;
import com.fdmgroup.bank.accounts.BusinessSavingsAccount;
import com.fdmgroup.bank.accounts.PersonalCheckingAccount;
import com.fdmgroup.bank.accounts.PersonalSavingAccount;
import com.fdmgroup.bank.customers.CompanyCustomer;
import com.fdmgroup.bank.customers.Customers;
import com.fdmgroup.bank.customers.PersonalCustomer;

public class main {


	public static void main(String[] args) {
			//a list of customers
			Customers customers = new Customers();
			CompanyCustomer businessCustomer = new CompanyCustomer("Eric Rao", "Toronto", 1);
			customers.addCustomer(businessCustomer);
			businessCustomer.addAccount(new BusinessSavingsAccount(businessCustomer));
			businessCustomer.addAccount(new BusinessCheckingAccount(businessCustomer));
			for (Account account : businessCustomer.getAccountList()){
				System.out.println(account.getAccountID());
			}
			businessCustomer.addDeposit(10);
			System.out.println();
			for (Account account : businessCustomer.getAccountList()){
				System.out.println(account.getBalance());
			}
			System.out.println();
			for (Account account : businessCustomer.getAccountList()){
				System.out.println(account.getCustomer().getName());
				
			}
			PersonalCustomer personalCustomer = new PersonalCustomer("Effie Huang", "Toronto", 2);
			customers.addCustomer(personalCustomer);
			personalCustomer.addAccount(new PersonalSavingAccount(personalCustomer));
			personalCustomer.addAccount(new PersonalCheckingAccount(personalCustomer));
			System.out.println();
			for (Account account : personalCustomer.getAccountList()){
				System.out.println(account.getAccountID());
			}
			System.out.println();
			for (Account account : personalCustomer.getAccountList()){
				System.out.println(account.getBalance());
				account.withdraw(10);
				System.out.println(account.getBalance());
			}
			System.out.println();
			personalCustomer.resetAccounts();
			for (Account account : personalCustomer.getAccountList()){
				System.out.println(account.getBalance());
			}
			System.out.println();
			for (Account account : personalCustomer.getAccountList()){
				System.out.println(account.getCustomer().getName());
				
			}
			
			

	}

}
