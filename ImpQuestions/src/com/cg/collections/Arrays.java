package com.cg.collections;

//
//	1. Sum of Elements in an Array
//	Write a function that takes an array of integers and returns the sum of its elements.
//	Example:
//	•	Input: [1, 2, 3, 4, 5]
//	•	Output: 15
//	Hint: Iterate through the array and add each element to a sum variable.
public class ArraySum {
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 3, 4, 5};
        
        // Call the function to calculate the sum
        int result = sumOfElements(array);
        
        // Output the result
        System.out.println("Sum of elements: " + result);
    }

    // Function to calculate the sum of elements in the array
    public static int sumOfElements(int[] array) {
        int sum = 0;  // Initialize sum variable
        
        // Iterate through the array and add each element to sum
        for (int num : array) {
            sum += num;
        }
        
        // Return the total sum
        return sum;
    }
}

//2. Find the Maximum Element
//Write a function that finds the maximum value in a given array of integers.
//Example:
//•	Input: [5, 2, 8, 1, 9]
//•	Output: 9
//Hint: Use a loop to compare each element to a max variable
public class MaxElement {
    public static void main(String[] args) {
        // Example input array
        int[] array = {5, 2, 8, 1, 9};
        
        // Call the function to find the maximum element
        int max = findMaxElement(array);
        
        // Output the result
        System.out.println("Maximum element: " + max);
    }

    // Function to find the maximum element in the array
    public static int findMaxElement(int[] array) {
        // Initialize the max variable to the smallest possible integer
        int max = Integer.MIN_VALUE;
        
        // Iterate through the array and compare each element with max
        for (int num : array) {
            if (num > max) {
                max = num;  // Update max if a larger number is found
            }
        }
        
        // Return the maximum element
        return max;
    }
}

//3. Reverse an Array
//Write a function that reverses the elements of an array.
//Example:
//•	Input: [1, 2, 3, 4, 5]
//•	Output: [5, 4, 3, 2, 1]
//Hint: Swap elements from the start and end of the array, moving toward the center.

public class ReverseArray {
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 3, 4, 5};
        
        // Call the function to reverse the array
        reverseArray(array);
        
        // Output the reversed array
        System.out.print("Reversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse the array
    public static void reverseArray(int[] array) {
        int start = 0;               // Start index
        int end = array.length - 1;  // End index
        
        // Swap elements from start and end, moving towards the center
        while (start < end) {
            // Swap array[start] and array[end]
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move the indices towards the center
            start++;
            end--;
        }
    }
}

//4. Rotate an Array by K Positions
//Write a function that rotates an array by k positions to the right. If k = 3, the last 3 elements of the array move to the beginning.
//Example:
//•	Input: [1, 2, 3, 4, 5], k = 2
//•	Output: [4, 5, 1, 2, 3]
//Hint: Use a combination of array slicing and concatenation or handle rotation in-place using modular arithmetic.

public class RotateArray {
    public static void main(String[] args) {
        // Example input array and k value
        int[] array = {1, 2, 3, 4, 5};
        int k = 2;
        
        // Call the function to rotate the array by k positions
        rotateArray(array, k);
        
        // Output the rotated array
        System.out.print("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Function to rotate the array by k positions to the right
    public static void rotateArray(int[] array, int k) {
        int n = array.length;

        // Ensure k is within bounds of the array length (k = k % n)
        k = k % n;

        // Step 1: Reverse the entire array
        reverseArray(array, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverseArray(array, 0, k - 1);

        // Step 3: Reverse the remaining n-k elements
        reverseArray(array, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move the indices towards the center
            start++;
            end--;
        }
    }
}

//5. Find the Second Largest Element
//Write a function that finds the second largest element in an array of integers.
//Example:
//•	Input: [1, 4, 2, 7, 5]
//•	Output: 5
//Hint: Traverse the array while keeping track of the largest and second-largest values

public class SecondLargestElement {
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 4, 2, 7, 5};
        
        // Call the function to find the second largest element
        int secondLargest = findSecondLargest(array);
        
        // Output the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }

    // Function to find the second largest element in the array
    public static int findSecondLargest(int[] array) {
        // Check if the array has fewer than 2 elements
        if (array == null || array.length < 2) {
            return Integer.MIN_VALUE;  // No second largest element exists
        }
        
        // Initialize the largest and second largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Traverse the array to find the largest and second largest
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;      // Update second largest
            }
        }
        
        // Return the second largest element found, or MIN_VALUE if not found
        return secondLargest;
    }
}

