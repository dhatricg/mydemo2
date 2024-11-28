package com.cg.assignment;

import java.util.HashMap;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Alice", 50000);
		HashMap<Integer, Employee> employeeMap = new HashMap<>();
		
		
		employeeMap.put(emp1.getId(), emp1);
		
		System.out.println("employee");
		
		for (HashMap.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("Key:" + entry.getKey()+ "Value: "+ entry.getValue());
		}
		
		// TODO Auto-generated method stub

	}





}
