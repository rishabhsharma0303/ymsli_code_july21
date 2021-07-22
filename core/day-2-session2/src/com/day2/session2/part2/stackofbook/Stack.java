package com.day2.session2.part2.stackofbook;

public class Stack {
	private final int SIZE = 5;
	Book arr[];
	int top;
	
	Stack() {
		arr = new Book[SIZE];
		top = -1;
	}
	public Book pop() {
		Book tempBook=null;
		
		if (!isEmpty()) {
			tempBook= arr[top];
			arr[top]=null;// imp?
			top++;
		}
		return tempBook;
	}

	public void push(Book book) {
		if (!isFull()) {
			arr[++top] = book;
		} else {
			System.out.println("stack is full");
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}
}
