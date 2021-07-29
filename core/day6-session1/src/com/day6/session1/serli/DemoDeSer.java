package com.day6.session1.serli;

import java.io.*;

public class DemoDeSer {

	public static void main(String[] args) {
		// we want to recover that object back
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo.txt")));

			Account account = (Account) ois.readObject();
			System.out.println(account);
			System.out.println(account.bankName);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
