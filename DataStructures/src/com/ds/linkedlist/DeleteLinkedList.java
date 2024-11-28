package com.ds.linkedlist;

public class DeleteLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}

	public void deleteNode(int key) {
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		while (temp != null && temp.data != key){
			prev = temp;
			temp = temp.next;
			
		}
		if(temp == null) {
			System.out.println();
			return;
		}
		prev.next = temp.next;
	}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		DeleteLinkedList list = new DeleteLinkedList();
		
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		
		System.out.println("Original list:");
		list.printList();
		
		list.deleteNode(3);
		System.out.println("List after deletion:");
		list.printList();
		
	}
}
	
	
//		if (searchNode(num)) {
//			
//		
//			if (first.data == num) {
//				System.out.println("first" + first);
//				first = first.next;
//			} else {
//				Node temp = first;
//				Node prev = temp;
// 
//				while (temp != null) {
//					if (temp.data == num) {
//						prev.next = temp.next;
//						temp.next = null;
//					}
//					prev = temp;
//					temp = temp.next;
//				}
//			}
// 
//		} else {
//			System.out.println("Node not found !!");
//		}
	

	

