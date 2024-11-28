package com.cg.kashif;

class Car {
	int no_of_wheels=4;
	String  car_type="plastic car";
	
	void carInReserve() {
		System.out.println("Car is in reserve...");
	}
	
	void startCar() {
		System.out.println("Car is starting...");
	}
	
	void startsEngine() {
		System.out.println("Engine is starting...");
	}
}
 
class BMW extends Car{
	void startCar() {
		System.out.println("BMW is starting");
	}
}
