package com.day7.session2;

class Foo {
	//t1
	private Object lock=new Object();
	private Object lock2=new Object();
	
	public  void print() {
		synchronized(lock) {
			System.out.println("print method");
		}
		
	}

	//t2
	public void print2() {
		synchronized (lock2) {
			System.out.println("print2 method");
		}
	}
}

public class DemoThreadDoubt {

	public static void main(String[] args) {

	}
}
