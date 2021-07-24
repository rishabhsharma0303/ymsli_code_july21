package com.day4.session2.loose_coupling;

public class Passanager {
	
	private String name;
	
	public Passanager(String name) {
		this.name=name;
	}
	
	public void travel(String s, String d,Vehical vehical) {
		System.out.println("name: "+ name);
		vehical.move(s, d);
	}
}
