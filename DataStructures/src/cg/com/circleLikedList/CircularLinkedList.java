package cg.com.circleLikedList;

//Definition for a node in the circular singly linked list
class Node {
int data;
Node next;

Node(int data) {
   this.data = data;
   this.next = null;
}
} 

//CircularLinkedList class
public class CircularLinkedList {
private Node head;
private Node tail;

//Constructor to initialize the circular linked list
public CircularLinkedList() {
   head = null;
   tail = null;
}

//Insert a new node at the end of the list
public void insertAtEnd(int data) {
   Node newNode = new Node(data);
   if (head == null) {
       head = newNode;
       tail = newNode;
       tail.next = head; // Making the list circular
   } else {
       tail.next = newNode;
       tail = newNode;
       tail.next = head;  // Updating tail to point back to head
   }
   System.out.println("Inserted at end: " + data);
}

//Insert a new node at the beginning of the list
public void insertAtBeginning(int data) {
   Node newNode = new Node(data);
   if (head == null) {
       head = newNode;
       tail = newNode;
       tail.next = head; // Making the list circular
   } else {
       newNode.next = head;
       head = newNode;
       tail.next = head; // Updating tail to point back to head
   }
   System.out.println("Inserted at beginning: " + data);
}

//Delete the node at the beginning of the list
public void deleteAtBeginning() {
   if (head == null) {
       System.out.println("List is empty.");
       return;
   }
   if (head == tail) {
       head = null;
       tail = null;
   } else {
       head = head.next;
       tail.next = head; // Updating tail to point back to new head
   }
   System.out.println("Deleted at beginning.");
}

//Traverse the list and print all elements
public void display()
{
   if (head == null) {
       System.out.println("List is empty.");
       return;
   }
   Node current = head;
   do {
       System.out.print(current.data + " ");
       current = current.next;
   } while (current != head);
   System.out.println();
}

public static void main(String[] args) {
   CircularLinkedList cll = new CircularLinkedList();
   
   // Insert elements
   cll.insertAtEnd(10);
   cll.insertAtEnd(20);
   cll.insertAtEnd(30);
   cll.insertAtBeginning(5);

   // Display the list
   System.out.print("Circular Linked List: ");
   cll.display(); // Expected output: 5 10 20 30

   // Delete an element
   cll.deleteAtBeginning();
   cll.display();
}}