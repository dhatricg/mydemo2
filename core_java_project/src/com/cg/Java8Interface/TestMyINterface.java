package com.cg.Java8Interface;

public class TestMyINterface implements MyInterface {
	public static void main(String args[]){
		
	
	TestMyINterface t = new TestMyINterface();
	t.display();
	}
	@Override
	public void display(){
		System.out.println("Hi Functional Interface");
		// TODO Auto-generated method stub
		

	}

}
