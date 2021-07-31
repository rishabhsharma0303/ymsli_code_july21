package com.day7.session2.annotation_ex;
import java.lang.reflect.*;
class Employee{
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
	
	
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		System.out.println("it is a default ctr");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}
	
}
public class DemoRelectionApi {

	public static void main(String[] args) throws ClassNotFoundException {
		//static loading vs dynamic loading of class
		
		//dynamic loading of class: it can be used even if we dnot know the name of the class
		// tomcat , spring , hib....
		
		//1. way Class.forName
		Class<?> clazz=Class.forName("com.day7.session2.annotation_ex.Employee");
		
		//Constructor[]constructors=clazz.getConstructors();
		
		//2. way
		Class class1=Employee.class;
		
		//3. way
		Employee employee=new Employee(12, "raj", 45.0);
		
		Class<?> class3=employee.getClass();
		

		
		//print all infor of all ctr
		
		
		//how to get the meta data of that class?
		
//		Method[]methods=clazz.getDeclaredMethods();
//		
//		for(Method method: methods) {
//			System.out.println(method.getName()+ " : "+ method.getModifiers() +
//					" :" + Modifier.toString(method.getModifiers()));
//			
//		}
//		
		
		///static loading 
//		Employee employee=new Employee(12, "raj", 45.0);
//		System.out.println(employee);
		
	}
}
