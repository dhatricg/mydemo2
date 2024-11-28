package com.data;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {64, 34, -5, 12, 10, 2};
		
		int n = arr.length;
		
		for (int i = 0; i<n-1; i++) {
			for (int j=0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int val:arr) {
			System.out.print(val + " ");
			
		}
		System.out.println();
		
		
		char list[] = {'g', 'e', 'F', 'D', 'a'};
		
        int x = list.length;
		
		for (int i = 0; i<x-1; i++) {
			for (int j=0; j<x-i-1; j++) {
				if(list[j]>list[j+1]) {
					char temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
		
				}
				}
		for (char ch: list) {
			System.out.print(ch + " ");
		
		// TODO Auto-generated method stub
		}
		
		//Reverse Array
		int left = 0;
		int right = 0;
	}

}
