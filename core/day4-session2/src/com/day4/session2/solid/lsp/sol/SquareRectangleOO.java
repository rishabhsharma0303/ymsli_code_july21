package com.day4.session2.solid.lsp.sol;

import java.sql.SQLClientInfoException;

//square rectangle object oriented problem
class Rectangle{
	private int l, b;
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int getArea() {
		return l*b;
	}
}

class Square {
	private Rectangle rectangle;
	
	public Square(int l) {
		rectangle=new Rectangle(l, l);
	}
	
	public void changeDimension(int newDimension) {
		rectangle.setB(newDimension);
		rectangle.setL(newDimension);
	}
	//CODE RESUSABLITY CAN BE ACHIVED USING COMPSION!
	
	public int getArea() {
		return rectangle.getArea();
	}
}


//class Square extends Rectangle{
//	private int l;
//	
//	public Square(int l) {
//		super(l, l);
//	}
//	//inh give code resuablitiy
//	@Override
//	public int getArea() {
//		return super.getArea();
//	}
//}


public class SquareRectangleOO {

	public static void main(String[] args) {
		Square square=new Square(5);
		System.out.println(square.getArea());
		square.changeDimension(4);
		System.out.println(square.getArea());
	}
}
