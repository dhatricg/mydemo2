package com.ds.heap;

public class UseHeap {

	public static void main(String[] args) {
		MinHeap obj = new MinHeap(6);
		
		obj.insert(15);
		obj.insert(20);
		obj.insert(7);
		obj.insert(9);
		obj.insert(30);
		
		//System.out.println(obj.getMax());
		System.out.println(obj.getMin());
		//System.out.println("Removed maximum: " + obj.removeMax()); // 30
      //  System.out.println("Next maximum: " + obj.getMax());
		// TODO Auto-generated method stub

	}

}
