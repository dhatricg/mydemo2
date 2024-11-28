package com.ds.trees;

public class DeleteTrees {
	
	Node root;
	int item;
	
	
	public DeleteTrees(Node root, int item) {
		super();
		this.root = root;
		this.item = item;
	}
	
	void delete(int item) {
		Node parent = null;
		Node curr = root;
		curr = Search(curr, item, parent);
		if (curr==null) {
			System.out.println("not found");
			return;
		}
		if (curr.left == null && curr.right == null) {
			if(curr != root) {
				if(parent.left == curr) {
					parent.left = null;
				}else {
					parent.right = null;
				}
			}
			else {
				root = null;
			}
			else {
				Node child = curr.left = null;
				curr.left;
				curr.right;
			}
			if(curr != root) {
				if(curr == parent.left) {
					parent.left = child;
				}else {
					parent.right = child;
				}else {
					root = child;
				}
			}
		} 
	}
	
	Node Search(Node curr, int item, Node parent) {
		while(curr!=null && curr.data != item) {
			parent = curr;
			if(item < curr.data) {
				curr = curr.left;
			}else {
				curr = curr.right;
			}
			
		}
		return curr;
	}
	
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
