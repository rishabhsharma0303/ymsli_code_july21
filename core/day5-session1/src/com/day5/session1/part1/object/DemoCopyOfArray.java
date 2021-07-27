package com.day5.session1.part1.object;

import java.util.Arrays;

//copy of arra
class MyArr{
	final private int arr[];
	
	public MyArr(int arr[]) {
		//make a copy of the array
		this.arr=Arrays.copyOf(arr, arr.length);
	}
	//what it means?
	public int[] getArr() {
		return Arrays.copyOf(this.arr, this.arr.length);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MyArr [arr=");
		builder.append(Arrays.toString(arr));
		builder.append("]");
		return builder.toString();
	}
	
	
}
public class DemoCopyOfArray {
	
	public static void main(String[] args) {
		
		//dare to mutate it!!!
		
		int a[]= {4,5,6};
		MyArr arr=new MyArr(a);
		
		System.out.println(arr);
		
		a[2]=66;
		
		System.out.println(arr);
		
		int  b[]=arr.getArr();
		b[1]=7777;
		
		System.out.println(arr);
		
	}
}
