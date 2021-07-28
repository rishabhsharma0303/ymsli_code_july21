package com.day5.session1.part1.ex_handing;

public class DemoFinally {

	/*
	 * finally: GPP: never ever throw ex from finally block ............... return
	 * values ......................
	 */
	public static void main(String[] args) {
		try{
			foo();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	private static void foo() {
		try {
			if (1 == 1)
				throw new NullPointerException();

		} finally {
			throw new ArithmeticException();
		}
	}

}
