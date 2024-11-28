package com.ds.linkedlist;

public class DeleteDoublyLinkedList {
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
 
    // Constructor
    public DeleteDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
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
 
    // Delete a node by value
    public void delete(int data) {
        Node current = head;
        //Check List exist
        while (current != null)
        {
            if (current.data == data) {
            	//if it is NOT a first node
                if (current.prev != null)
                    current.prev.next = current.next;
                 else
                // it is first node;
                    head = current.next;
                
                //current is not last node
                if (current.next != null)
                    current.next.prev = current.prev;
                 else {
                	//current is last node
                    tail = current.prev;
                }
 
                size--;
                return;
            }
            current = current.next;
        }
    }
 
    // Display the list from head to tail
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
 
    // Display the list from tail to head
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        DeleteDoublyLinkedList dll = new DeleteDoublyLinkedList();
 
        // Add elements to the list
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.add(40);
 
        // Display the list
        dll.displayForward();
        dll.displayBackward();
 
        // Delete an element
        dll.delete(20);
 
        // Display the list after deletion
        dll.displayForward();
        dll.displayBackward();
    }
}
