package com.day6.session2.part1;
import java.util.*;

//time taken : 2178
//time taken : 43
public class ALvsLL {

	//Profiling : tools , bunchmarking : proving the performance!
	public static void main(String[] args) {
		List<Long> l1=new ArrayList<>();
		List<Long> l2=new LinkedList<>();
		doCalculateTiming(l1);
		doCalculateTiming(l2);
		
	}

	private static void doCalculateTiming(List<Long> l1) {
		long start=System.currentTimeMillis();
		
		for(long i=0;i<1e5;i++) {
			l1.add(i);
		}
		//adding element at the first position 
		for(long i=0;i<1e5;i++) {
			l1.add(0, i);
		}
		
		long end= System.currentTimeMillis();
		
		System.out.println("time taken : "+ (end-start));
	}
}
