package com.ds.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
          Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void reverse() {
		Stack<Node> stack = new Stack<>();
		Node temp = head;
		
		while(temp!=null) {
			stack.push(temp);
			temp = temp.next;
		}
		if (!stack.isEmpty()) {
			head = stack.pop();
			temp = head;
			while(!stack.isEmpty()) {
				temp.next = stack.pop();
				temp = temp.next;
			}
			temp.next = null;
			}
	     
	}
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		
		System.out.println("Original list:");
		list.printList();
		
		list.reverse();
		
		System.out.println("Reversed list:");
		list.printList();
		// TODO Auto-generated method stub

	}

}
