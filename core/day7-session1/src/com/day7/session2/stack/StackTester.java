package com.day7.session2.stack;

import com.day7.session2.Job;

public class StackTester {

	public static void main(String[] args) {
		Stack<Job> stack=new Stack(Job.class);
		stack.push(new Job(1, "bike part1", 3));
		stack.push(new Job(17, "bike part2", 1));
		
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//System.out.println(stack.pop());
		
		
		
		//stack.push(3);
		
		
	}
}
