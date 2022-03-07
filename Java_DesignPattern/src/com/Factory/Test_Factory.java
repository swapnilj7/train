package com.Factory;

public class Test_Factory {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		shapeFactory.getShape("circle").draw();
		shapeFactory.getShape("square").draw();
		
		
	}
}
