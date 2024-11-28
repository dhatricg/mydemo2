package com.cg.collections;

//1. Find All Substrings
//Write a function to find all possible substrings of a given string.
//•	Example:
//Input: "abc"
//Output: ["a", "b", "c", "ab", "bc", "abc"]

import java.util.ArrayList;
import java.util.List;

public class FindAllSubstrings {
    public static void main(String[] args) {
        // Example input
        String input = "abc";
        
        // Get all substrings
        List<String> substrings = findAllSubstrings(input);
        
        // Output the result
        System.out.println(substrings);  // Output: [a, b, c, ab, bc, abc]
    }

    // Function to find all substrings of a given string
    public static List<String> findAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        
        // Loop through each character in the string as the starting point
        for (int start = 0; start < str.length(); start++) {
            // Loop through each end point from the start index to the end of the string
            for (int end = start + 1; end <= str.length(); end++) {
                // Extract substring from start to end
                substrings.add(str.substring(start, end));
            }
        }
        
        // Return the list of all substrings
        return substrings;
    }
}

//2. String Permutations
//Given a string, generate all possible permutations of the characters in the string.
//•	Example:
//Input: "abc"
//Output: ["abc", "acb", "bac", "bca", "cab", "cba"]

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        // Example input
        String input = "abc";
        
        // Generate all permutations
        List<String> permutations = generatePermutations(input);
        
        // Output the result
        System.out.println(permutations);  // Output: [abc, acb, bac, bca, cab, cba]
    }

    // Function to generate all permutations of a string
    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        // Convert the string to a character array for easier manipulation
        char[] chars = str.toCharArray();
        
        // Call the helper function to generate permutations
        backtrack(chars, 0, result);
        
        return result;
    }

    // Helper function for backtracking
    private static void backtrack(char[] chars, int start, List<String> result) {
        // Base case: if the start index reaches the end of the string, add the current permutation
        if (start == chars.length) {
            result.add(new String(chars));  // Add the current permutation as a string
            return;
        }

        // Recursive case: try all possible swaps
        for (int i = start; i < chars.length; i++) {
            // Swap characters at positions `start` and `i`
            swap(chars, start, i);
            // Recurse to generate permutations for the remaining part of the string
            backtrack(chars, start + 1, result);
            // Backtrack: swap the characters back to their original positions
            swap(chars, start, i);
        }
    }

    // Helper function to swap two characters in the character array
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
//3. First Unique Character in a String
//Write a function that finds the first non-repeating character in a string.
//•	Example:
//Input: "loveleetcode"
//Output: "v"

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        // Example input
        String input = "loveleetcode";
        
        // Find the first unique character
        char result = firstUniqChar(input);
        
        // Output the result
        System.out.println(result);  // Output: 'v'
    }

    // Function to find the first unique character in the string
    public static char firstUniqChar(String s) {
        // HashMap to store the frequency of each character
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // First pass: count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Second pass: find the first character with a frequency of 1
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;  // Return the first unique character
            }
        }
        
        // If no unique character found, return a special value (e.g., '\0')
        return '\0';  // This could also be '-1' or any character representing "not found"
    }
}

//4. Count and Say Sequence
//Write a function that returns the n-th term in the "count-and-say" sequence. The sequence is defined as follows: starting with "1", each subsequent term describes the previous term.
//•	Example:
//Input: 4
//Output: "1211" (The sequence goes: "1", "11", "21", "1211", ...)
public class CountAndSay {
    public static void main(String[] args) {
        // Example input
        int n = 4;
        
        // Get the n-th term in the Count and Say sequence
        String result = countAndSay(n);
        
        // Output the result
        System.out.println(result);  // Output: "1211"
    }

    // Function to generate the n-th term in the Count and Say sequence
    public static String countAndSay(int n) {
        // Start with the first term in the sequence
        String result = "1";
        
        // Build the sequence up to the n-th term
        for (int i = 1; i < n; i++) {
            result = generateNextTerm(result);
        }
        
        return result;
    }

    // Function to generate the next term based on the current term
    public static String generateNextTerm(String term) {
        StringBuilder nextTerm = new StringBuilder();
        
        // Traverse through the current term and count consecutive digits
        int count = 1;
        for (int i = 1; i < term.length(); i++) {
            // If the current digit is the same as the previous one, increase the count
            if (term.charAt(i) == term.charAt(i - 1)) {
                count++;
            } else {
                // Otherwise, append the count and the digit to the next term
                nextTerm.append(count).append(term.charAt(i - 1));
                count = 1;  // Reset count for the new digit
            }
        }
        
        // Append the last group of digits
        nextTerm.append(count).append(term.charAt(term.length() - 1));
        
        return nextTerm.toString();
    }
}

//5. Check if String is a Rotation of Another
//Given two strings, check if one is a rotation of the other using only one call to a string function.
//•	Example:
//Input: "abcde", "cdeab"
//Output: true

public class StringRotationCheck {
    public static void main(String[] args) {
        // Example input
        String s1 = "abcde";
        String s2 = "cdeab";
        
        // Check if s2 is a rotation of s1
        boolean result = isRotation(s1, s2);
        
        // Output the result
        System.out.println(result);  // Output: true
    }

