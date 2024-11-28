package com.emp.linkedlist;

import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		Linkedlist mylist = new Linkedlist();
		
		EmployeeLinkedList emp1 = new EmployeeLinkedList(1, "abc", 80000);
	    EmployeeLinkedList emp2 = new EmployeeLinkedList(2, "xyz", 50000);
	    
	    
	    mylist.insertFirst(emp1);
	    mylist.insertLast(emp2);
	    mylist.displayList();
	    
		
		// TODO Auto-generated method stub

	}

}
