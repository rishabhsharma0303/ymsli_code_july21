package com.day4.session2.part2.stack;

public class StackAman implements Stack {
	private final int SIZE = 5;
	int arr[];
	int top;

	StackAman() {
		arr = new int[SIZE];
		top = -1;
	}

	public int pop() {
		if (!isEmpty()) {
			return arr[top--];
		}
		return -999;
	}

	public void push(int data) {
		if (!isFull()) {
			arr[++top] = data;
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
