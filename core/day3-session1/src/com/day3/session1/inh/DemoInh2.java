package com.day3.session1.inh;
class P{
	static int i=7;
	
	//static metho never for overriding (run time X)
	// shodowing concept
	public static void foo() {
		System.out.println("i am foo method...");
	}
}

class Q extends P{
	 int i=77;
	
	public static void foo() {
			System.out.println("i am foo method..of class Q.");
	}
}

public class DemoInh2 {

	public static void main(String[] args) {
		Q  q=new Q();
		q.foo();
		
	}
}
