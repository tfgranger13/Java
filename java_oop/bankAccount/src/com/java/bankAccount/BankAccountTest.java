package com.java.bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount testAccount = new BankAccount();
		testAccount.deposit("Savings", 5000);
		System.out.println(BankAccount.getTotalAccounts());
		BankAccount.totalMoney();
		testAccount.deposit("Checking", 2000);
		System.out.println(BankAccount.getTotalAccounts());
		BankAccount.totalMoney();
		BankAccount testAccount2 = new BankAccount();
		testAccount2.deposit("Savings", 3000);
		System.out.println(BankAccount.getTotalAccounts());
		BankAccount.totalMoney();
		
		testAccount.withdraw("Savings", 7000);
		System.out.println(BankAccount.getTotalBalance());
		testAccount2.withdraw("Savings", 2000);
		testAccount2.getSavingsBalance();
		BankAccount.totalMoney();
	}

}
