package com.cg.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class UseEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		Employee emp1 = new Employee(10000, "dhatri");
		Employee emp2 = new Employee(20000, "vista");
		Employee emp3 = new Employee(40000, "priti");
		
		
		
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		for (Employee e: list) {
			System.out.println(e.toString());
		}
		System.out.println(" ");
		
		
		
		Collections.sort(list);
		
		for (Employee e:list) {
			System.out.println(e.toString());
		}
	}
	
	
	//collection is a interface and collections is a class


}
