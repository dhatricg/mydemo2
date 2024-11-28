package cg.com.search;

public class BinarySearch {


		  int binarySearch(int array[], int x, int low, int high) {
		    while (low <= high) {
		      int mid = low + (high - low) / 2;
		 
		      if (x == array[mid])
		        return mid;
		 
		      if (x > array[mid])
		        low = mid + 1;
		 
		      else
		        high = mid - 1;
		    }
		 
		    return -1;
		  }
		 
		  public static void main(String args[]) {
			  
		    BinarySearch ob = new BinarySearch();
		    int array[] = { 20, 21, 50, 60, 70, 80, 90 };
		    int n = array.length;
		    int x = 90;
		    int result = ob.binarySearch(array, x, 0, n - 1);
		    if (result == -1)
		      System.out.println("Not found");
		    else
		      System.out.println("Element found at index " + result);
		  }
		}


