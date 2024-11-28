package com.cg.imp;

//Class Variables:
//o List<String> names
//Class NameProcessor.
//• Implement the following methods for this class:
//o List<String> processNames(List<String> names): This method takes a list of names, removes duplicates, sorts them alphabetically, and converts them to uppercase.
//• Visibility: public
//• Return Type: List<String>
//o String find LongestName(List<String> names): This method takes a list of names and returns the longest name. If there are multiple names with the same length, return the first one encountered.
//• Visibility: public
//• Return Type: String
//Example Input
//["Rohit", "Anita", "Suresh", "Rohit", "Priya", "anita", "Kumar"]
//Example Output:
//Processed Names: [ANITA, KUMAR, PRIYA, ROHIT, SURESH]
//Longest Name: SURESH
import java.util.*;
import java.util.stream.Collectors;

class NameProcessor {

    // Method to process names: Remove duplicates, sort alphabetically, and convert to uppercase
    public List<String> processNames(List<String> names) {
        // Remove duplicates (case-insensitive) and convert to uppercase
        Set<String> uniqueNames = names.stream()
                                       .map(name -> name.toUpperCase()) // Convert to uppercase
                                       .collect(Collectors.toSet());    // Remove duplicates

        // Sort the names alphabetically and return as a list
        return uniqueNames.stream()
                          .sorted() // Sort alphabetically
                          .collect(Collectors.toList());
    }

    // Method to find the longest name
    public String findLongestName(List<String> names) {
        // Check if the list is empty
        if (names.isEmpty()) {
            return "";
        }

        // Use the stream to find the name with the maximum length
        return names.stream()
                    .max(Comparator.comparingInt(String::length)) // Find the longest name
                    .orElse(""); // Return an empty string if no name is found
    }
}

public class que3 {
    public static void main(String[] args) {
        // Sample input
        List<String> names = Arrays.asList("Rohit", "Anita", "Suresh", "Rohit", "Priya", "anita", "Kumar");

        // Create an instance of NameProcessor
        NameProcessor nameProcessor = new NameProcessor();

        // Process the names
        List<String> processedNames = nameProcessor.processNames(names);
        System.out.println("Processed Names: " + processedNames);

        // Find the longest name
        String longestName = nameProcessor.findLongestName(processedNames);
        System.out.println("Longest Name: " + longestName);
    }
}
