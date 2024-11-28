package com.ds.trees;

class Node{

	int data;
	Node left, right;
	
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}



public void display() {
	System.out.println("Data" + data);
}
}
