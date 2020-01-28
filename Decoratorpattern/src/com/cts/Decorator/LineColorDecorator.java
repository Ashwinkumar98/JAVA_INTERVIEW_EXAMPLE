package com.cts.Decorator;

public class LineColorDecorator extends ShapeDecotator {

	private String Color;
	
	public LineColorDecorator(Shape shape, String Color) {
		super(shape);
		this.Color=Color;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("Line Color  :"+ this.Color);
	}
	
	@Override
	public String description() {
		
		return super.description()+ " Draw with Line Color " + this.Color ;
	}
}
