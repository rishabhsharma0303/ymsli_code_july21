package com.day5.session1.part1.object;

import java.util.Arrays;
import java.util.Date;
//immutable:
final class MyClass{
	
	final private int i;
	final private int []arr;
	final private Emp emp;
	final private Date date;
	//we have an array that is share amoung two ref arr, myArr?
	
	//how to create copy of the array:POC
	
	public MyClass(int i, int[] arr, Emp emp, Date date) {
		this.i = i;
		this.arr = Arrays.copyOf(arr, arr.length);
		this.emp = emp;
		this.date = date;
	}

	public int getI() {
		return i;
	}

	public int[] getArr() {
		return Arrays.copyOf(arr, arr.length);
	}

	public Emp getEmp() {
		Emp empTemp=null;
		try {
			empTemp= (Emp) emp.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empTemp;
	}

	public Date getDate() {
		return (Date) date.clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyClass [i=");
		builder.append(i);
		builder.append(", arr=");
		builder.append(Arrays.toString(arr));
		builder.append(", emp=");
		builder.append(emp);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	
	
}
public class DemoImmutableObject {
	
	public static void main(String[] args) {
		int i=44;
		int myArr[]= {4,6,7,8};
		Emp emp=new Emp(121, "raj", 56.88);
		
		Date date=new Date(2011, 11, 13);
		
		MyClass ob=new MyClass(i, myArr, emp, date);
		
		System.out.println(ob);
		
		myArr[2]=6666;
		
		System.out.println("----------------------------");
		System.out.println(ob);
		
		
	}

}
