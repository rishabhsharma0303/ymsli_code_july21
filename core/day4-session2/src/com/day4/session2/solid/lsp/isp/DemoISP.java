package com.day4.session2.solid.lsp.isp;
//dont write the God class
//Seprate what various : Head first design patten, head first ooad, so

interface Swimable{
	public void swim();
}

interface Flyable{
	public void fly();
}
class Bird{
	public void eat() {
		//
	}
}

class Emu extends Bird{
	
}

class Duck extends Bird implements Swimable{

	@Override
	public void swim() {
		System.out.println("Swimm like anything...");
	}
	
}

class Eager extends Bird implements Flyable{
	@Override
	public void fly() {
		System.out.println("champ of sky...");
	}
	
}
public class DemoISP {

	public static void main(String[] args) {
		
	}
}
