package com.cg.Anshu;
/*
 * Question: Count Equivalent Word Groups
You are given an array of strings words, where each string consists of lowercase English letters. Two strings are considered equivalent if they contain the same set of unique characters, regardless of order or frequency.
For example:
"aaabbbcc" and "abc" are considered equal because both contain the unique characters a, b, and c.
"aabbccc" and "adc" are not considered equal because the sets of unique characters they contain are different.
Write a function countWithSimilarWords that returns the total number of pairs of equivalent strings from the input array.
 */
import java.util.*;

public class CountWithSimilarWords {
 
    public static long countWithSimilarWords(String[] words) {
        // Map to count unique sets of characters
        Map<String, Long> map = new HashMap<>();
 
        for (String word : words) {
            // Convert word to a sorted string of unique characters
            Set<Character> uniqueChars = new TreeSet<>();
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }
 
            // Convert the set of unique characters to a string for comparison
            String sortedUniqueChars = uniqueChars.toString();
 
            // Count how many times each set of unique characters appears
            map.put(sortedUniqueChars, map.getOrDefault(sortedUniqueChars, 0L) + 1);
        }
 
        // Sum all the counts (total number of equivalent groups)
        long result = 0;
        for (long count : map.values()) {
            // For each group, we want to count how many pairs of strings (i, j) are possible.
            // The number of ways to choose 2 items from a group of `count` items is: count * (count - 1) / 2
            result += (count * (count - 1)) / 2;
        }
 
        return result;
    }
 
    public static void main(String[] args) {
        String[] words = {"aaabbbcc", "abc", "aabbccc", "adc", "ab", "cba"};
        System.out.println(countWithSimilarWords(words)); // Output should count how many equal groups
    }
}
