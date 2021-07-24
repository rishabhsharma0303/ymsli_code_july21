package com.day4.session1.ex3;
//Interface can improve the design of application
//making app Zoo
interface Swimmable{
	public void swim();
}

interface Flyable{
	public void fly();
}

class Bird{
	public void eat() {
		System.out.println("eating ....");
	}
}
//SOLID: LSP
class Eagle extends Bird implements Flyable{
	
	public void fly() {
		System.out.println("flying like anything........");
	}
}

class Duck extends Bird implements Swimmable{
	
	public void swim() {
		System.out.println("swim like anything........");
	}
}

public class InterfaceImproveTheDesign {

	public static void main(String[] args) {
		Duck duck=new Duck();
		duck.eat();
	}
}
