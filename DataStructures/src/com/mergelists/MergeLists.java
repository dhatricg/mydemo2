package com.mergelists;

import java.util.ArrayList;
import java.util.Collections;

public class MergeLists {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(2);
		list1.add(13);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(12);
		list2.add(20);
		list2.add(10);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		Collections.sort(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}

}
