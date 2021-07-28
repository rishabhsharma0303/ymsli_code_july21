package com.day5.session1.part2.ex_handing;
//static import java 1.5
import static java.lang.Math.*;
public class Circle {
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
		if(this.radius<=0) {
			throw new NegativeRadiusException("-ve radius is not allowed");
		}
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circle [radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
	
	public double calArea() {
		return radius * radius*PI;
	}
	
}
