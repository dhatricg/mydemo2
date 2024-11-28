package com.assign;

public class Employee_Bonus {
	
	
	public Employee_Bonus() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee_Bonus(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	int id;
	String name;
	double salary;
	
	
	@Override
	public String toString() {
		return "Employee_Bonus [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	

	

}
