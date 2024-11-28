package com.cg.basic;

public class Used_datatypes {

	/**
	 * 
	 */
	public Used_datatypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1;
		String name = "Dhatri";
		int age = 22;
		float salary = 2800.50f;
		
		
		System.out.println("dear" + " " + name + " " + age + " " + id + " " + "your salary is" + " " + salary );
				
		
        if (age>18) {
        	System.out.println("Adult");
        }
        else if(age<18 && age>11) {
        	System.out.println("Teen");
        }
        else {
        	System.out.println("Kid");
        }
        
        switch(age) {
        case 22: System.out.println("10");
        }
        
        int i;
        String word = "Java";
        for(i=0; i<=5; i++) {
        	System.out.println(word);
        }
        
        int j = 0;
        while(j<=5) {
        	System.out.println("Training");
        	 j = j+1;
        }
        
        int k;
        for (k=0; k<=10; k++) {
        	if (k%2==0) {
        		System.out.println(k);
        	}
        }
	}

}
