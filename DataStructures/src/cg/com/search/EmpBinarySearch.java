package cg.com.search;


public class EmpBinarySearch {
	
	private int id;
	String name;
	double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public EmpBinarySearch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override //annotations
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public EmpBinarySearch(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	 int binarySearch(EmpBinarySearch array[], int x, int low, int high) {
		
		while (low <= high) {
		      int mid = low + (high - low) / 2;
		 
		      if (x == array[mid].id)
		    	  return mid;
		 
		      if (x > array[mid].id)
		        low = mid + 1;
		 
		      else
		        high = mid - 1;
		    }
		 
		    return -1;
		  }
	
	public static void main(String[] args) {
	    EmpBinarySearch[] emp = new  EmpBinarySearch[3];
	    EmpBinarySearch em = new EmpBinarySearch();

	    emp[0] = new EmpBinarySearch(1, "ss", 100);
	    emp[1] = new EmpBinarySearch(2, "cc", 300);
	    
	    int n = emp.length;
	    int x = 2;
	    int result = em.binarySearch(emp, x, 0, n - 1);
	  
	    if (result == -1)
	      System.out.println("Not found");
	    else
	    	 System.out.println("Element found at index " + result);
	}
		
		// TODO Auto-generated method stub

	}


