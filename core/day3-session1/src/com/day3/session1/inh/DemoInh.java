package com.day3.session1.inh;
class A{
	private int i;
	
	A(int i){
		super();
		this.i=i;
	}
	
	public void printA() {
		System.out.println("value of i: "+ i);
	}
}
class B extends A{
	private int j;
	
	B(int i, int j){
		super(i);
		this.j=j;
	}
	public void printB() {
		super.printA();
		System.out.println("value of j: "+ j);
	}
}
class C extends B{
	private int k;
	public C(int i, int j, int k) {
		super(i, j);
		this.k=k;
	}
	
	public void printC() {
		super.printB();
		System.out.println("value of k: "+ k);
	}
}
public class DemoInh {
	public static void main(String[] args) {
		C c=new C(2,4,6);
		c.printC();
	}

}



