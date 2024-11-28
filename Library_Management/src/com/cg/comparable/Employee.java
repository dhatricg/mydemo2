package com.cg.comparable;

import java.util.ArrayList;
import java.util.Collections;

import com.cg.equal.Employee3;

public class Employee implements Comparable<Employee>{
	int salary;
	String name;
	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
//		if((this.salary == o.salary))
//			return 0;
//		else if(this.salary > o.salary)
//			return -1;
//		else
//				return 1;
		
		return this.name.compareTo(o.name);
			
		
		// TODO Auto-generated method stub
		
	}
	
	
	
}
