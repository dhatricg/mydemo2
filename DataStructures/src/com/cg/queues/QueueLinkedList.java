package com.cg.queues;

class node{
	
	int data;
	node next;
	
	public node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
public class QueueLinkedList {
	node front;
	node rear;
	int nitem;
	
	public QueueLinkedList() {
		super();
		this.front = null;
		this.rear = null;
		this.nitem = 0;
	}
	
	public boolean isEmpty(){
		return (nitem==0);
			
	}
	
	public void insert(int n) {
		node newNode = new node(n);
		if (isEmpty()) {
			front  = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
		
		}
		rear = newNode;
		nitem += 1;
	}
	
	public int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			rear = null;
			return -1;
		}else {
			int temp = front.data;
			front = front.next;
			nitem -= 1;
			return temp;
		}
		
	
		
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			node curr = front;
			while(curr != null) {
				System.out.println(curr.data + " " );
				curr = curr.next;
			
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		QueueLinkedList queue = new QueueLinkedList();
		queue.insert(10);
		queue.insert(20);
		queue.insert(30);
		queue.insert(40);
		
		queue.remove();
		queue.display();
		
		
		// TODO Auto-generated method stub

	}

}
