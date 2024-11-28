package com.cg.Aarohi;
//for stock analysis to find maximum profit of 3 elements, i,j,k in a list.
import java.util.Arrays;

public class StockProfit {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 3) {
            return 0;
        }
 
        int n = prices.length;
        int[] maxProfit1 = new int[n];
        int[] maxProfit2 = new int[n];
 
        // Calculate maxProfit1
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit1[i] = Math.max(maxProfit1[i - 1], prices[i] - minPrice);
        }
 
        // Calculate maxProfit2
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit2[i] = Math.max(maxProfit2[i + 1], maxPrice - prices[i]);
        }
 
        // Combine results
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, maxProfit1[i] + maxProfit2[i]);
        }
 
        return maxProfit;
    }
 
    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));  // Output: 6
    }
}