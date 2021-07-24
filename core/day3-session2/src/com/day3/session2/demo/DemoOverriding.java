package com.day3.session2.demo;

class A {
	void foo() {
		System.out.println("I");
	}
}

class B extends A {
	public void foo() {
		System.out.println("II");
	}
}

class C extends A {
	public void foo() {
		System.out.println("III");
	}
}

public class DemoOverriding {

	public static void main(String[] args) {

		// ClassCastException

		A a1 = new B();
		A a2 = new C();

		// instanceOf operator?
		// C++ RTTI (Run time type identitication) vs instanceOf

		if (a2 instanceof B) {
			B b1 = (B) a2;
		} else
			System.out.println("incomptable type");

		// B b=new A();

		// why?
		// u cant reduce the visiblity of method that is overriden
		// logically?
//		A a=new B();
//		a.foo();

	}
}
