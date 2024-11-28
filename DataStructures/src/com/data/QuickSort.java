package com.data;

public class QuickSort {
	
		 
	    // Method to perform quick sort
	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Partition the array
	            int pivotIndex = partition(arr, low, high);
	           
	            // Recursively sort the sub-arrays
	            quickSort(arr, low, pivotIndex - 1);   // Left of pivot
	            quickSort(arr, pivotIndex + 1, high);  // Right of pivot
	        }
	    }
 
	    // Method to partition the array
	    public static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high]; // Pivot element
	        int i = low - 1; // Index of smaller element
	       
	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	               
	                // Swap arr[i] with arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	       
	        // Swap arr[i + 1] with arr[high] (pivot element)
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;
	       
	        return i + 1; // Return the pivot index
	    }
 
	    // Method to print the array
	    public static void printArray(int[] arr) {
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
 
	    public static void main(String[] args) {
	        int[] array = {51, 95, 66, 72, 42, 38, 39, 41, 15};
	       
	        System.out.println("Original array:");
	        printArray(array);
	       
	        quickSort(array, 0, array.length - 1); // Perform quick sort
	       
	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	}

