package com.day3.session1.inh;

class Foo{
	
	 private static int i=66;
	
	 static void foo(Double s){
		System.out.println("I");
	}
}

class FooExt extends Foo{
	 static int i=606;
	 
	static void foo(Number s){
		System.out.println("II"+ i);
	}
}

public class DemoOverloading {

	public static void main(String[] args) {
		
	}
	
}
