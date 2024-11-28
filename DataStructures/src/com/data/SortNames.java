package com.data;

public class SortNames {

	public static void main(String[] args) {
		String[] names = {"Dhatri", "Aarti", "Palak", "Ayushi", "Ram"};
		printArray(names);
		
		mergeSort(names);
		
		System.out.println();
		printArray(names);
		
	}
		

	
	
	public static void mergeSort(SortNames[] names) {
		if (names.length<2){
			return;
		}
		
		int mid = names.length/2;
		SortNames[] left = new SortNames[mid];
		SortNames[] right = new SortNames[names.length-mid];
		
		System.arraycopy(names, 0, left, 0, mid );
		System.arraycopy(names, mid, right, 0, names.length-mid);
		
		mergeSort(left);
		mergeSort(right);
		
		merge(names, left, right);
		// TODO Auto-generated method stub
		
	}

	private static void merge(String[] names, String[] left, String[] right) {
		int l = 0, r = 0, k = 0;
		
		while (l<=left.length && r<=right.length) {
			if(left[l].compareTo(right[r])<0) {
				names[k++] = left[l++];
			
		}else {
			names[k++] = right[r++];
		}
		}
	    while(l<left.length) {
	    	names[k++] = left[l++];
	    }
	    while(r<right.length) {
	    	names[k++] = right[r++];
	    }
	
}


	private static void printArray(String[] names) {
		for(String num: names) {
			System.out.println(num);
		}
		// TODO Auto-generated method stub
		
	}

}