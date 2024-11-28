package com.cg.MyCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<>();
		
		//LinkedHashSet<String> set = new LinkedHashSet<>();
		
		//linked hashset maintains the insertion order
		
		TreeSet<Integer> set = new TreeSet<>();
		//unique and sorted order in treeSet
		
		set.add(1);
		set.add(4);
		set.add(8);
		set.add(2);
		
		Iterator<Integer> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Integer ele = iterator.next();
			System.out.println(ele);
		}
		System.out.println(set.size());
		
		// TODO Auto-generated method stub

	}

}
