package com.day7.session2.stack;

import java.lang.reflect.Array;
class StackEmptyException extends RuntimeException{
	private static final long serialVersionUID = -5131308183299930494L;
	
}
public class Stack<T> {
	private final int SIZE = 5;
	T arr[];
	int top;
	@SuppressWarnings("unchecked")
	Stack(Class<T> clazz) {
		//Topic called java reflection * Annotation * (basic -> intermediate )
		
		arr = (T[]) Array.newInstance(clazz, SIZE);
		top = -1;
	}

	public T pop() {
		if (!isEmpty()) {
			return arr[top--];
		}else
			throw new StackEmptyException();
	}

	public void push(T data) {
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
