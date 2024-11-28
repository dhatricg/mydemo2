package com.stat;

import java.util.*;

public class Employee {
	
	static {
		System.out.println("Welcome to Campgemini");
	}
	private static int idCounter = 0;
	
	
	private int id;
	private String name;
	private double salary;

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
	public Employee(String name, double salary) {
		super();
		this.id = generateEmployeeId();
		this.name = name;
		this.salary = salary;
	}
	
	private static int generateEmployeeId() {
		return ++idCounter;
	}
	
	

}
