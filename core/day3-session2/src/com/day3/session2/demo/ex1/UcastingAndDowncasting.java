package com.day3.session2.demo.ex1;

class A{
	void foo() {
		System.out.println("foo method of A");
	}
}
class B extends A{
	void foo() {
		System.out.println("foo method of B");
	}
	
	void fooOfB() {
		System.out.println("foo method of B only");
	}
}

class C extends A{
	void foo() {
		System.out.println("foo method of C");
	}
}

public class UcastingAndDowncasting {

	public static void main(String[] args) {
		
	
		A a=new B();
		a.foo();
		//from the ref of base type we cant call exclusive method of drive class
		((B) a).fooOfB();
		
		
		
		
		
		
		
		//upcasting
//		int i=55;
//		double j=i;
		
		//downcasting
//		double a=33.66;
//		int b=(int ) a;
		
	}
}
