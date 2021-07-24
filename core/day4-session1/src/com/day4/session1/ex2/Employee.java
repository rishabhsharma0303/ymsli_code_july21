package com.day4.session1.ex2;

public class Employee implements Payable{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("id : " + id + " name : "+ name + " salary : "+ salary);
	}
	@Override
	public double pay() {
		return getSalary();
	}
	
}
