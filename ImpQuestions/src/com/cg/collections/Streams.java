package com.cg.collections;

public class Streams {
//	1. Sum of Even Numbers
//	Given a list of integers, use Stream API to find the sum of all even numbers.
//	Input:
//	•	A list of integers.
//	Output:
//	•	The sum of all even numbers.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class SumOfEvenNumbers {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        int sum = numbers.stream()
	                         .filter(n -> n % 2 == 0)
	                         .mapToInt(Integer::intValue)
	                         .sum();

	        System.out.println(sum);
	    }
	}
//	2. Convert List of Strings to Uppercase
//	Given a list of strings, convert each string to uppercase using Stream API.
//	Input:
//	•	A list of strings.
//	Output:
//	•	A list of uppercase strings.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class ConvertToUppercase {
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("apple", "banana", "cherry");

	        List<String> uppercaseStrings = strings.stream()
	                                               .map(String::toUpperCase)
	                                               .collect(Collectors.toList());

	        System.out.println(uppercaseStrings);
	    }
	}

//	3. Find Maximum Value in a List
//	Given a list of integers, use Stream API to find the maximum value.
//	Input:
//	•	A list of integers.
//	Output:
//	•	The maximum value in the list.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class FindMaxValue {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);

	        int max = numbers.stream()
	                         .max(Integer::compare)
	                         .orElseThrow(NoSuchElementException::new);

	        System.out.println(max);
	    }
	}
//	4. Count Elements Greater Than a Threshold
//	Given a list of integers, count how many numbers are greater than a specified threshold using Stream API.
//	Input:
//	•	A list of integers and a threshold value.
//	Output:
//	•	The count of numbers greater than the threshold.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class CountGreaterThanThreshold {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
	        int threshold = 25;

	        long count = numbers.stream()
	                            .filter(n -> n > threshold)
	                            .count();

	        System.out.println(count);
	    }
	}
	
//	5. Find First Element Matching Condition
//	Given a list of integers, find the first element greater than a specified value using Stream API.
//	Input:
//	•	A list of integers and a value.
//	Output:
//	•	The first number greater than the specified value or a message if none is found.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class FindFirstGreaterThan {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	        int value = 5;

	        numbers.stream()
	               .filter(n -> n > value)
	               .findFirst()
	               .ifPresentOrElse(System.out::println, 
	                               () -> System.out.println("No element found"));
	    }
	}

//	6. Concatenate Strings with Delimiter
//	Given a list of strings, concatenate them into a single string with a delimiter using Stream API.
//	Input:
//	•	A list of strings and a delimiter.
//	Output:
//	•	A single string with the elements concatenated by the delimiter.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class ConcatenateWithDelimiter {
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("apple", "banana", "cherry");
	        String delimiter = ", ";

	        String result = strings.stream()
	                               .collect(Collectors.joining(delimiter));

	        System.out.println(result);
	    }
	}

//	7. Square of Each Element in a List
//	Given a list of integers, return a list containing the square of each element using Stream API.
//	Input:
//	•	A list of integers.
//	Output:
//	•	A list of the squares of the integers.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class SquareEachElement {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        List<Integer> squares = numbers.stream()
	                                       .map(n -> n * n)
	                                       .collect(Collectors.toList());

	        System.out.println(squares);
	    }
	}
	
//	8. Group Strings by Length
//	Given a list of strings, group them by their length using Stream API.
//	Input:
//	•	A list of strings.
//	Output:
//	•	A map where the key is the string length and the value is a list of strings of that length.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class GroupByLength {
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("cat", "elephant", "dog", "lion", "antelope");

	        Map<Integer, List<String>> groupedByLength = strings.stream()
	                                                            .collect(Collectors.groupingBy(String::length));

	        System.out.println(groupedByLength);
	    }
	}

//	9. Remove Duplicates and Sort a List
//	Given a list of integers, use Stream API to remove duplicates and return the list sorted.
//	Input:
//	•	A list of integers.
//	Output:
//	•	A sorted list with duplicates removed.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class RemoveDuplicatesAndSort {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 3, 5, 7, 9);

	        List<Integer> sortedUniqueNumbers = numbers.stream()
	                                                   .distinct()
	                                                   .sorted()
	                                                   .collect(Collectors.toList());

	        System.out.println(sortedUniqueNumbers);
	    }
	}
	
//	10. Partition a List of Strings Based on Condition
//	Given a list of strings, partition the strings into two groups based on whether their length is greater than 3 using Stream API.
//	Input:
//	•	A list of strings.
//	Output:
//	•	A map with two entries: one containing strings with length greater than 3 and one containing strings with length 3 or less.
//	java
//	Sample Code
	import java.util.*;
	import java.util.stream.*;

	public class PartitionByLength {
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("ant", "bear", "cat", "dog", "elephant");

	        Map<Boolean, List<String>> partitioned = strings.stream()
	                                                        .collect(Collectors.partitioningBy(s -> s.length() > 3));

	        System.out.println(partitioned);
	    }
	}


}














