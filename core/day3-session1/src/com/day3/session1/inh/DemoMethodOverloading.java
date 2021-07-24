package com.day3.session1.inh;

class Cal{
	
//	public int add(int a, int b) {
//		System.out.println("public double add(int a, int b)");
//		return a+b;
//	}
	// Java 1.5: variable arg method ...
	
	public Integer add( int ...a) {
		System.out.println("public Integer add(int ...a)");
		int total=0;
		for(int temp: a) {
			total+=temp;
		}
		return total;
	}
	
	
	public Integer add(Integer a, Integer b) {
		System.out.println("public Integer add(Integer a, Integer b)");
		return a+b;
	}
	
//	public double add(double a, int b) {
//		System.out.println("public double add(double a, int b)");
//		return a+b;
//	}
//	public double add(int a, double b) {
//		System.out.println("public double add(int a, double b)");
//		return a+b;
//	}
	
	
//	public int add(int a, int b, int c) {
//		return a+b+c;
//	}
}

public class DemoMethodOverloading {
	
	public static void main(String[] args) {
		Cal c=new Cal();
		System.out.println(c.add(2, 2));
	}

}
