package com.cg.imp;
//package com.cg.imp;


	/*Given an array of strings, group anagrams together. An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
	Implement a Java program to group the anagrams together.
	Specifications:
	1. Class Definitions
	Class Anagram Groups
	• Implement the following method for this class:
	o List<List<String>> groupAnagrams(String[] strs): Groups anagrams together from the input array of strings.
	• Visibility: public
	• Return Type: List<List<String>>
	Sample Input
	String[] strs = ("eat", "tea", "tan", "ate", "nat", "bat");
	Sample Output
	[["ate", "eat", "tea"], ["nat", "tan"], ["bat"]]*/

import java.util.*;

public class AnagramGroups {
    
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        // Create an instance of AnagramGroups
        AnagramGroups ag = new AnagramGroups();
        
        // Call the groupAnagrams method and print the result
        List<List<String>> result = ag.groupAnagrams(strs);
        System.out.println(result);
    }

    // Method to group anagrams
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a hash map to store the anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        // Loop through each string in the input array
        for (String str : strs) {
            // Convert the string into a char array, sort it, and convert it back to a string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            // If the sorted string is already a key in the map, add the original string to the list
            // If not, create a new list for that key
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        
        // Return the values of the map, which are the grouped anagrams
        return new ArrayList<>(anagramMap.values());
    }
}
