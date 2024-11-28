package com.data;


public class SortEmployee {
	
	private String name;
	private double salary;
	
	public SortEmployee(String name, double salary) {
		
		super();
		
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		SortEmployee[] employees = {new SortEmployee( "Alice", 50000), new SortEmployee( "Ram", 20000), new SortEmployee( "Mohan", 30000), new SortEmployee( "Arun", 10000)};
		
		mergeSort(employees);
		
		printArray(employees);
		
		// TODO Auto-generated method stub

	}



	public static void mergeSort(SortEmployee[] employees) {
		if(employees.length<2) {
			return;
		}
		
		int mid = employees.length/2;
		SortEmployee[] left = new SortEmployee[mid];
		SortEmployee[] right = new SortEmployee[employees.length-mid];
		
		System.arraycopy(employees, 0, left, 0, mid);
		System.arraycopy(employees, mid, right, 0, employees.length-mid);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(employees, left, right);
		// TODO Auto-generated method stub
		
	}



	public static void merge(SortEmployee[] employees, SortEmployee[] left, SortEmployee[] right) {
		
		
		// TODO Auto-generated method stub
		 int li = 0;
		 int ri = 0 ;
		 int ai = 0;
		 
		 while(li<left.length && ri < right.length)
		 {
			 if(left[li].salary <= right[ri].salary)
			 {
				 employees[ai++] = left[li++];
			 }
			 else
			 {
				 employees[ai++] = right[ri++];
			 }
		 }
			 
			 while(li<left.length)
			 {
				 employees[ai++] = left[li++];
			 }
			 
			 while(ri<right.length)
			 {
				 employees[ai++] = right[ri++];
			 }
		
	}

	private static void printArray(SortEmployee[] employees) {
		for(SortEmployee val: employees) {
			System.out.println(val);
		}
		
		// TODO Auto-generated method stub
		
	}

}
