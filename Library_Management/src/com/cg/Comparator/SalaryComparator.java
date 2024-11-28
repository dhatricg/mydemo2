package com.cg.Comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

	private int salary;

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary == this.salary)
			return 0;
		else if (o1.salary>this.salary){
			return 1;
			
		}else {
			return -1;
		}
			
		
	}

	

}
