package com.day7.session2;
//sw hotel : Glass: water , wine...

interface Fluid{
}

interface Drinkable{
}

class Water implements Fluid,Drinkable{
}

class ColdDrink implements Fluid,Drinkable{
}


class Petrol implements Fluid{
}

class Glass<T extends Fluid & Drinkable> {
	private T liquid;

	public T getLiquid() {
		return liquid;
	}

	public void setLiquid(T liquid) {
		this.liquid = liquid;
	}
}

public class DemoGenericsJava2 {

	public static void main(String[] args) {
		// generics can improve symetics of ur code?
		Glass<Water> glass1=new Glass<>();
		
		Glass<ColdDrink> glass2=new Glass<>();
		
	//	Glass<Petrol> glass3=new Glass<>();
		 
		
		
	}

}
