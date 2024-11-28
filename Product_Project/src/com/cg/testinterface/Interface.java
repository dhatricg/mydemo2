package com.cg.testinterface;

import com.inherit.Employee;
import com.inherit.FullTimeEmployee;

public class Interface {
	
	class FullTimeEmployee extends Employee {
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
		 
	public class UseInheritance {

		public static void main(String[] args) {
			Employee[] employees = new Employee[2];
			
			
			employees[0] = new FullTimeEmployee(1, "Alex", 60000);
			employees[1] = new FullTimeEmployee(2, "Charlie", 20000);
			
			for(Employee emp: employees) {
				emp.displayInfo();
				System.out.println();
			}
			
			
			
			// TODO Auto-generated method stub

		}

	}

	
	
	

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
}
