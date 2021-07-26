package com.day4.session2.inner;

class Outer {
	class Inner {
		public void doInner() {
			System.out.println("doInner code...");
		}
	}

	// inside static method java dont provide ..
	
	 public void getInner() {
		Inner inner = new Inner();
		inner.doInner();
	}
}

public class DemoTopLevelInnerClass {

	public static void main(String[] args) {

		Outer outer = new Outer();

		outer.getInner();
	}

}
