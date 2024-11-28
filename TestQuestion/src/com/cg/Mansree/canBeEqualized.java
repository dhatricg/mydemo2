package com.cg.Mansree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class canBeEqualized {

    public static List<String> canBeEqualized(List<String> firstStrings, List<String> secondStrings) {
        List<String> result = new ArrayList<>();

        // Iterate through each pair of strings
        for (int i = 0; i < firstStrings.size(); i++) {
            String first = firstStrings.get(i);
            String second = secondStrings.get(i);
            
            // If the strings have different lengths, they cannot be equalized
            if (first.length() != second.length()) {
                result.add("NO");
                continue;
            }

            // Maps to track character mappings
            Map<Character, Character> mapFirstToSecond = new HashMap<>();
            Map<Character, Character> mapSecondToFirst = new HashMap<>();
            boolean isValid = true;

            // Traverse each character of the strings
            for (int j = 0; j < first.length(); j++) {
                char c1 = first.charAt(j);
                char c2 = second.charAt(j);

                // Check first -> second mapping
                if (mapFirstToSecond.containsKey(c1)) {
                    if (mapFirstToSecond.get(c1) != c2) {
                        isValid = false;
                        break;
                    }
                } else {
                    mapFirstToSecond.put(c1, c2);
                }

                // Check second -> first mapping
                if (mapSecondToFirst.containsKey(c2)) {
                    if (mapSecondToFirst.get(c2) != c1) {
                        isValid = false;
                        break;
                    }
                } else {
                    mapSecondToFirst.put(c2, c1);
                }
            }

            // Add "YES" if mappings are consistent, else "NO"
            if (isValid) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Test case 1
        List<String> firstStrings1 = Arrays.asList("aaa", "abbbc", "zyz");
        List<String> secondStrings1 = Arrays.asList("bbb", "cccc", "zyx");
        System.out.println(canBeEqualized(firstStrings1, secondStrings1)); // ["YES", "NO", "YES"]

        // Test case 2
        List<String> firstStrings2 = Arrays.asList("ac", "pqqrr");
        List<String> secondStrings2 = Arrays.asList("ca", "prrrr");
        System.out.println(canBeEqualized(firstStrings2, secondStrings2)); // ["NO", "YES"]
    }
}

//
////char1 and char2 and we need to replace all occurences of char1 in the first string with char2
////example the string "xxyz" can be converted to any string like "yyyz","vvyz" "xxzz", "xxwz" etc
////it cannot be converted to //the string "yzyz" since all occurence can be replaced by a single new character
////both operation simultaneously is not allowed example "xz" and "zx" , we can not convert both the x's' in the respective strings to 'x' to make then 'z'
////example firststrings=["aaa","abbbc","zyz"]
////second string 	["bbb","cccc","zyx"]
//
////i=0 then firstStrings[0]="aaa" secondStrings[0]="bbb"
////hence the answer will be yes
////i=1 then firstStrings[1]="abbc" secondString[1]="cccc" answer will be no
////i=2; then firstStrings[2]="zyz" secondstrings[2]="zyx";
//
////we can replace only pccurance of'x' in seondString with'z'  hence answer is yes
//
////the answer will be returned in ["YES","NO","YES"]
////example 2-firstStrings[] size n=2
////ac firstStrings=["ac","pqqrr"];
////pqqrr
////2 secondStrings[
////size n=2;
////ca secondStrings[] size n=2;
////ca secondStrings=["ca],"prrrr"]
////the output will be NO YES
//
////I just need to write the function login in
//
//
//
//
//
//public static List<String> canBeEqualized(List<String>firstStrings,List<String>secondStrings){
//
//}