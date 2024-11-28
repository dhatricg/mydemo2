package com.cg.Anurag;
//QUESTION: You have to create an abstract class EMPLOYEE and extend 2 subclasses ENGINEER and PROFESSOR
//OBJECTIVE:- In employee class you have to write methods as int Salary, String name  and a displayInfo method to show details of                     the employee.
//                    create this class with these methods and extend both engineer and professor class that inherits its properties 
//                    and create getters and setter in each class .
abstract class Employee {	
	   String name;
	   int salary;
	   //double bonus;
	   Employee(){
		   this.name = name;
		   this.salary =salary;
	   }
	   Employee(int salary, String name){
		   this.name = name;
		   this.salary=salary;
	   }

	    void display() {
		   System.out.println("employee name is "+ name + "\n" +
		   "your salary is "+ salary);
	   }
}


class Engineer extends Employee{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}


class Professor extends Employee{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
