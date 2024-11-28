package com.cg.emp;

public class Employee {
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override //annotations
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	private int id;
	String name;
	double salary;
	
//	void display() {
//		System.out.println(id);
//	}

}