//6. Check if Array is Sorted
//Write a function that checks if an array is sorted in ascending order.
//Example:
//•	Input: [1, 2, 3, 4, 5]
//•	Output: true
//Input: [1, 3, 2, 4, 5]
//•	Output: false
//Hint: Compare each element with the next one to see if they are in increasing order.

public class CheckSortedArray {
    public static void main(String[] args) {
        // Example input arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 2, 4, 5};
        
        // Call the function to check if the arrays are sorted
        System.out.println("Is array1 sorted? " + isSorted(array1));  // Should return true
        System.out.println("Is array2 sorted? " + isSorted(array2));  // Should return false
    }

    // Function to check if the array is sorted in ascending order
    public static boolean isSorted(int[] array) {
        // Iterate through the array and compare each element with the next one
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;  // Array is not sorted
            }
        }
        return true;  // Array is sorted in ascending order
    }
}

//7. Find the Frequency of Elements
//Write a function that counts the frequency of each element in an array.
//Example:
//•	Input: [2, 3, 2, 1, 4, 2]
//•	Output: {2: 3, 3: 1, 1: 1, 4: 1}
//Hint: Use a HashMap to store each element and its frequency.

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        // Example input array
        int[] array = {2, 3, 2, 1, 4, 2};
        
        // Call the function to count the frequency of elements
        Map<Integer, Integer> frequencyMap = countFrequency(array);
        
        // Output the frequency map
        System.out.println("Element frequencies: " + frequencyMap);
    }

    // Function to count the frequency of each element in the array
    public static Map<Integer, Integer> countFrequency(int[] array) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Traverse the array
        for (int num : array) {
            // If the element is already in the map, increment its frequency
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                // If the element is not in the map, add it with frequency 1
                frequencyMap.put(num, 1);
            }
        }
        
        // Return the frequency map
        return frequencyMap;
    }
}

//8. Merge Two Sorted Arrays
//Write a function that merges two sorted arrays into a single sorted array.
//Example:
//•	Input: [1, 3, 5] and [2, 4, 6]
//•	Output: [1, 2, 3, 4, 5, 6]
//Hint: Use two pointers to traverse both arrays and add smaller elements to the result.

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example input arrays
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};
        
        // Call the function to merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);
        
        // Output the merged array
        System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
    }

    // Function to merge two sorted arrays into a single sorted array
    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Initialize two pointers and the result array
        int i = 0, j = 0;
        int[] result = new int[array1.length + array2.length];
        int k = 0;  // Pointer for the result array
        
        // Traverse both arrays and merge them
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];  // Add element from array1
            } else {
                result[k++] = array2[j++];  // Add element from array2
            }
        }
        
        // If there are remaining elements in array1
        while (i < array1.length) {
            result[k++] = array1[i++];
        }
        
        // If there are remaining elements in array2
        while (j < array2.length) {
            result[k++] = array2[j++];
        }
        
        return result;
    }
}

//9. Find the Missing Number in a Series
//You are given an array containing n-1 integers in the range from 1 to n. There are no duplicates in the array. One number is missing. Find the missing number.
//Example:
//•	Input: [1, 2, 4, 5]
//•	Output: 3
//Hint: Calculate the sum of integers from 1 to n and subtract the sum of the array elements. 
//
public class MissingNumber {
    public static void main(String[] args) {
        // Example input array
        int[] array = {1, 2, 4, 5};
        
        // Call the function to find the missing number
        int missingNumber = findMissingNumber(array);
        
        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);
    }

    // Function to find the missing number in the series
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;  // Total number of elements should be n
        int expectedSum = n * (n + 1) / 2;  // Sum of integers from 1 to n
        int actualSum = 0;
        
        // Calculate the sum of elements in the array
        for (int num : array) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected and actual sum
        return expectedSum - actualSum;
    }
}