    // Function to check if s2 is a rotation of s1
    public static boolean isRotation(String s1, String s2) {
        // Check if the lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Concatenate s1 with itself and check if s2 is a substring of the result
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }
}

//6. Valid Parentheses
//Write a function to determine if a given string of parentheses is valid. A valid string must have matching pairs of opening and closing parentheses.
//•	Example:
//Input: "()[]{}"
//Output: true

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        // Example input
        String s = "()[]{}";
        
        // Check if the parentheses are valid
        boolean result = isValid(s);
        
        // Output the result
        System.out.println(result);  // Output: true
    }

    // Function to check if the string of parentheses is valid
    public static boolean isValid(String s) {
        // Stack to hold opening parentheses
        Stack<Character> stack = new Stack<>();
        
        // Traverse the string
        for (char c : s.toCharArray()) {
            // If the character is an opening parenthesis, push it to the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // If it's a closing parenthesis, check the stack
            else if (c == ')' || c == ']' || c == '}') {
                // If the stack is empty or the top of the stack doesn't match the closing parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all parentheses were matched
        return stack.isEmpty();
    }
}

//7. Longest Palindromic Substring
//Write a function to find the longest palindromic substring in a given string.
//•	Example:
//Input: "babad"
//Output: "bab" or "aba"

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        // Example input
        String s = "babad";
        
        // Find the longest palindromic substring
        String result = longestPalindrome(s);
        
        // Output the result
        System.out.println(result);  // Output: "bab" or "aba"
    }

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Expand around center for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Expand around center for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            
            // Update longest palindrome found
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        
        return longest;
    }

    // Helper function to expand around center and return the longest palindrome
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the substring that is the palindrome
        return s.substring(left + 1, right);
    }
}

//8. Minimum Window Substring
//Given two strings, S and T, write a function that finds the minimum window in S which will contain all the characters in T.
//•	Example:
//Input: S = "ADOBECODEBANC", T = "ABC"
//Output: "BANC"
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        // Example input
        String S = "ADOBECODEBANC";
        String T = "ABC";
        
        // Find the minimum window substring
        String result = minWindow(S, T);
        
        // Output the result
        System.out.println(result);  // Output: "BANC"
    }

    public static String minWindow(String S, String T) {
        if (S == null || T == null || S.length() < T.length()) {
            return "";
        }

        // Frequency map for characters in T
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : T.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        // Count of characters that are currently matched in the window
        HashMap<Character, Integer> windowMap = new HashMap<>();
        
        // Two pointers for the sliding window
        int left = 0;
        int right = 0;
        
        // Variables to store the minimum window's size and indices
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        
        // Counter to track how many characters are matched
        int matched = 0;
        
        // Expand the window by moving right pointer
        while (right < S.length()) {
            char rightChar = S.charAt(right);
            windowMap.put(rightChar, windowMap.getOrDefault(rightChar, 0) + 1);
            
            // If the current character in window matches the target map
            if (windowMap.get(rightChar) <= targetMap.getOrDefault(rightChar, 0)) {
                matched++;
            }
            
            // Shrink the window from the left if all characters are matched
            while (matched == T.length()) {
                // Update the result if we found a smaller window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                // Move left pointer to shrink the window
                char leftChar = S.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                
                if (windowMap.get(leftChar) < targetMap.getOrDefault(leftChar, 0)) {
                    matched--;
                }
                
                left++;
            }
            
            // Expand the window by moving right pointer
            right++;
        }
        
        // If we found a valid window, return the substring
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return S.substring(minLeft, minLeft + minLen);
    }
}
//9. Check if String is a Subsequence
//Given two strings, check if the first string is a subsequence of the second one.
//•	Example:
//Input: "abc", "ahbgdc"
//Output: true

public class SubsequenceCheck {
    public static void main(String[] args) {
        // Example input
        String s1 = "abc";
        String s2 = "ahbgdc";
        
        // Check if s1 is a subsequence of s2
        boolean result = isSubsequence(s1, s2);
        
        // Output the result
        System.out.println(result);  // Output: true
    }

    // Function to check if s1 is a subsequence of s2
    public static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        
        // Traverse through s2 and try to match characters of s1
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;  // Move to the next character in s1
            }
            j++;  // Always move to the next character in s2
        }
        
        // If we have matched all characters of s1, return true
        return i == s1.length();
    }
}

//10. Word Break Problem
//Given a string and a dictionary of words, determine if the string can be segmented into a space-separated sequence of dictionary words.
//•	Example:
//Input: "applepenapple", ["apple", "pen"]
//Output: true

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        // Example input
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");

        // Check if the string can be segmented
        boolean result = wordBreak(s, wordDict);

        // Output the result
        System.out.println(result);  // Output: true
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        // Convert wordDict to a set for faster lookups
        Set<String> wordSet = new HashSet<>(wordDict);
        
        // DP array to store results of subproblems
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Base case: empty string can always be segmented
        
        // Loop through each position in the string
        for (int i = 1; i <= s.length(); i++) {
            // Check all substrings ending at position i
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        
        // The last position in the dp array tells us if the whole string can be segmented
        return dp[s.length()];
    }
}









