package com.ds.linkedlist;

public class DoublyLinkedList {
	private Node head;
    private Node tail;
    private int size;
 
    // Node class
    private static class Node {
        int data;
        Node next;
        Node prev;
 
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
 
    
 // Add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
	

	public static void main(String[] args) {
	DoublyLinkedList dll = new DoublyLinkedList();
		 
        // Add elements to the list
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
        
        dll.displayForward();
        dll.displayBackward();
		// TODO Auto-generated method stub

	}
	
	// Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    // Display the list from head to tail
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
