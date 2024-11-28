package com.cg.collections;
//
//Write a function that compresses a string such that consecutive occurrences of the same character are replaced by the character followed by the count of repetitions.
//•	Example:
//Input: "aabcccccaaa"
//Output: "a2b1c5a3"

public class StringCompressor {
    public static void main(String[] args) {
        // Example input
        String input = "aabcccccaaa";
        
        // Call the compress function
        String compressed = compressString(input);
        
        // Output the compressed string
        System.out.println("Compressed string: " + compressed);
    }

    // Function to compress the string
    public static String compressString(String str) {
        // If the input string is empty, return an empty string
        if (str == null || str.length() == 0) {
            return "";
        }

        // StringBuilder to hold the compressed result
        StringBuilder compressedString = new StringBuilder();
        
        // Initialize variables to track the current character and its count
        int count = 1;
        
        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Otherwise, append the current character and its count to the result
                compressedString.append(str.charAt(i - 1)).append(count);
                // Reset the count for the new character
                count = 1;
            }
        }
        
        // Append the last character and its count
        compressedString.append(str.charAt(str.length() - 1)).append(count);
        
        // Convert StringBuilder to string and return the result
        return compressedString.toString();
    }
}

//2. Anagram Check
//Given two strings, determine if they are anagrams of each other. Two strings are anagrams if they use the same characters in the same frequency, but possibly in a different order.
//•	Example:
//Input: "listen", "silent"
//Output: true

import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        // Check if the strings are anagrams
        boolean result = areAnagrams(str1, str2);
        
        // Output the result
        System.out.println("Are the strings anagrams? " + result);
    }
    
    // Function to check if two strings are anagrams using frequency count
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // HashMap to store the frequency of characters in str1
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each character in str1
        for (char c : str1.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Check the frequency of characters in str2
        for (char c : str2.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                return false; // If a character in str2 doesn't exist in str1, they're not anagrams
            }
            // Decrement the frequency count
            frequencyMap.put(c, frequencyMap.get(c) - 1);
            // If the frequency goes negative, then str2 has more of the character than str1
            if (frequencyMap.get(c) < 0) {
                return false;
            }
        }
        
        // If we reached here, all character frequencies match
        return true;
    }
}


//3. Palindrome Check
//Write a function to check if a given string is a palindrome (a word that reads the same forward and backward).
//•	Example:
//Input: "madam"
//Output: true

public class PalindromeCheck {
    public static void main(String[] args) {
        // Example input
        String input = "madam";
        
        // Check if the string is a palindrome
        boolean result = isPalindrome(input);
        
        // Output the result
        System.out.println("Is the string a palindrome? " + result);
    }
    
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // If the string is null or has length 0 or 1, it's a palindrome
        if (str == null || str.length() <= 1) {
            return true;
        }
        
        // Convert the string to lower case to handle case-insensitivity
        str = str.toLowerCase();
        
        // Initialize two pointers: one at the start and one at the end
        int left = 0;
        int right = str.length() - 1;
        
        // Iterate while the left pointer is less than the right pointer
        while (left < right) {
            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            // Skip non-alphanumeric characters from the right
            else if (!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            // If characters at both pointers are equal, move both pointers
            else if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }
            // If characters do not match, it's not a palindrome
            else {
                return false;
            }
        }
        
        // If the loop completes without returning false, it's a palindrome
        return true;
    }
}

//4. Longest Substring Without Repeating Characters
//Given a string, find the length of the longest substring without repeating characters.
//•	Example:
//Input: "abcabcbb"
//Output: 3 (Substring: "abc")

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        // Example input
        String input = "abcabcbb";
        
        // Find the length of the longest substring without repeating characters
        int result = lengthOfLongestSubstring(input);
        
        // Output the result
        System.out.println("Length of longest substring without repeating characters: " + result);
    }

    // Function to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        // HashSet to store the characters in the current window
        HashSet<Character> set = new HashSet<>();
        
        // Initialize two pointers: left and right
        int left = 0;
        int maxLength = 0;
        
        // Iterate with the right pointer
        for (int right = 0; right < s.length(); right++) {
            // If the character at right is in the set, move the left pointer to the right
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); // Remove character at left from the set
                left++; // Move left pointer to the right
            }
            
            // Add the character at right to the set
            set.add(s.charAt(right));
            
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}

//5. Character Frequency Count
//Count the frequency of each character in a string.
//•	Example:
//Input: "programming"
//Output: {p:1, r:2, o:1, g:2, a:1, m:2, i:1, n:1}

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Example input
        String input = "programming";
        
        // Get the frequency of each character
        Map<Character, Integer> frequencyMap = getCharacterFrequency(input);
        
        // Output the result
        System.out.println(frequencyMap);
    }

    // Function to count the frequency of each character in the string
    public static Map<Character, Integer> getCharacterFrequency(String str) {
        // HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Iterate through the string and count frequencies
        for (char c : str.toCharArray()) {
            // If the character is already in the map, increment its count
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        return frequencyMap;
    }
}

//6. String Rotation
//Check if one string is a rotation of another string.
//•	Example:
//Input: "waterbottle", "erbottlewat"
//Output: true

public class StringRotation {
    public static void main(String[] args) {
        // Example input
        String str1 = "waterbottle";
        String str2 = "erbottlewat";
        
        // Check if str2 is a rotation of str1
        boolean result = isRotation(str1, str2);
        
        // Output the result
        System.out.println(result);  // Output: true
    }

    // Function to check if str2 is a rotation of str1
    public static boolean isRotation(String str1, String str2) {
        // Check if the lengths of the strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Concatenate str1 with itself and check if str2 is a substring of the result
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}

//7. Reverse Words in a String
//Write a function that reverses the words in a given sentence without changing the order of the words.
//•	Example:
//Input: "I love programming"
//Output: "programming love I"

public class ReverseWords {
    public static void main(String[] args) {
        // Example input
        String sentence = "I love programming";
        
        // Reverse the words in the sentence
        String result = reverseWordsInSentence(sentence);
        
        // Output the result
        System.out.println(result);  // Output: "programming love I"
    }

    // Function to reverse words in a sentence
    public static String reverseWordsInSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Reverse the order of words
        StringBuilder reversedSentence = new StringBuilder();
        
        // Traverse words in reverse order and append to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");  // Add a space between words
            }
        }
        
        // Return the reversed sentence
        return reversedSentence.toString();
    }
}


//8. Remove Duplicates
//Remove all duplicate characters from a string, preserving the order of first occurrence.
//•	Example:
//Input: "banana"
//Output: "ban"

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example input
        String input = "banana";
        
        // Remove duplicates from the string
        String result = removeDuplicates(input);
        
        // Output the result
        System.out.println(result);  // Output: "ban"
    }

    // Function to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // HashSet to store characters we've already seen
        HashSet<Character> seen = new HashSet<>();
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Iterate through the string
        for (char c : str.toCharArray()) {
            // If we haven't seen the character before, add it to the result
            if (!seen.contains(c)) {
                seen.add(c);  // Mark the character as seen
                result.append(c);  // Add the character to the result string
            }
        }
        
        // Return the result as a string
        return result.toString();
    }
}








