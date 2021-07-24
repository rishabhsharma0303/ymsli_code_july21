package com.day4.session2.part2.ocp;

//OCP: open close prin...:

class ProcessShape{
	
	public static void process(Shape shape) {
		shape.getArea();
		//
	}
	
//	public static void process(Object o) {
//		if(o instanceof Circle) {
//			Circle circle=(Circle) o;
//			circle.getCircleArea();
//		}else if(o instanceof Rectangle) {
//			Rectangle rectangle=(Rectangle) o;
//			rectangle.getRectangleArea();
//		}else if(o instanceof Triangle ) {
//			
//		}
//	}
}
interface Shape{
	public double getArea();
}
class Circle implements Shape{
	public double getArea() {
		System.out.println("for circle");
		return 0;
	}
}
class Rectangle  implements Shape{
	public double getArea() {
		System.out.println("for rectangle");
		return 0;
	}
}

class Triangle  implements Shape{
	public double getArea() {
		System.out.println("for Triangle");
		return 0;
	}
}

public class DemoOcp {
	
	public static void main(String[] args) {
		Shape circle=new Circle();
		ProcessShape.process(circle);
	}

}