//10. Find the Subarray with Maximum Sum (Kadane's Algorithm)
//Write a function that finds the subarray with the maximum sum from an array of integers (can contain both positive and negative numbers).
//Example:
//•	Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//•	Output: 6 (subarray [4, -1, 2, 1] has the largest sum)
//Hint: Use Kadane's Algorithm to find the maximum sum efficiently.

public class MaximumSubarraySum {
    public static void main(String[] args) {
        // Example input array
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        
        // Call the function to find the maximum subarray sum
        int maxSum = findMaxSubarraySum(array);
        
        // Output the maximum sum
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int findMaxSubarraySum(int[] array) {
        // Initialize variables to track the current sum and the maximum sum
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;  // Start with a very small value
        
        // Traverse the array
        for (int num : array) {
            // Update currentSum: either add the current number or start a new subarray
            currentSum = Math.max(num, currentSum + num);
            
            // Update the maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}

//11. Find the Common Elements in Two Arrays
//Write a function to find the common elements between two arrays.
//Example:
//•	Input: [1, 2, 3, 4] and [3, 4, 5, 6]
//•	Output: [3, 4]
//Hint: Use a HashSet to store elements from one array and check against the other array.

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        // Example input arrays
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        
        // Call the function to find the common elements
        List<Integer> commonElements = findCommonElements(array1, array2);
        
        // Output the common elements
        System.out.println("Common elements: " + commonElements);
    }

    // Function to find common elements in two arrays
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        // Create a HashSet to store the elements of array1
        HashSet<Integer> set = new HashSet<>();
        List<Integer> commonList = new ArrayList<>();
        
        // Add elements of array1 to the HashSet
        for (int num : array1) {
            set.add(num);
        }
        
        // Check elements of array2 against the HashSet
        for (int num : array2) {
            if (set.contains(num)) {
                commonList.add(num);  // Add the common element to the result
            }
        }
        
        return commonList;
    }
}


//12. Find the Majority Element
//A majority element is an element that appears more than n/2 times in an array of size n. Write a function to find the majority element. If no such element exists, return -1.
//Example:
//•	Input: [3, 3, 4, 2, 4, 4, 2, 4, 4]
//•	Output: 4
//Hint: Use Moore's Voting Algorithm or a HashMap to track frequencies.

public class MajorityElement {
    public static void main(String[] args) {
        // Example input array
        int[] array = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        
        // Call the function to find the majority element
        int majorityElement = findMajorityElement(array);
        
        // Output the majority element
        System.out.println("Majority element: " + majorityElement);
    }

    // Function to find the majority element using Moore's Voting Algorithm
    public static int findMajorityElement(int[] array) {
        int candidate = -1, count = 0;
        
        // Phase 1: Find the candidate
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        // Phase 2: Verify the candidate
        int actualCount = 0;
        for (int num : array) {
            if (num == candidate) {
                actualCount++;
            }
        }
        
        // If the candidate appears more than n/2 times, return it; otherwise, return -1
        return (actualCount > array.length / 2) ? candidate : -1;
    }
}

//13. Find the Longest Consecutive Sequence
//Given an unsorted array of integers, find the length of the longest consecutive sequence of elements.
//Example:
//•	Input: [100, 4, 200, 1, 3, 2]
//•	Output: 4 (sequence [1, 2, 3, 4])
//Hint: Use a HashSet for constant-time lookups.

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        // Example input array
        int[] nums = {100, 4, 200, 1, 3, 2};
        
        // Call the function to find the longest consecutive sequence
        int longestSequence = longestConsecutive(nums);
        
