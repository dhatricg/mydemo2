package com.cg.MyExceptions;

public class Exceptions {
	public static void main(String args[]) {
	
	try {
		int[] arr = {10, 20, 30};
		
	    String str = null;
	   
	    
	    System.out.println(arr[1]);
	    System.out.println(arr[0]);
	    System.out.println(str.length());
	    
	   
	}
	catch(ArrayIndexOutOfBoundsException | NullPointerException e){
		System.out.println("Array out of bound index"+ e.getMessage());
	}
	

//	catch(NullPointerException n) {
//		System.out.println("Null Pointer Exception" + n.getMessage());
//	}
	finally {
		System.out.println("hey");
	}
	System.out.println("Thankyou");
	
	}
	
}
