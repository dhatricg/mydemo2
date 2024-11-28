package com.cg.Kanishka;

import java.io.*;
import java.util.*;
import java.util.stream.*;
 
class Test {
 
    public static int findLongestSubsequence(List<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0; 
        }
 
        int n = arr.size();
        int[] a = new int[n];
        Arrays.fill(a, 1);
 
       
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    a[i] = Math.max(a[i], a[j] + 1);
                }
            }
        }
 
       
        return Arrays.stream(a).max().getAsInt();
    }
 
}
 
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());
 
        int result = Result.findLongestSubsequence(arr);
 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/


/*
 * solution 2
 * import java.io.*;
import java.util.*;
import java.util.stream.*;
 
class Result {
 
    /*
     * Complete the 'findLongestSubsequence' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     
 
    public static int findLongestSubsequence(List<Integer> arr) {
        // Count the number of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
 
        // Loop through the array and count evens and odds
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
 
        // The longest subsequence where sum of differences is even is the largest of the two groups
        return Math.max(evenCount, oddCount);
    }
}
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());
 
        int result = Result.findLongestSubsequence(arr);
 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/

/*
 * class Result {
 
    /*
     * Complete the 'findLongestSubsequence' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     
 
    public static int findLongestSubsequence(List<Integer> arr) {
        // Count the number of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
 
        // Loop through the array and count evens and odds
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
 
        // The longest subsequence where sum of differences is even is the largest of the two groups
        return Math.max(evenCount, oddCount);
    }
}
 */
