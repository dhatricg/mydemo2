package com.cg.creation.factory;

public class UseFactory {

	public static void main(String[] args) {
		ShapeFactory shapefactory = new ShapeFactory();
		Shape shape1 = shapefactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapefactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapefactory.getShape("SQUARE");
		shape3.draw();
		

	}

}
