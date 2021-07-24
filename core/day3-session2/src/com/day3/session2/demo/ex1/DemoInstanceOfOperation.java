package com.day3.session2.demo.ex1;

//instanceOf : run time type checking
//Write a app: Animal : Cat sound, Dog sound, nightWatchManShip

/*
 * 	1. abstract class
 *  2. interface (concept vs keyword)
 *  
 */
class Animal {
	public void sound() {
		System.out.println("sound of animal...?");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("meou...");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("bho bho...");
	}

	public void nightWatchManShip() {
		System.out.println("jagta raho...");
	}
}

class CostlyDog extends Animal {
	public void sound() {
		System.out.println("bho bho..with some style.");
	}

	public void nightWatchManShip() {
		System.out.println("jagta raho..why i should.");
	}
}

public class DemoInstanceOfOperation {

	public static void main(String[] args) {
		
		//instanceOf
		
		Double i=66.99;// auto
		
		if(i instanceof Number)
			System.out.println("yes");
		else
			System.out.println("No");
		
		
		
		
//		
//		Animal[] animals = getAnimals();
//
//		// java 5: syn suger
//		for (Animal animal : animals) {
//			animal.sound();
//			
//			if (animal instanceof Dog)
//				((Dog) animal).nightWatchManShip();
//		}

	}

	public static Animal[] getAnimals() {
		Animal[] animals = { new Cat(), new Cat(), new Dog(), new Cat() , new CostlyDog()};
		return animals;
	}
}
