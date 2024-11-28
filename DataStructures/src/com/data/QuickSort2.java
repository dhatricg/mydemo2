package com.data;

public class QuickSort2 {

	 
	 
	 
		    public static void quickSort(int[] array, int low, int high) {
		        if (low < high) {
		            int pivotIndex = partition(array, low, high);
		            quickSort(array, low, pivotIndex - 1);  // Sort the left part
		            quickSort(array, pivotIndex + 1, high); // Sort the right part
		        }
		    }
	 
		    private static int partition(int[] array, int low, int high) {
		        int pivot = array[low]; // Choose the first element as pivot
		        int i = low + 1;
	 
		        for (int j = low + 1; j <= high; j++) {
		            if (array[j] <= pivot) {
		                swap(array, i, j);
		                i++;
		            }
		        }
		        swap(array, low, i - 1); // Place the pivot in the correct position
		        return i - 1; // Return the pivot index
		    }
	 
		    private static void swap(int[] array, int i, int j) {
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		    }
	 
		    public static void main(String[] args) {
		        int[] array = {3, 6, 8, 10, 1, 2, 1};
		        quickSort(array, 0, array.length - 1);
		       
		        System.out.print("Sorted array: ");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		    }
	
}
