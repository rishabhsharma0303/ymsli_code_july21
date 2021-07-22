package com.day2.session2.part1.q2;

public class Circle {
	private double radius=1.0;
	private String string="red";
	
	public Circle() {}
	public Circle(double radius) {
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		//PI r2
		return Math.PI * radius* radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public void printCircleDetails() {
		System.out.println("radius" + radius);
		System.out.println("area: " + this.getArea());
		System.out.println("getCircumference: "+ getCircumference());
	}
}
