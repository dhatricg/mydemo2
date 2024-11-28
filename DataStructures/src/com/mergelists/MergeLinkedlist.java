package com.mergelists;

import java.util.Collections;
import java.util.LinkedList;

public class MergeLinkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(2);
		list1.add(13);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(12);
		list2.add(20);
		list2.add(10);
		
		LinkedList<Integer> list3 = new LinkedList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		Collections.sort(list3);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}


}
