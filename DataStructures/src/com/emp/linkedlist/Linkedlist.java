package com.emp.linkedlist;

import com.ds.linkedlist.Node;

public class Linkedlist {
	
	public Linkedlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Node first;
	private Node last;
	
	
	public boolean isEmpty(){
			return (first == null);
		}
	
	public void insertFirst(EmployeeLinkedList emp1){
		Node newNode = new Node();
		newNode.data = emp1;
		newNode.next = first;
		first = newNode;
	}
	
	public void insertLast(EmployeeLinkedList emp2){
		Node current = first;
		while(current.next != null){
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node();
		newNode.data = emp2;
		current.next = newNode;
	}
 
    public void displayList(){
		System.out.println("List (first --> last) ");
		Node current = first;
		while(current != null){
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}
    
    

}
