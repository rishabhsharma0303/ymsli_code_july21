package com.day7.session2;

class MyClass<T>{
	private T i;

	public T getI() {
		return i;
	}

	public void setI(T i) {
		this.i = i;
	}
}
public class DemoGenericsClass {

	public static void main(String[] args) {
		MyClass<Integer> templateIntegers=new MyClass<>();
		templateIntegers.setI(33);
		System.out.println(templateIntegers.getI());
		
		MyClass<Double> templateDoubles=new MyClass<>();
		
	}
}
