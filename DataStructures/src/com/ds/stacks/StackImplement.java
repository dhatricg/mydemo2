package com.ds.stacks;

import java.util.Stack;

public class StackImplement {
	
	int top;
	int max;
	int [] stackArray;
	
	public StackImplement(int size) {
		max = size;
		stackArray = new int[max];
		top = -1;
		
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(int value) {
		stackArray[++top] = value;
		System.out.println("Pushed" + value);
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stackArray[top--];
	}
	
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
	}
		return stackArray[top];
	}

	public static void main(String[] args) {
		Stack<Integer> stackArray = new Stack<>();
		
		stackArray.push(10);
		stackArray.push(20);
		stackArray.push(30);
		stackArray.push(40);
		
		System.out.println(stackArray.peek());
		System.out.println(stackArray.pop());
		System.out.println(stackArray.peek());
		
		
		// TODO Auto-generated method stub

	}

}
