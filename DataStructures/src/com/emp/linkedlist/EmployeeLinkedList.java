package com.emp.linkedlist;

public class EmployeeLinkedList {
      public EmployeeLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeLinkedList [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public EmployeeLinkedList(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int id;
      String name;
      int salary;
      
}
