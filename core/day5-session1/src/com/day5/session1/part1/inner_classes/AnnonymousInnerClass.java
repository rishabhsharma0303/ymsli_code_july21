package com.day5.session1.part1.inner_classes;

/*
 * dont have any name: it can not have ctr!
 */
interface Cookable {
	public void cook();
}

class StreetFood implements Cookable {
	@Override
	public void cook() {
		System.out.println("Street food...");
	}
}

public class AnnonymousInnerClass {
	public static void main(String[] args) {

		// bad thing to be used
		
		// Java 8* : lambda expression vs ann inner class, =>
		Cookable cookable3 = () ->System.out.println("cooking hotel food...");
			
	

		Cookable cookable = new Cookable() {

			@Override
			public void cook() {
				System.out.println("cooking hotel food...");
			}
		};

		Cookable cookable2 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("cooking hotel food.v2..");
			}
		};
	}

}
