package com.cg.testinterface;

import com.cg.abst.Abstract.Employee;
import com.inherit.FullTimeEmployee;

public class UseEmployee {
 
	public static void main(String[] args) {
 
		FullTimeEmployee f1 = new FullTimeEmployee(100);
		Employee f2 = new FullTimeEmployee();
 
		double v = f1.calSalary();
		System.out.println(v);
 
		Employee e1 = new PartTimeEmployee(8, 100);
		double sal = e1.calSalary();
		System.out.println(sal);
 
		((PerformanceEvaluation) f2).evaluatePerformance();
 
	}
 
}


