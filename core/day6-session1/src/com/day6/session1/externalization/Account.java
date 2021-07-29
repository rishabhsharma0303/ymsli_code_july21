package com.day6.session1.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class Account implements Externalizable{
	private int id;
	private String name;
	private double balance;
	 static String bankName="SBI green park";
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//you decide what you want to save
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//what u want to read
	}
	
	
	
}