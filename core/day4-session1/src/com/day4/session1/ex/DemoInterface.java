package com.day4.session1.ex;

class Human {
	void stayInHome() {
		System.out.println("stay inside home");
	}

}

interface Jumpable {
	public void jump();
}

class Monkey implements Jumpable {
	void stayOnTree() {
		System.out.println("stay on tree");
	}

	void biteAnyBody() {
		System.out.println("bite anybody...");
	}

	@Override
	public void jump() {
		System.out.println("jump of monkey you know ..");

	}

}

class Kid extends Human {
}

class SuperKid implements Jumpable{
	@Override
	public void jump() {
		System.out.println("i can jump as an monkey can do");
	}
}

public class DemoInterface {

	public static void main(String[] args) {
		SuperKid kid=new SuperKid();
		kid.jump();
		
	}
}