        // Output the length of the longest consecutive sequence
        System.out.println("Longest consecutive sequence length: " + longestSequence);
    }

    // Function to find the length of the longest consecutive sequence
    public static int longestConsecutive(int[] nums) {
        // If the array is empty, return 0
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Insert all elements into a HashSet for constant-time lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Find the longest consecutive sequence
        int maxLength = 0;

        for (int num : nums) {
            // Only check for the beginning of a potential sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Extend the sequence by checking the next consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update maxLength with the longest sequence found
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}

//14. Product of Array Except Self
//Write a function that returns a new array where each element at index i is the product of all the numbers in the original array except the one at i. You should solve it without using division and in O(n) time.
//Example:
//•	Input: [1, 2, 3, 4]
//•	Output: [24, 12, 8, 6]
//Hint: Use two passes over the array: one to calculate the prefix product and one for the suffix product.

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 2, 3, 4};
        
        // Call the function to find the product of array except self
        int[] result = productExceptSelf(nums);
        
        // Output the result array
        System.out.print("Product of array except self: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Function to return the product of array except self
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Calculate prefix product and store in result
        result[0] = 1;  // No elements to the left of index 0
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Step 2: Calculate suffix product and update the result
        int suffixProduct = 1;  // No elements to the right of the last index
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffixProduct;
            suffixProduct *= nums[i];  // Update the suffix product for the next iteration
        }
        
        return result;
    }
}





code in java: Given an interface termed Bank, list the following functions:
void assign Loans(int[] loans);
void averageLoan();
void maxLoan();
void minLoan();


Create  2 classes, called PersonalLoanDept and BusinessLoanDept implementing the Bank interface. The specifications are given below.



The class PersonalLoanDept should include an integer-type array termed loan Ammounts of clients length is initialized in this classz, where clients is the count of loan recipients . the initilized in this class, where clients is the count of loan recqipients. The initial loan ammount assigned is zero.
void assignLoans(int[]loans); the loans array is linked to loan ammounts. if the lengths of the two arrays differ, as many values as possible are assigned, and then stop allocating more and print "loans for clients processed".
void averageLoan(); this displays the loan average in the pattern "average loan ammount for clients is {avaerageLoan}". The average computation should consider any zero value present in loanAmountsn and should be rounded to 2 decimal places.


void maxLoan(); This displays "maximum loan ammount amoungst clients is {maximumLoan}" reflecting the largest loan.


void minLoan(); Thia displays "Minimum loan amount clients is {minimumLoan}" reflecting the smallest loan given.



The businessLoanDept class necessitates an int[] as a variable denoted loanAmounts and should implement subsequent methods:


BusinessLoanDept(int businesses): This initializes an empty array loanAmounts of length businesses which signifies the number of business recipients.


void assignLoans(int[]loans): This assigns loans array to loanAmounts. This system discontinues further allocation is the lengths of arrays do not match post the assignment of possible values and prints "Loans for businesses processed".


void averageLoan(): This prints "Maximum loan amongst businesses is {maximumLoan" reflecting th highest loan.


void minLoan(): This prints "Minimum loan amongst businesses is {minimumLoan}" reflecting the lowest loan value.


Ensure the usage of inheritance and encapsulation  to prevent redundant code. Implementation of the PersonalLoanDept and BussinessLoanDept is checked using the interface Bank provided in the locked code stub.   import java.io.;
import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;
import java.util.stream.;


interface Bank {
void assignLoans(int[] loans);
void averageLoan();
void maxLoan();
void minLoan();
}


//WRITE your code here
public class Solution {
public static void main(String args[] ) throws Exception {
Scanner sc = new Scanner(System.in);


    String[] count = sc.nextLine().split(" ");

    PersonalLoanDept p = new PersonalLoanDept(Integer.parseInt(count[0]));
    BusinessLoanDept b = new BusinessLoanDept(Integer.parseInt(count[1]));

    count = sc.nextLine().split(" ");

    int[] loansClients = new int[count.length];
    for (int i=0; i<count.length; i++) {
        loansClients[i] = Integer.parseInt(count[i]);
    }
    p.assignLoans(loansClients);

    count = sc.nextLine().split(" ");
    int[] loansBusinesses = new int[count.length];
    for (int i=0; i<count.length; i++) {
        loansBusinesses[i] = Integer.parseInt(count[i]);
    }
    b.assignLoans(loansBusinesses);

    p.averageLoan();
    p.maxLoan();
    p.minLoan();

    b.averageLoan();
    b.maxLoan();
    b.minLoan();
}

}

