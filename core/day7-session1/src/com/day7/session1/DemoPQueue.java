package com.day7.session1;
import java.util.*;
public class DemoPQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> que=new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o2, o1);
			}
		});
		que.offer(44);
		que.add(6);
		que.add(660);
		que.add(96);
		que.add(34);
		que.add(96);	
		//System.out.println(que);
		
//		Iterator<Integer> it=que.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		//Must use this syn if want to print in priority
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		
		
//		System.out.println(que.poll());
//		System.out.println(que.remove());
//		System.out.println(que.peek());
//		System.out.println(que.element());
		
	}
}
