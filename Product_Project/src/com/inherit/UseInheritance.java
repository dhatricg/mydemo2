package com.inherit;

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
