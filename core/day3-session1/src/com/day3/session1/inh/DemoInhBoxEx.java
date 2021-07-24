package com.day3.session1.inh;
class Box{
	private int l, b;
	public Box(int l, int b) {
		this.l=l;
		this.b=b;
	}
	public void print2DBox() {
		System.out.println("Box : l"+ l + " b: "+ b);
	}
}

class Box3D extends Box{
	private int h;
	public Box3D(int l, int b, int h) {
		super(l,b);
		this.h=h;
	}
	public void print3DBox() {
		print2DBox();
		System.out.println(" h: "+ h);
	}
}

class Box3DWithColor extends Box3D{
	private String color;
	
	public Box3DWithColor(int l, int b, int h, String color) {
		super(l, b, h);
		this.color=color;
	}
	
	public void print3DBoxWithColor() {
		print3DBox();
		System.out.println("Color :"+ color);
	}
}

public class DemoInhBoxEx {

	
	public static void main(String[] args) {
		
		Box3DWithColor box=new Box3DWithColor(2,3,4,"red");
		box.print3DBoxWithColor();
	}
}
