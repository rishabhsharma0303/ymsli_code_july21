package com.day6.session2.part1;

import java.util.*;
public class DemoLL {

	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("abc");
		list.add("amit");
		list.add("ekta");
		//System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		//BS: pre condition: sorting 
		
		int index= Collections.binarySearch(list, "udit");
		System.out.println(index);
	}
}
