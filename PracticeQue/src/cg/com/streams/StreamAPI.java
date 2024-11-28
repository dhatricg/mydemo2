package cg.com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StreamAPI {
	
	public static void main(String[] args) {
		//SUM OF EVEN NUMBERS
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        int sum = numbers.stream()
//                         .filter(n -> n % 2 == 0)
//                         .mapToInt(Integer::intValue)
//                         .sum();
//
//        System.out.println(sum);
      
		//Convert List of Strings to Uppercase
//		List<String> strings = Arrays.asList("apple", "banana", "cherry");
//
//        List<String> uppercaseStrings = strings.stream()
//                                               .map(String::toUpperCase)
//                                               .collect(Collectors.toList());
//
//        System.out.println(uppercaseStrings);
		
		//Find maximum value in a list
//		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5);
//
//        int max = numbers.stream()
//                         .max(Integer::compare)
//                         .orElseThrow(NoSuchElementException::new);
//
//        System.out.println(max);
          
		//Count Elements Greater Than a Threshold
//		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
//        int threshold = 25;
//
//        long count = numbers.stream()
//                            .filter(n -> n > threshold)
//                            .count();
//
//        System.out.println(count);

		
         //Find First Element Matching Condition
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        int value = 5;
//
//        numbers.stream()
//               .filter(n -> n > value)
//               .findFirst()
//               .ifPresentOrElse(System.out::println, 
//                               () -> System.out.println("No element found"));
//
//		
		
		//Concatenate Strings with Delimiter
//		List<String> strings = Arrays.asList("apple", "banana", "cherry");
//        String delimiter = ", ";
//        String result = strings.stream()
//                .collect(Collectors.joining(delimiter));
//
//        System.out.println(result);

		
       // Square of Each Element in a List
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//        List<Integer> squares = numbers.stream()
//                                       .map(n -> n * n)
//                                       .collect(Collectors.toList());
//
//        System.out.println(squares);
		
		
		//Group Strings by Length
//		List<String> strings = Arrays.asList("cat", "elephant", "dog", "lion", "antelope");
//
//        Map<Integer, List<String>> groupedByLength = strings.stream()
//                                                            .collect(Collectors.groupingBy(String::length));
//
//        System.out.println(groupedByLength);
		
		
		//Remove Duplicates and Sort a List
//        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 3, 5, 7, 9);
//
//        List<Integer> sortedUniqueNumbers = numbers.stream()
//                                                   .distinct()
//                                                   .sorted()
//                                                   .collect(Collectors.toList());
//
//        System.out.println(sortedUniqueNumbers);
		
		
		// Partition a List of Strings Based on Condition
        List<String> strings = Arrays.asList("ant", "bear", "cat", "dog", "elephant");

        Map<Boolean, List<String>> partitioned = strings.stream()
                                                        .collect(Collectors.partitioningBy(s -> s.length() > 3));

        System.out.println(partitioned);

		

		

		

		
		

	}

}
