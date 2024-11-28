package com.cg.MyExceptions;

public class ThrowException {
	private int empNo;
	private String Name;
	private float Salary;
	
	

	public ThrowException(int empNo, String name, float salary) {
		this.empNo = empNo;
		Name = name;
		this.Salary = salary;
	}
	public void showData(){
		System.out.println();
		System.out.println();
		
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
		
	}
	
	public float getSalary(){
		return Salary;
	}
	



	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
