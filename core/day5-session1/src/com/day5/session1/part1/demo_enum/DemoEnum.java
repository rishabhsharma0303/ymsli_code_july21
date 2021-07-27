package com.day5.session1.part1.demo_enum;
//what is enum
/*
 * enum is a special class
 * Why not inteface const ? 
 * Shirt class
 */

enum ShirtShize{
   //38 40 42 44 46
	S(38), M(40) , L(42), XL(44) , XXL(46);
	
	private ShirtShize(int size) {
		System.out.println("i am called...");
		this.size=size;
	}
	private int size;
	
	public int getSize() {
		return size;
	}
}
class Shirt{
	private int id;
	private String name;
	private ShirtShize size;
	private double price;
	public Shirt(int id, String name, ShirtShize size, double price) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shirt [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", size=");
		builder.append(size);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ShirtShize getSize() {
		return size;
	}
	public void setSize(ShirtShize size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

public class DemoEnum {
	//dare to misuse my code!
	
	public static void main(String[] args) {
		Shirt shirt=new Shirt(121, "pe", ShirtShize.L, 1200);
		System.out.println(shirt);
	}
}
