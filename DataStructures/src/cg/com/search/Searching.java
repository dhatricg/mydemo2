package cg.com.search;

public class Searching {


	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		int item = 20;
		int flag = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == item){
				System.out.println("found");
	            flag = 1;
	            break;
			}
			if(flag==1) {
				System.out.println("found");
			}else {
				System.out.println("not found");
				}
			}
			
		
		
		// TODO Auto-generated method stub

	}

}
