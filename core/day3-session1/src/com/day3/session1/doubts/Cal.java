package com.day3.session1.doubts;

public class Cal {

	public int add(int a, int b) {
		return a+b;
	}
	
	
	// new syntex: variable arg method ..
	public int add(int ...a) {
		//a= ref to the array
		int total=0;
		for(int temp: a) {
			total+=temp;
		}
		return total;
	}
	
	
//	public int add(int a[]) {
//		//a= ref to the array
//		int total=0;
//		for(int temp: a) {
//			total+=temp;
//		}
//		return total;
//	}
}
