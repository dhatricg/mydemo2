package com.mergelists;


public class Merge{	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node merge(Node list1, Node list2) {
		Node dummy = new Node(0);
		Node curr = dummy;
		
		while(list1 != null && list2 != null) {
			if(list1.data <= list2.data) {
				curr.next = list1;
			}else {
				curr.next = list2;
				list2 = list2.next;
			}
			curr = curr.next;
	}
		if(list1 != null) {
			curr.next = list1;
		}else {
			curr.next = list2;
			
		}
		
		return dummy.next;
	
}

	public static void main(String[] args) {
		Node list1 = new Node(1);
		list1.next = new Node(3);
		list1.next.next = new Node(5);
		
		Node list2 = new Node(2);
		list2.next = new Node(4);
		list2.next.next = new Node(6);
		
		Node mergedList = merge(list1, list2);
		
		printList(mergedList);
		
		// TODO Auto-generated method stub

	}

	public static void printList(Node head) {
		Node curr = head;
		if (curr==null) {
			System.out.println("The list is empty");
			return;
		}
		while(curr != null) {
			System.out.println(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
