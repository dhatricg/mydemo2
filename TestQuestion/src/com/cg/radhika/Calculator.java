package com.cg.radhika;

import java.util.Scanner;

//public class Calculator {
	//import java.util.Scanner;
	 
	abstract class Calculator {
	    abstract int add(int a, int b);
	}
	 
	// Implementation of the Adder class
	class Adder extends Calculator {
	    @Override
	    int add(int a, int b) {
	             System.out.println("Adding integers: " + a + " " + b);  // Print addition step  
	             return a + b;
	    }
	}
	 
	// Implementation of the Multiplier class
	class Multiplier {
	    int multiply(int a, int b, Calculator CALCULATOR) {
	        // Using the calculator to perform addition
	        int result = a ;
	        for (int i = 1 ; i < b ; i++) {
	            result = CALCULATOR.add(result, a);
	        }
	        return result;
	    }
	}
	 
	/*public class Solution {
	    private static final Scanner INPUT_READER = new Scanner(System.in);
	    private static final Calculator CALCULATOR = new Adder();
	 
	    private static void testAddition(int a, int b) {
	        System.out.println("Sum = " + CALCULATOR.add(a, b));
	    }
	 
	    private static void testMultiplication(int a, int b) {
	        System.out.println("Product = " + new Multiplier().multiply(a, b, CALCULATOR));
	    }
	 
	    public static void main(String[] args) {
	        int a = Integer.parseInt(INPUT_READER.nextLine());
	        int b = Integer.parseInt(INPUT_READER.nextLine());
	 
	        System.out.println("Testing Addition");
	        testAddition(a, b);
	 
	        System.out.println("\nTesting Multiplication");
	        testMultiplication(a, b);
	    }
	}*/
//}
