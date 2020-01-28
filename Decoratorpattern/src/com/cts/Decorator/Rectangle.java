package com.cts.Decorator;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

	@Override
	public String description() {
		return "Rectangle Object";
	}

}
