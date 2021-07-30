package com.day6.session2.part1;
import java.util.*;
public class HowToSortUserDefineData {
	
	public static void main(String[] args) {
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(new Account(129, "naveen", 5000));
		accounts.add(new Account(127, "neeta", 5000));
		accounts.add(new Account(1002, "ravi", 4900));
		accounts.add(new Account(12, "raj", 4000));
		accounts.add(new Account(102, "ekta", 4200));
		
		
		//
		
		printAccounts(accounts);
		
		Collections.sort(accounts);//open for ext close for modification !
		
		System.out.println("--------sorted as per id------");
		printAccounts(accounts);
		
		Collections.sort(accounts, new AccountNameSorter());
		System.out.println("--------sorted as per account holder name------");
		printAccounts(accounts);
		
		Collections.sort(accounts, new AccountBalanceSorter());
		System.out.println("--------sorted as per account holder balance ------");
		printAccounts(accounts);
		
		//Ann inner class
		
		Comparator<Account> comparator=new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return Integer.compare(o2.getId(), o1.getId());
			}
		};
		
		Collections.sort(accounts, comparator);
		
		System.out.println("--------sorted as per account id(rev)------");
		printAccounts(accounts);
		
		
		//Data procssing : python :)
		//Java 8: stream processing of data ==> sql ==> declaritive data processing*
		//Java 9: modularity * jdk modualrity , ms
		//....
	}

	private static void printAccounts(List<Account> accounts) {
		System.out.println("-----printing accounts details --------");
		Iterator<Account> it=accounts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------------");
	}

}
