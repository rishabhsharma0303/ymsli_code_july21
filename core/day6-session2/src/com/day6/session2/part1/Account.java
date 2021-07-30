package com.day6.session2.part1;
//sort some customer class ( u created it)
//Comparable vs Comparator

import java.util.Comparator;

//Extra sort seq

class AccountBalanceSorterThenName implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		int val= Double.compare(o2.getBalance(), o1.getBalance());
		if(val==0) {
			val= o1.getName().compareTo(o2.getName());
		}
		return val;
	}
	
}

class AccountBalanceSorter implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return Double.compare(o2.getBalance(), o1.getBalance());
	}
	
}


class AccountNameSorter implements Comparator<Account>{
	@Override
	public int compare(Account o1, Account o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
final class Account implements Comparable<Account>  {
	private int id;
	private String name;
	private double balance;

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
	public int compareTo(Account a) {
		return Integer.compare(this.getId(), a.getId());
	}

}