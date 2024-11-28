package com.cg.MyExceptions;

public class ThrowExceptions {

	public static void main(String[] args) {
		try {
			checkAge(18);
		}
		
			
	    catch(ArithmeticException e) {
	    	System.out.println("underage" + e.getMessage());
	    }
			}
	
		public static void checkAge(int age) {
			if(age<18) {
				throw new ArithmeticException("Underage");
				
			}else {
				System.out.println("Age is valid");
			}
			if(age>50) {
				throw new RuntimeException("Overage");
			}else {
				System.out.println("Age is valid");
			}
		
			
				
			
			
		}
		//static method cannot call non static method
		//with throw we can throw only 1 exception

	}


