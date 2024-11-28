package com.inherit;

public class PartTimeEmployee extends Employee {
	double salary;
	
	public PartTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public void display() {
		super.displayInfo();
		System.out.println(salary);
		
	}

}
