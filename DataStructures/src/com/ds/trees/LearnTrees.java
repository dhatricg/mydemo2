package com.ds.trees;



public class LearnTrees {
	Node root;
	int item;
	
	public LearnTrees() {
		super();
		this.root = null;
		this.item = item;
	}

void insert(int item) {
	root = insertRec(root, item);
}

 Node insertRec(Node root, int item) {
	if(root == null) {
		root = new Node(item);
		return root;
	}
	if(item<root.data) {
		root.left = insertRec(root.left, item);
	}else if(item>root.data) {
		root.right = insertRec(root.right, item);
	}
	return root;
	}
 
 
public static void main(String args[]) {
	 LearnTrees tree = new LearnTrees();
	 tree.insert(50);
	 tree.insert(30);
	 tree.insert(40);
	 tree.insert(5);
	 tree.insert(12);
	 tree.insert(80);
	 
	 System.out.println("PreOder Traversal:");
	
 }
}