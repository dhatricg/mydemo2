package com.data;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {12, 7, 9, 10, 2, -2, 0};
		for(int i=0; i<arr.length-1; i++) {
			int mini = i;
			for (int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println("Sorted array");
		for(int num: arr) {
			System.out.println(num+" ");
		}
		// TODO Auto-generated method stub

	}

}
