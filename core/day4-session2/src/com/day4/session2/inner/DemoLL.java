package com.day4.session2.inner;

//LinkedList
class LinkList {

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head, tail;

	public LinkList() {
		head = tail = null;
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void printLL() {
		Node currNode = head;
		if (currNode == null) {
			System.out.println("no element to print...");
		} else {
			while (currNode != null) {
				System.out.print(currNode.data + " --> ");
				currNode = currNode.next;
			}
			System.out.println();
		}
	}
}

public class DemoLL {

	public static void main(String[] args) {

		// Collection : aka readymade ds in java!, Iterator (top level inner class)
		
		LinkList linkList=new LinkList();
		linkList.addNode(33);
		linkList.addNode(3);
		linkList.addNode(303);
		linkList.addNode(993);
		linkList.addNode(83);

		linkList.addNode(30);
		
		
		linkList.printLL();
	}

}
