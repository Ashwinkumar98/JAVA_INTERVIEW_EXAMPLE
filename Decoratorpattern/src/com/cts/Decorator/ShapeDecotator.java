package com.cts.Decorator;

public abstract class ShapeDecotator implements Shape{
	
	private Shape shape;
	
	public ShapeDecotator(Shape shape) {
		this.shape=shape;
	}
	
	@Override
	public void draw() {
		shape.draw();
		
	}
	
	@Override
	public String description() {
	
		return shape.description();
	}

}
