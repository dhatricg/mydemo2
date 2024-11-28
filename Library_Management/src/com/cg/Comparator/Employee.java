package com.cg.Comparator;

public class Employee {
	int salary;
	String name;
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	
	

}
