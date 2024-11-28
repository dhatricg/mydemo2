package com.data;

import java.lang.reflect.Array;

public class MergeSort {

	public static void main(String[] args) {
		int [] arr = {11, 9, 7, -2, 33, 44};
		System.out.println("Original array");
		printArray(arr);
		
		mergeSort(arr);
		
		System.out.println("Sorted array");
		printArray(arr);
		
		// TODO Auto-generated method stub

	}

	public static void mergeSort(int[] arr) {
		if (arr.length<2) {
			return;
		}
		
		int mid = arr.length/2;
		int[] left = new int[mid];
		int[] right = new int[arr.length - mid];
		
		System.arraycopy(arr, 0, left,0, mid);
		System.arraycopy(arr, mid, right, 0, arr.length-mid);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, right);
		// TODO Auto-generated method stub
		
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int leftIndex = 0;
		int rightIndex = 0;
		int arrayIndex = 0;
		
		while(leftIndex<left.length && rightIndex<right.length) {
			if(left[leftIndex] <= right[rightIndex]) {
				arr[arrayIndex++] = left[leftIndex++];
			}else {
				arr[arrayIndex++] = right[rightIndex++];
			}
		} 
		while(leftIndex<left.length) {
			arr[arrayIndex++] = left[leftIndex++];
		}
		
		while(rightIndex<right.length) {
			arr[arrayIndex++] = right[rightIndex++];
		}
				
		// TODO Auto-generated method stub
		
	}

	private static void printArray(int[] arr) {
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
