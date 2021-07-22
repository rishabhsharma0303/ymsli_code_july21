package com.day2.session2.part2.stackofbook;

public class StackTester {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(new Book(121, "let us c", 300));
		stack.push(new Book(12, "thinking in java", 400));
		stack.push(new Book(199, "think and grow rich", 200));
		stack.push(new Book(17, "monk who sold farrari", 150));

		stack.push(new Book(7, "thinking in java", 10));
		
		
		stack.pop().printBookDetails();
		stack.pop().printBookDetails();
		stack.pop().printBookDetails();
		stack.pop().printBookDetails();
		stack.pop().printBookDetails();
		

		// stack.push(3);

	}
}
