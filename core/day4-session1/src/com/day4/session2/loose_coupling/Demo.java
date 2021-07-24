package com.day4.session2.loose_coupling;
//A passanger is traveling from LN to Noida

public class Demo {

	public static void main(String[] args) {
		//Metro metro=new Metro();
		//Bike bike=new Bike();
		Vehical vehical= new Metro();
		
		Passanager passanager=new Passanager("amit");
		passanager.travel("LN", "Noida", vehical);
	}
}
