package com.learning.design.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		
		Shape shape= factory.getShape("CIRCLE");
		shape.drow();
		
		Shape shape2 = factory.getShape("RECTANGLE");
		shape2.drow();
		
	}
}
