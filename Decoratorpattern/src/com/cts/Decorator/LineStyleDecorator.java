package com.cts.Decorator;

public class LineStyleDecorator extends ShapeDecotator{
	
	private String Style;
	
	public LineStyleDecorator(Shape shape,String Style) {
		super(shape);
		this.Style=Style;
	}
	
	@Override
	public void draw() {
		
		super.draw();
		System.out.println("Line Style "+this.Style);
	}
	
	@Override
	public String description() {
		return super.description() + " Line Style "+this.Style;
	}
}
