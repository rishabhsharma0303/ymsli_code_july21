package com.day3.session2.demo;

import java.util.Scanner;

abstract class Shape {
	
	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public abstract void drawShape() ;

	public void showColor() {
		System.out.println("color : " + color);
	}
}

 class Rectangle extends Shape {
	public Rectangle(String color) {
		super(color);
	}

	@Override
	public void drawShape() {
		System.out.println("Drawing rectangle");
	}

}

class Circle extends Shape {
	public Circle(String color) {
		super(color);
	}

	@Override
	public void drawShape() {
		System.out.println(" it is a Circle.");
	}
}


class Triangle extends Shape {
	public Triangle(String color) {
		super(color);
	}

	@Override
	public void drawShape() {
		System.out.println(" it is a Triangle.");
	}
}

public class DemoMethodOverridingAndRunTimeFlexiblity {

	public static void main(String[] args) {

			Shape shape=null;
			System.out.println("PE your choice 1.Rectangle 2. Circle 3.Triangle ");
			
			Scanner scanner=new Scanner(System.in);
			
			int choice= scanner.nextInt();
			if(choice==1) {
				shape=new Rectangle("red");
			}else if(choice==2) {
				shape=new Circle("red");
			}else if(choice==3) {
				shape=new Triangle("red");
			}
			
			if(shape!=null)
				shape.drawShape();
			else
				System.out.println("Wrong choice");
			
			scanner.close();
	}
}







