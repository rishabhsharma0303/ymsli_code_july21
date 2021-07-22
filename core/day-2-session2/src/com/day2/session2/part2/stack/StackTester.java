package com.day2.session2.part2.stack;

public class StackTester {

	public static void main(String[] args) {
		Stack stack=new Stack();
		stack.push(4);
		stack.push(49);
		stack.push(7);
		stack.push(9);
		
		stack.push(22);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		
		//stack.push(3);
		
		
	}
}
