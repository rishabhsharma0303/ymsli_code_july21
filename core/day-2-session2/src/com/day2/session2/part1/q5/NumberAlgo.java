package com.day2.session2.part1.q5;

public class NumberAlgo {
	public static boolean checkPrime(int no) {
		boolean isPrime=true;
		
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
