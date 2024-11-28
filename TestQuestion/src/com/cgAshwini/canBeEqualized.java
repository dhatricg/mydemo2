package com.cgAshwini;

import java.io.*;
import java.util.*;
import java.util.stream.*;
 
class Result {
 
    /*
     * Complete the 'canBeEqualized' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY firstStrings
     *  2. STRING_ARRAY secondStrings
     */
 
    public static List<String> canBeEqualized(List<String> firstStrings, List<String> secondStrings) {
        // Create frequency maps for both lists
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        
        // Populate the frequency map for firstStrings
        for (String str : firstStrings) {
            firstMap.put(str, firstMap.getOrDefault(str, 0) + 1);
        }
        
        // Populate the frequency map for secondStrings
        for (String str : secondStrings) {
            secondMap.put(str, secondMap.getOrDefault(str, 0) + 1);
        }
 
        // Compare the two maps
        if (firstMap.equals(secondMap)) {
            return Collections.singletonList("YES");
        } else {
            return Collections.singletonList("NO");
        }
    }
}
 
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int firstStringsCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<String> firstStrings = IntStream.range(0, firstStringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(Collectors.toList());
 
        int secondStringsCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<String> secondStrings = IntStream.range(0, secondStringsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(Collectors.toList());
 
        List<String> result = Result.canBeEqualized(firstStrings, secondStrings);
 
        bufferedWriter.write(
            result.stream()
                .collect(Collectors.joining("\n"))
            + "\n"
        );
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/
