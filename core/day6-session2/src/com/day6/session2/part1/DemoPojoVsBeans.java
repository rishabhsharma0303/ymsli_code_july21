package com.day6.session2.part1;

import java.io.Serializable;

// java bean vs pojo

//Plane old Java object: dont have any external dependcies , it should be within the boudary of core java
///EJBXyz * (server)
//HttpServlet (server)
class Emp implements Serializable{
	private static final long serialVersionUID = 5260264586979793479L;
	private int id;
	private String name;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Emp() {}
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
}

public class DemoPojoVsBeans {
	
	public static void main(String[] args) {
		
	}

}
