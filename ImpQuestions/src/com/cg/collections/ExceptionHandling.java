package com.cg.collections;

public class ExceptionHandling {
	//1. Handling Division by Zero
//	Write a program that takes two integers, divides the first by the second, and handles the case where the second integer is zero by throwing an ArithmeticException.
//	Input:
//	•	Two integers, a and b.
//	Output:
//	•	The result of a/b, or an error message if division by zero is attempted.
//	java
//	Sample Code
	import java.util.Scanner;

	public class DivisionByZero {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            System.out.println(a / b);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        }
	    }
	}

//	2. Handle Invalid Input Format
//	Write a program that reads a number from the user and prints it squared. If the input is not a number, catch the NumberFormatException.
//	Input:
//	•	A string that may or may not be a valid number.
//	Output:
//	•	The square of the number, or an error message if the input is invalid.
//	java
//	Sample Code
	import java.util.Scanner;

	public class SquareNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            String input = sc.next();
	            int num = Integer.parseInt(input);
	            System.out.println(num * num);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Invalid input. Please enter a valid number.");
	        }
	    }
	}

//	3. Array Index Out of Bounds
//	Write a program that takes an array of integers and an index from the user and prints the element at the given index. If the index is out of bounds, catch the ArrayIndexOutOfBoundsException.
//	Input:
//	•	A list of integers and an index.
//	Output:
//	•	The element at the specified index or an error message if the index is invalid.
//	java
//	Sample Code
	import java.util.Scanner;

	public class ArrayExceptionHandling {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {10, 20, 30, 40, 50};
	        try {
	            int index = sc.nextInt();
	            System.out.println(arr[index]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Index out of bounds.");
	        }
	    }
	}
//	4. File Not Found Exception
//	Write a program to read data from a file. If the file is not found, handle the FileNotFoundException.
//	Input:
//	•	The name of the file to read.
//	Output:
//	•	The contents of the file, or an error message if the file is not found.
//	java
//	Sample Code
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class ReadFile {
	    public static void main(String[] args) {
	        try {
	            File file = new File("example.txt");
	            Scanner sc = new Scanner(file);
	            while (sc.hasNextLine()) {
	                System.out.println(sc.nextLine());
	            }
	            sc.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	        }
	    }
	}

//	5. Multiple Exception Handling
//	Write a program that divides two numbers and handles both ArithmeticException and InputMismatchException.
//	Input:
//	•	Two numbers.
//	Output:
//	•	The result of the division or a specific error message for each exception.
//	java
//	Sample Code
	
	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class MultipleExceptionHandling {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            System.out.println(a / b);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide by zero.");
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter valid integers.");
	        }
	    }
	}

//	6. Custom Exception for Age Validation
//	Create a custom exception class InvalidAgeException that is thrown when the user tries to enter an age less than 18 or greater than 100.
//	Input:
//	•	An age input from the user.
//	Output:
//	•	A message that validates the age or throws a custom exception.
//	java
//	Sample Code
	
	import java.util.Scanner;

	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class AgeValidation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.println("Enter your age:");
	            int age = sc.nextInt();
	            if (age < 18 || age > 100) {
	                throw new InvalidAgeException("Age must be between 18 and 100.");
	            }
	            System.out.println("Valid age: " + age);
	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

//	7. Handling NullPointerException
//	Write a program that tries to access a method on a null object and handles the NullPointerException.
//	Input:
//	•	No specific input required.
//	Output:
//	•	A message indicating the null reference error.
//	java
//	Sample Code

	public class NullPointerHandling {
	    public static void main(String[] args) {
	        String str = null;
	        try {
	            System.out.println(str.length());
	        } catch (NullPointerException e) {
	            System.out.println("Error: Null reference encountered.");
	        }
	    }
	}
//	8. Exception Propagation
//	Write a program that demonstrates exception propagation by calling a method that throws an unchecked exception and handling it in the calling method.
//	Input:
//	•	No specific input required.
//	Output:
//	•	The caught exception message.
//	java
//	Sample Code
	public class ExceptionPropagation {
	    public static void main(String[] args) {
	        try {
	            method1();
	        } catch (ArithmeticException e) {
	            System.out.println("Caught exception in main: " + e.getMessage());
	        }
	    }

	    public static void method1() {
	        method2();
	    }

	    public static void method2() {
	        int result = 10 / 0; // This will throw ArithmeticException
	    }
	}
	
//	9. Resource Management using Try-With-Resources
//	Write a program to demonstrate exception handling using try-with-resources to automatically close resources.
//	Input:
//	•	No specific input required.
//	Output:
//	•	A message indicating that resources have been closed.
//	java
//	Sample Code
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class TryWithResources {
	    public static void main(String[] args) {
	        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
	            System.out.println(br.readLine());
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


}
