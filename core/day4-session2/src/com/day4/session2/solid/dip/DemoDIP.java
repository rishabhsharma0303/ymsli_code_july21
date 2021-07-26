package com.day4.session2.solid.dip;
class Tyre{
	private String brand;
	private double price;
	public Tyre(String brand, double price) {
		this.brand=brand;
		this.price=price;
	}
}

class Engine{
	private String engineStrengh;
	public Engine(String engineStrengh) {
		this.engineStrengh=engineStrengh;
	}
}
//
//SOLI D: DIP
class Car{
	
	private Tyre tyre;
	private Engine engine;
	
	public Car(Tyre tyre, Engine engine) {
		this.engine=engine;
		this.tyre=tyre;
	}
	public void move() {
		///
	}
	
}

public class DemoDIP {

	public static void main(String[] args) {
		Engine engine=new Engine("4000");
		Tyre tyre=new Tyre("mrf",6000);
		
		Car car=new Car(tyre, engine);
		
	}
}
