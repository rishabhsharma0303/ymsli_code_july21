package com.day2.session2.part2.compostion;

public class Flat {
	private int number;
	private String address;
	private String owerName;
	
	private double price;
	public Flat(int number, String address, String owerName, double price) {
		this.number = number;
		this.address = address;
		this.owerName = owerName;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getOwerName() {
		return owerName;
	}
	public void setOwerName(String owerName) {
		this.owerName = owerName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printFlatDetails() {
		System.out.println("--------flat details-----------");
		System.out.println("number: "+ number);
		System.out.println("address: "+ address);
		System.out.println("owerName: "+ owerName);
		System.out.println("price: "+ price);
		System.out.println("--------------------------------");
	}
	
}
