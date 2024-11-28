package com.exercise;

public class UseAnimals {

	public static void main(String[] args) {
		Animal[] d = new Animal[2];
		d[0] = new Dog();
		
		d[1] = new Cat();
	
		
		for(Animal A1: d) {
			A1.makeSound();
		}
	
		// TODO Auto-generated method stub

	}

}
