package com.day7.session2;
import java.util.*;
//<? extends XXX>
//<? super XXX>
//What is PECS (Producer Extends Consumer Super)?

public class DemoGenerics {

	public static void main(String[] args) {
		List<Job> jobs=new ArrayList<Job>();
		jobs.add(new Job(12, "amit", 2));
		
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(66);
		l1.add(6);
		l1.add(69);
		l1.add(7);
		
		List<Double> l2=new ArrayList<>();
		l2.add(66.9);
		l2.add(6.7);
		l2.add(69.5);
		l2.add(7.0);
		
		printAll(l1);
		printAll(l2);
		printAll(jobs);
		
	}
	//hey java anybody can pass a collection whose method have something to do with "Number"
	//it promise it will only iterate .. i will never change (give me error ...)

	
	private static void printAll(List<?> l1) {
		for(Object temp: l1) {
			System.out.println(temp);
		}
	}

//	private static void printAll(List<? extends Object> l1) {
//		for(Object temp: l1) {
//			System.out.println(temp);
//		}
//	}

//	private static void printIntList(List<Integer> l1) {
//		for(Integer temp: l1) {
//			System.out.println(temp);
//		}
//	}
	
//	private static void printDoubleList(List<Double> l2) {
//		for(Double temp: l2) {
//			System.out.println(temp);
//		}
//	}
}
