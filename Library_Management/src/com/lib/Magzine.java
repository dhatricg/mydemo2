package com.lib;

 class Magzine extends LibraryItem {
	 int issuenumber;
	 
	 
	public Magzine(int id, String title, String author, int issuenumber) {
		super(id, title, author);
		this.issuenumber = issuenumber;
		// TODO Auto-generated constructor stub
	}


	public void displayInfo() {
		super.displayInfo();
		System.out.println(issuenumber);
	}
	

}
