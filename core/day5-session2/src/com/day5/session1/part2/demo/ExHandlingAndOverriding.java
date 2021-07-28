package com.day5.session1.part2.demo;

//Overriden method badi ex nahi throw kar sakta hey!
class PEx extends Exception {}

class QEx extends PEx {}

class A {
	void foo() throws QEx {
		System.out.println("foo of A");
	}
}

class B extends A {
	@Override
	void foo() throws PEx {
		System.out.println("foo of B");
	}
}

public class ExHandlingAndOverriding {
	public static void main(String[] args) {

		try {
			A a = new B();
			a.foo();
		} catch (QEx e) {
			e.printStackTrace();
		}
	}
}
