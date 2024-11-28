package com.cg.queues;

public class Queues {
	int[] queueArray;
	int maxSize;
	int front;
	int rear;
	int nitem;
	
	
	public Queues(int n) {
		super();
		this.queueArray = new int[n];
		this.maxSize = n;
		this.front = 0;
		this.rear = -1;
		this.nitem = 0;
	}
	

	
	
	public boolean isEmpty() {
		
		return(nitem==0);
	}
	
public boolean isfull() {
		
		return(nitem==maxSize);
	}
	
	public void insert(int n) {
		if (isfull()) {
			
			System.out.println("you cannot add new element");
			System.out.println("position of rear" + " "+ rear);
		}
		else {
			rear = (rear+1) % maxSize;
			queueArray[rear] = n;
			nitem = nitem+1;
			System.out.println("element inserted at rear location" + rear + " " + queueArray[rear]);
		}
		
	}
	public int remove() {
		if (isEmpty()) {
			System.out.println("empty");
			return -1;
		}
		else {
			int temp = queueArray[front];
			front = (front+1) % maxSize;
			nitem--;
			return temp;
		}
		
	}
	
	public void display() {
		
		for(int i=front; i<maxSize; i++) {
			System.out.println(queueArray[i]);
			//System.out.println(queueArray[(front + i) % maxSize]);
			
			
		}
		
	}


}
