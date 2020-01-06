package br.com.conta.classes;

import br.com.conta.interfaces.Accountable;

public class Account implements Accountable {
	private String agency;
	private String accountNumber;
	private double balance;
	private int accountType;
	
	public Account(String agency, String accountNumber, int accountType) {
		this.agency = agency;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = 0;
	}

	public String getAgency() {
		return agency;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double value) {
		if(balance >= value) {
			System.out.println("Withdrawing from account number " + getAccountNumber() + "...");
			balance = balance - value;
			System.out.println("Withdrawing has made successfully! Current balance: " + getBalance());
		} else {
			System.out.println("You do not have enough balance.");
			System.out.println("Your current balance is US$ " + balance);
		}
	}

	@Override
	public void deposit(double value) {
		System.out.println("Depositing into account number " + getAccountNumber() + "...");
		balance = calcDeposit(value);
		System.out.println("Deposit has made successfully! Current balance: " + getBalance());
	}

	public int getAccountType() {
		return accountType;
	}
	
	private double calcDeposit(double value) {
		return balance + value * getAccountType();
	}
}
