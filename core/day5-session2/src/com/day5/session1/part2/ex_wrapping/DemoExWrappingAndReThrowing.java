package com.day5.session1.part2.ex_wrapping;

class MyMathExcption extends Exception {
	private static final long serialVersionUID = -4100101218630979055L;

	public MyMathExcption(Throwable cause) {
		super(cause);
	}
}

class MyMathClass {

	public static int divide(int a, int b)throws MyMathExcption {
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			throw new MyMathExcption(e);
		}
		return c;
	}
}

public class DemoExWrappingAndReThrowing {

	public static void main(String[] args) {
		try {
			System.out.println(MyMathClass.divide(5, 0));
		} catch (MyMathExcption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
