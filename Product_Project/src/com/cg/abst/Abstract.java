package com.cg.abst;

public class Abstract {
	
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

}
