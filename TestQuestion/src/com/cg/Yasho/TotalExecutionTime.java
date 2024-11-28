package com.cg.Yasho;

import java.io.*;
import java.util.*;
import java.util.stream.*;
 
class Result {
 
   
    public static List<Integer> getTotalExecutionTime(int n, List<String> logs) {
        int[] exclusiveTime = new int[n];

        Stack<Integer> stack = new Stack<>();

        int prevTime = 0;
 
      
        for (String log : logs) {
            String[] parts = log.split(":");
            int funcId = Integer.parseInt(parts[0]);
            String action = parts[1];
            int timestamp = Integer.parseInt(parts[2]);
 
            if (action.equals("start")) {
                if (!stack.isEmpty()) {
                    int prevFunc = stack.peek();
                    exclusiveTime[prevFunc] += timestamp - prevTime;
                }
 
             
                stack.push(funcId);
                prevTime = timestamp;
 
            } else if (action.equals("end")) {
                int runningFunc = stack.pop();
                exclusiveTime[runningFunc] += timestamp - prevTime + 1; 
                prevTime = timestamp + 1; 
            }
        }
 
      
        return Arrays.stream(exclusiveTime).boxed().collect(Collectors.toList());
    }
}
 
/*public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        // Read input values
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());
 
      
        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(Collectors.toList());
 
        // Call the function to get the execution times
        List<Integer> result = Result.getTotalExecutionTime(n, logs);
 
        // Write the result to output
        bufferedWriter.write(result.stream().map(Object::toString).collect(Collectors.joining("\n")) + "\n");
 
        // Close resources
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/
