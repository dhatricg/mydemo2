package com.lib;

   class Journal extends LibraryItem{
	int volume;
	double impactFactor;


	public Journal(int id, String title, String author, int volume, double impactFactor) {
		super(id, title, author);
		this.volume = volume;
		this.impactFactor = impactFactor;
		// TODO Auto-generated constructor stub
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(volume + impactFactor);
	}

}
