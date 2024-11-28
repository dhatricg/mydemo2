package com.cg.vaibhaviG;

import java.security.Timestamp;

import java.io.*;
import java.util.*;
 //getTotalExecutionTime
public class Solution {
    static class Result {
        public static List<Integer> getTotalExecutionTime(int n, List<String> logs) {
            // Create an array to store the total exclusive time for each function
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();
            int prevTime = 0;
            for (String log : logs) {
                // Split log into function ID, action, and timestamp
                String[] parts = log.split(":");
                int functionId = Integer.parseInt(parts[0]);
                String action = parts[1];
                int timestamp = Integer.parseInt(parts[2]);
                if (action.equals("start")) {
                    // If it's a start, push the function onto the stack
                    if (!stack.isEmpty()) {
                        // If there is an active function, accumulate its exclusive time
                        result[stack.peek()] += timestamp - prevTime;
                    }
                    stack.push(functionId);
                    prevTime = timestamp;
                } else {
                    // If it's an end, calculate the exclusive time for the current function
                    result[stack.pop()] += timestamp - prevTime + 1;
                    prevTime = timestamp + 1;
                }
            }
            // Convert the result array to a List<Integer>
            List<Integer> executionTimes = new ArrayList<>();
            for (int time : result) {
                executionTimes.add(time);
            }
            return executionTimes;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bufferedReader.readLine().trim());  // Number of functions
        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());  // Number of logs
        List<String> logs = new ArrayList<>();
        for (int i = 0; i < logsCount; i++) {
            logs.add(bufferedReader.readLine());
        }
        // Get the total exclusive execution time for each function
        List<Integer> result = Result.getTotalExecutionTime(n, logs);
        // Write the result to output
        for (Integer time : result) {
            bufferedWriter.write(time + "\n");
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}