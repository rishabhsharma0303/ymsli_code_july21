package com.day5.session1.part2.ex_handing;

public class DemoCircle {

	public static void main(String[] args) {
		try {
			Circle circle = new Circle(-3);
			System.out.println(circle.calArea());
		
		}catch(NegativeRadiusException e) {
			System.out.println(e.getMessage());
		}
	}
}
