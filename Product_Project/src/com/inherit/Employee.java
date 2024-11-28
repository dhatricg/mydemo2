package com.inherit;

public class Employee {

	

	private int id;
	protected String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void displayInfo(){
		System.out.println("ID: "+ id + ", Name: " + name);
	}
	

}
