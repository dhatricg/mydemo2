package com.inherit;

  public class FullTimeEmployee extends Employee {
	  private double salary;

	public FullTimeEmployee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("Salary: " + salary);
	}
		
	}
	 
	 

	


