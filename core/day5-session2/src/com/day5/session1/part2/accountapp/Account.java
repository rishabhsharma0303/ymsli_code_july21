package com.day5.session1.part2.accountapp;

class AccountCreationExcption extends RuntimeException {
	private static final long serialVersionUID = 7061679344050996138L;

	public AccountCreationExcption(String message) {
		super(message);
	}
}

class NotSufficientFundExcption extends RuntimeException {
	private static final long serialVersionUID = 7061679344050996138L;

	public NotSufficientFundExcption(String message) {
		super(message);
	}
}

class OverFundExcption extends RuntimeException {
	private static final long serialVersionUID = 7061679344050996138L;

	public OverFundExcption(String message) {
		super(message);
	}
}

public class Account {
	private int id;
	private String name;
	private double balance;

	// BL : min balane : 1000
	public Account(int id, String name, double balance) throws AccountCreationExcption{
		this.id = id;
		this.name = name;
		this.balance = balance;
		///
		if (this.balance <= 1000)
			throw new AccountCreationExcption("you must have min 1K");
	}

	// withdraw : 1000
	public void withdraw(double amount) {

	}
	// deposit : 5L

	public void deposit(double amount) {

	}
}
