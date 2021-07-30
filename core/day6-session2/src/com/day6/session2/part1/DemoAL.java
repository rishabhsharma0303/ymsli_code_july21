package com.day6.session2.part1;
import java.util.*;
public class DemoAL {
	
	public static void main(String[] args) {
	
		//data + container + algo
		List<String> list=new ArrayList<>(100);
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
		
		//Collection
		//Collections
		
		
		// 10: 90-100
		/*
		 * 	10+10/2+1=16
		 *  16+16/2+1=25
		 *  .......
		 *  ......
		 */
		//Adv: random access is possible
		// :( add/remove shift all the el right ...
		//LL vs AL
		

//		System.out.println(list);
//		//ListIterator
//		ListIterator<String> it2= list.listIterator();
//		while(it2.hasNext()) {
//			String data=it2.next();
//			if(data.equals("abc")) {
//				it2.remove();
//			}else if (data.equals("foo")) {
//				it2.set("foo new");
//			}else if(data.equals("ekta")) {
//				it2.add("rajiv");
//			}	
//		}
//		
		//System.out.println(list);
		//Demo ListIterator
//		ListIterator<String> it2= list.listIterator(list.size());
//		while(it2.hasPrevious()) {
//			System.out.println(it2.previous());
//		}
//		
		
		
		//Cursor: iterator ? 
		// 3 type of iterator : Enumerator(oldX) vector,
		//Iterator(univeral itertor) 
		//ListIterator(Crud)
		
		
		//iterator: DP
//		Iterator<String> it=list.iterator();
//		it.next();
//		it.remove();
//		it.remove();
//		while(it.hasNext()) {
//			it.next();
//			it.remove();
//			
//		}
		//System.out.println(list);
		
//		oldApi(list);
//		
//		for(String data: list) {
//			System.out.println(data);
//		}
//		
		//Mix Milk + wine: generics and non gernics code Mix XXXX bugs in ur code
		
	}

//	public static void oldApi(List<String> list) {
//		list.add("java");
//	}
}
