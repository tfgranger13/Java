package com.java.bankAccount;

public class BankAccount {

	// attributes
	private double checkingBalance;
	private double savingsBalance;

	// Create a class member (static) that has the number of accounts created thus
	// far
	private static int totalAccounts;

	// Create a class member (static) that tracks the total amount of money stored
	// in every account created
	private static double totalBalance;

	// getters and setters
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public static int getTotalAccounts() {
		return totalAccounts;
	}

	public static void setTotalAccounts(int totalAccounts) {
		BankAccount.totalAccounts = totalAccounts;
	}

	public static double getTotalBalance() {
		return totalBalance;
	}

	public static void setTotalBalance(double totalBalance) {
		BankAccount.totalBalance = totalBalance;
	}

	// constructor
	public BankAccount() {

		// In the constructor, be sure to increment the account count
		BankAccount.setTotalAccounts(BankAccount.getTotalAccounts() + 1);

	}

	// Create a method that will allow a user to deposit money into either the
	// checking or saving, be sure to add to total amount stored
	public void deposit(String type, double amount) {
		if (type == "Checking") {
			this.setCheckingBalance(this.getCheckingBalance() + amount);
			BankAccount.setTotalBalance(BankAccount.getTotalBalance() + amount);
			System.out.println("You deposited $" + amount + " into your " + type + " account.");
		} else if (type == "Savings") {
			this.setSavingsBalance(this.getSavingsBalance() + amount);
			BankAccount.setTotalBalance(BankAccount.getTotalBalance() + amount);
			System.out.println("You deposited $" + amount + " into your " + type + " account.");
		} else {
			System.out.println("Please enter 'Checking' or 'Savings' for the account type.\n");
		}
	}

	// Create a method to withdraw money from one balance. Do not allow them to
	// withdraw money if there are insufficient funds
	public void withdraw(String type, double amount) {
		if (type == "Checking") {
			if (this.getCheckingBalance() < amount) {
				System.out.println("I'm sorry, you do not have that much to withdraw from that account.");
			} else {
				this.setCheckingBalance(this.getCheckingBalance() - amount);
				BankAccount.setTotalBalance(BankAccount.getTotalBalance() - amount);
				System.out.println("You withdrew $" + amount + " from your " + type + " account.");
			}
			
		} else if (type == "Savings") {
			if (this.getSavingsBalance() < amount) {
				System.out.println("I'm sorry, you do not have that much to withdraw from that account.");
			} else {
				this.setSavingsBalance(this.getSavingsBalance() - amount);
				BankAccount.setTotalBalance(BankAccount.getTotalBalance() - amount);
				System.out.println("You withdrew $" + amount + " from your " + type + " account.");
			} 
			
		} else {
				System.out.println("Please enter 'Checking' or 'Savings' for the account type.\n");
		}
	}

	// Create a method to see the total money from the checking and saving
	public static void totalMoney() {
		System.out.println("The bank curently has this many dollars: " + BankAccount.getTotalBalance());
	}
}
