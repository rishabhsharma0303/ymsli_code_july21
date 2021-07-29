package com.day6.session1.serli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
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
	
	
	
}
public class DemoSer {
	
	public static void main(String[] args) {
		
		Account account=new Account(1, "raj", 56);
		//decorator
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
			account.bankName="sbi preet vihar";
			
			oos.writeObject(account);
			System.out.println("ser is done");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}





