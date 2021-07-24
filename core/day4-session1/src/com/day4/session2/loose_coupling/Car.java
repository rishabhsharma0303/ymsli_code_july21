package com.day4.session2.loose_coupling;

public class Car implements Vehical{
	@Override
	public void move(String s, String d) {
		System.out.println("car is moving from s "+ s+" to "+ d);
	}
}
