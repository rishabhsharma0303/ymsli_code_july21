package com.day6.session2.part1;
import java.util.*;
public class HowToConvertArrayToCollection {

	public static void main(String[] args) {
		//How to covner a array to collection
		String names[]= {"ekta","raj","keshav","gunkia"};
		
		List namesList = Arrays.asList(names);
		//namesList.add("foo");
		namesList.set(0,44);//java.lang.ArrayStoreException: 
				
		for(Object name:namesList) {
			System.out.println(name);
		}
		
//		List<String> names = new ArrayList<String>();
//		names.add("foo");
		
	}
}
