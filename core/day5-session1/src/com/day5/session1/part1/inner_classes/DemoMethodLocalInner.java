package com.day5.session1.part1.inner_classes;
class Foo{
	//method local inner class
	
	public void foo() {
		final int i=88;
		class Bar{
			public void doBar() {
				System.out.println("demo do bar..."+ i);
			}
		}
		
		Bar bar=new Bar();
		bar.doBar();
	}
}
public class DemoMethodLocalInner {

	public static void main(String[] args) {
		Foo f=new Foo();
		f.foo();
	}
}
