package com.cg.mansi;

import java.util.*;
import java.io.*;
import java.math.*;
 
class Result {
 
    public static int findTotalCost(List<Integer> arr) {
        int totalCost = 0;
 
        while (arr.size() > 1) {
            // Find the minimum and maximum elements
            int minElement = Collections.min(arr);
            int maxElement = Collections.max(arr);
 
            // Calculate the cost
            int cost = (int) Math.ceil((minElement + maxElement) / (double)(maxElement - minElement + 1));
            totalCost += cost;
 
            // Remove the minimum and maximum elements
            arr.remove(Integer.valueOf(minElement));
            arr.remove(Integer.valueOf(maxElement));
 
            // Add their sum back to the array
            arr.add(minElement + maxElement);
        }
 
        return totalCost;
    }
}
 
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrCount; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }
 
        int result = Result.findTotalCost(arr);
 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }*/


//CODE :2
/*
 * import java.util.*;
import java.io.*;
 
class Result {
 
    public static int findTotalCost(List<Integer> arr) {
        // Min-heap for minimum element
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Max-heap for maximum element (using negative values)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
 
        // Add all elements to both heaps
        for (int num : arr) {
            minHeap.add(num);
            maxHeap.add(num);
        }
 
        int totalCost = 0;
 
        while (minHeap.size() > 1) {
            // Get the minimum and maximum elements
            int minElement = minHeap.poll();
            int maxElement = maxHeap.poll();
 
            // Calculate the cost
            int cost = (int) Math.ceil((minElement + maxElement) / (double)(maxElement - minElement + 1));
            totalCost += cost;
 
            // Add their sum back to both heaps
            int newElement = minElement + maxElement;
            minHeap.add(newElement);
            maxHeap.add(newElement);
        }
 
        return totalCost;
    }
}
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrCount; i++) {
            arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }
 
        int result = Result.findTotalCost(arr);
 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}
}*/
