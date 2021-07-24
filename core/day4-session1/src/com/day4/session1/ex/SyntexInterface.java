package com.day4.session1.ex;

//
interface A{
	public static final int i=10;
	 void foo();
}

interface B{
	public static final int i=30;
	void foo();
}

interface C extends A, B{
	void abc();
}

abstract class D implements C{
	@Override
	public void foo() {
	
	}
}

//class D {
//	void foof() {
//		System.out.println("foof of class D");
//	}
//}
//class C extends D implements A, B{
//
//	public void foo() {
//		System.out.println("foo method is overrident :"+B.i);
//	}
//	
//}


public class SyntexInterface {

	public static void main(String[] args) {
//		A a=new C();
//		a.foo();
	}
}
