package com.day6.session2.demo_set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class DemoSet {
	
	public static void main(String[] args) {
		
		//User define hashSet?
		Set<Account> set=new HashSet<Account>();
		set.add(new Account(12, "raj", 600));
					//?
		
		System.out.println(set.contains(new Account(12, "raj", 600)));
		//T vs F
		
		
		
		
		
		
		
		
		
		
		
		
		
		//user define TreeSet
		
//		Comparator<Account> comparator=new Comparator<Account>() {
//
//			@Override
//			public int compare(Account o1, Account o2) {
//				return Double.compare(o2.getBalance(), o1.getBalance());
//			}
//		};
//		
//		Set<Account> set=new TreeSet<Account>(comparator);
//		set.add(new Account(12, "raj", 600));
//		set.add(new Account(1, "amit", 400));
//		set.add(new Account(102, "foo", 900));
//		set.add(new Account(1332, "tarun", 200));
//		
//		for(Account account: set) {
//			System.out.println(account);
//		}
//		
//		
		
		
		
		
		
		//find the unique words form the file...
		
		
	
		
//		
//		Set<String> set=new TreeSet<String>();	//Red black tree algo*
//		set.add("foo");
//		set.add("bar");
//		
//		set.add("foo");
//		set.add("jar");
//		
//		set.add("car");
//		set.add("pen");
//		//Ordered but not sorted...
//		System.out.println(set);
//		System.out.println(set.contains("foo"));
		
		
//		Set<String> set=new LinkedHashSet<String>();
//		set.add("foo");
//		set.add("bar");
//		
//		set.add("foo");
//		set.add("jar");
//		
//		set.add("car");
//		set.add("pen");
//		//Ordered but not sorted...
//		System.out.println(set);
//		System.out.println(set.contains("foo"));
		
		//HashSet ----(HashMap)
//		Set<String> set=new HashSet<String>();
//		set.add("foo");
//		set.add("bar");
//		
//		set.add("foo");
//		set.add("jar");
//		
//		set.add("car");
//		set.add("pen");
//		//HashSet :neigher sorted nor ordered.... Hashing .. lookng up O(1)*
//		System.out.println(set);
//		System.out.println(set.contains("foo"));
	}

}
