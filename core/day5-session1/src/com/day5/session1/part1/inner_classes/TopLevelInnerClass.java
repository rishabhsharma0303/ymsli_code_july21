package com.day5.session1.part1.inner_classes;
class Outer{
	private int i=99;
	class Inner{
		private int i=5;
		public void doInnner() {
			System.out.println("doInner method..."+ Outer.this.i);
		}
	}
}
public class TopLevelInnerClass {
	
	public static void main(String[] args) {
		Outer.Inner in=new Outer().new Inner();
		in.doInnner();
	}

}
