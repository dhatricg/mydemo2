package com.data;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {64, 34, -5, 12, 10, 2};
		
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
		}
		for(int val:arr) {
			System.out.print(val+" ");
			
		}

	}

}
