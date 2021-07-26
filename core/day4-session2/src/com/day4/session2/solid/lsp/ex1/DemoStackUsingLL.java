package com.day4.session2.solid.lsp.ex1;

import java.util.LinkedList;

//LIFO
class MyStack {
	private LinkedList<Integer> linkedList = new LinkedList<>();

	public void push(int i) {
		linkedList.addFirst(i);
	}

	public int pop() {
		return linkedList.getFirst();
	}
}

public class DemoStackUsingLL {

	public static void main(String[] args) {

	}
}
