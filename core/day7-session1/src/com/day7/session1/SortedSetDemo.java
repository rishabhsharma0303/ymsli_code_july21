package com.day7.session1;
import java.util.*;
public class SortedSetDemo {
	
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		set.add(100);
		set.add(101);
		set.add(104);
		set.add(106);
		set.add(110);
		set.add(115);
		set.add(120);
		//NavigativableString
		
		System.out.println(set.lower(104));
		
		
		//sortedset
//		System.out.println(set);
//		System.out.println(set.first());
//		System.out.println(set.last());
//		System.out.println(set.headSet(106));
//		System.out.println(set.tailSet(106));
//		SortedSet<Integer> subSub=set.subSet(66, 101);
//		
		Comparator<?> comparable=set.comparator();
		System.out.println(comparable);
		//System.out.println(subSub);
		
	}

}
