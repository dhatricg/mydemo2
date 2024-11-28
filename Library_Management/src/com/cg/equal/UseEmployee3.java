package com.cg.equal;

public class UseEmployee3 {

	public static void main(String[] args) {
		Employee3 emp1 = new Employee3(1, "hello", 33);
		Employee3 emp2 = new Employee3(1, "hello", 33);
		Employee3 emp3 = new Employee3(1, "hello", 33);
		
		
		System.out.println(emp1);
		System.out.println(emp2);
	//	difference between emp1 == emp2 and emp1.equals(emp3);
		
		
		System.out.println(emp1==emp2);
	  
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp1==emp2);
		
		// TODO Auto-generated method stub

	}

}
