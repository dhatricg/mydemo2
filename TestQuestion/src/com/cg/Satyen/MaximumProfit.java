package com.cg.Satyen;

import java.io.*;
import java.util.*;
import java.util.stream.*;
 
/*class Result {
    public static long getMaximumProfit(List<Integer> price, List<Integer> profit) {
        int n = price.size();
        if (n < 3) {
            return -1; // No triplet possible if there are less than 3 days.
        }
        // Arrays to store maximum profit pairs on the left and right of each day.
        long[] leftProfit = new long[n];
        long[] rightProfit = new long[n];
        // Initialize left array to store the best (price, profit) pairs up to each index.
        int minPriceIndex = 0;
        leftProfit[0] = Long.MIN_VALUE;
        for (int j = 1; j < n; j++) {
            if (price[j] > price[minPriceIndex]) {
                leftProfit[j] = Math.max(leftProfit[j - 1], profit[minPriceIndex] + profit[j]);
            } else {
                leftProfit[j] = leftProfit[j - 1];
            }
            if (price[j] < price[minPriceIndex]) {
                minPriceIndex = j;
            }
        }
        // Initialize right array to store the best (price, profit) pairs from each index to the end.
        int maxPriceIndex = n - 1;
        rightProfit[n - 1] = Long.MIN_VALUE;
        for (int j = n - 2; j >= 0; j--) {
            if (price[j] < price[maxPriceIndex]) {
                rightProfit[j] = Math.max(rightProfit[j + 1], profit[j] + profit[maxPriceIndex]);
            } else {
                rightProfit[j] = rightProfit[j + 1];
            }
            if (price[j] > price[maxPriceIndex]) {
                maxPriceIndex = j;
            }
        }
        // Calculate the maximum profit by choosing a middle day `j` and combining the best `i` and `k`.
        long maxProfit = -1;
        for (int j = 1; j < n - 1; j++) {
            if (leftProfit[j] != Long.MIN_VALUE && rightProfit[j] != Long.MIN_VALUE) {
                maxProfit = Math.max(maxProfit, leftProfit[j] + profit[j] + rightProfit[j]);
            }
        }
        return maxProfit;
    }
}
 
public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        int priceCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<Integer> price = IntStream.range(0, priceCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
 
        int profitCount = Integer.parseInt(bufferedReader.readLine().trim());
 
        List<Integer> profit = IntStream.range(0, profitCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(Collectors.toList());
 
        long result = Result.getMaximumProfit(price, profit);
 
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}*/