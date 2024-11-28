package cg.com.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		// Resource Management using Try-With-Resources
		try(BufferedReader br = new BufferedReader(new FileReader("example.txt"))){
			System.out.println(br.readLine());
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		}
}
	
//		//exception propagation
//        try {
//            method1();
//        } catch (ArithmeticException e) {
//            System.out.println("Caught exception in main: " + e.getMessage());
//        }
//        
//	}
//
//	public static void method1() {
//        method2();
//    }
//
//    public static void method2() {
//        int result = 10 / 0; // This will throw ArithmeticException
//    }
//}
    

		//String str = null;
//		try {
//			System.out.println(str);
//			
//		}
//		catch(NullPointerException e) {
//			System.out.println("error: null value");
//		}
//		try {
//			int age = sc.nextInt();
//			if(age<18||age>100) {
//				throw new Exception("Age must be between 18 to 100");
//			}
//			System.out.println("Valid: "+ age);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
		
		//multiple exception
//		try {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(a/b);
//			
//		}
//		catch(ArithmeticException e1) {
//			System.out.println("Error: Arithmetic exception");
//		}
//		catch(InputMismatchException e2) {
//			System.out.println("Error: InputMismatched");
//		}
		//FineNotFoundException
//		try {
//			File file = new File("example.txt");
//			Scanner sc = new Scanner(file);
//			while(sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//				
//			}
//			sc.close();
//		}
//		catch(FileNotFoundException e) {
//			System.out.println("Error: File Not Found");
//		}
		
		
		//ArrayOutOfBoundException
//		Scanner sc = new Scanner(System.in);
//		
//		int arr[] = {10, 20, 30, 40, 50};
//		
//		try {
//			int index = sc.nextInt();
//			System.out.println(arr[index]);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Error: index out of bounds");
//		}
//		try {
//			String input = sc.next();	
//			int num = Integer.parseInt(input);
//			System.out.println(num*num);
//		}
//		catch(Exception e) {
//			System.out.println("Invalid");
//			
//		}

	


