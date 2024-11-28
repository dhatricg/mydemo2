package com.cg.collections;


//1. Reverse a String
//Write a method to reverse a given string.
//java
//Sample Code
public static String reverseString(String input) {
    return new StringBuilder(input).reverse().toString();
}

//2. Check if a String is Palindrome
//Determine if a given string is a palindrome (a word, phrase, or sequence that reads the same backward as forward).
//java
//Sample Code

public static boolean isPalindrome(String input) {
    String reversed = new StringBuilder(input).reverse().toString();
    return input.equals(reversed);
}

//3. Count Vowels and Consonants
//Write a method that takes a string and counts the number of vowels and consonants.
//java
//Sample Code

public static void countVowelsAndConsonants(String input) {
    int vowels = 0, consonants = 0;
    input = input.toLowerCase();
    for (char c : input.toCharArray()) {
        if ("aeiou".indexOf(c) != -1) {
            vowels++;
        } else if (Character.isLetter(c)) {
            consonants++;
        }
    }
    System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
}

//4. Find First Non-Repeated Character
//Given a string, find the first non-repeated character in it.
//java
//Sample Code
public static char firstNonRepeatedChar(String input) {
    Map<Character, Integer> charCount = new LinkedHashMap<>();
    for (char c : input.toCharArray()) {
        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
        if (entry.getValue() == 1) {
            return entry.getKey();
        }
    }
    return '\0'; // Return null character if all are repeated
}
//5. Check if Two Strings are Anagrams
//Write a method to check if two strings are anagrams of each other.
//java
//Sample Code

public static boolean areAnagrams(String str1, String str2) {
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1, arr2);
}

//6. Remove Duplicates from a String
//Write a method to remove duplicate characters from a given string.
//java
//Sample Code
public static String removeDuplicates(String input) {
    Set<Character> seen = new LinkedHashSet<>();
    for (char c : input.toCharArray()) {
        seen.add(c);
    }
    StringBuilder sb = new StringBuilder();
    for (char c : seen) {
        sb.append(c);
    }
    return sb.toString();
}

//7. Count Occurrences of Each Character
//Write a method that counts the occurrences of each character in a string.
//java
//Sample Code
public static void countCharOccurrences(String input) {
    Map<Character, Integer> occurrences = new HashMap<>();
    for (char c : input.toCharArray()) {
        occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
    }
    for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}

//8. Find Longest Substring Without Repeating Characters
//Write a method to find the longest substring in a given string that does not repeat characters.
//java
//Sample Code

public static String longestUniqueSubstring(String input) {
    String longest = "";
    Set<Character> seen = new HashSet<>();
    int start = 0;
    
    for (int end = 0; end < input.length(); end++) {
        char c = input.charAt(end);
        while (seen.contains(c)) {
            seen.remove(input.charAt(start));
            start++;
        }
        seen.add(c);
        if (end - start + 1 > longest.length()) {
            longest = input.substring(start, end + 1);
        }
    }
    return longest;
}

//9. Check if a String Contains Only Digits
//Write a method that checks if a string contains only digits.
//java
//Sample Code

public static boolean isNumeric(String input) {
    return input.matches("\\d+");
}

//10. Find All Permutations of a String
//Write a method to print all permutations of a given string.
//java
//Sample Code
public static void findPermutations(String input) {
    permute(input, "");
}

private static void permute(String input, String result) {
    if (input.length() == 0) {
        System.out.println(result);
        return;
    }
    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        String remainder = input.substring(0, i) + input.substring(i + 1);
        permute(remainder, result + c);
    }
}
