package com.day3.session2.demo;

//Overriding
class Milk{
	
}

class PasteurizedMilk extends Milk{
	
}
class RupaDairy{
	public Milk sell(double amount) {
		System.out.println("selling milk...");
		return new Milk();
	}
}

//pasteurized milk
class ImprovedRupaDairy extends RupaDairy{
	//Java 1.5: java 5: annotation aka meta data
	//no framework can be create without annotation*
	
	
	//Java 5: covarienet return type?
	@Override
	public PasteurizedMilk sell(double amount) {
		System.out.println("selling milk...overriden");
		return new PasteurizedMilk();
	}
}
//this prog is used to demo about overriding 
public class Demo {
	
	public static void main(String[] args) {
		//it is resolved at run time ?	
		RupaDairy d=new ImprovedRupaDairy();
		d.sell(60);
	}
}
