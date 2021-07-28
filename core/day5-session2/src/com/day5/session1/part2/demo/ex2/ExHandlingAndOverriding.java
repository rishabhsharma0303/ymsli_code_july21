package com.day5.session1.part2.demo.ex2;

import java.io.IOException;
import java.sql.SQLException;

class A {
	void foo() throws Throwable {
		System.out.println("foo of A");
	}
}

class B extends A {
	@Override
	void foo() throws SQLException{
		System.out.println("foo of B");
	}
}

public class ExHandlingAndOverriding {
	public static void main(String[] args) {

//		try {
//			A a = new B();
//			a.foo();
//
//		} catch (IOException ex) {
//
//		}
	}
}
