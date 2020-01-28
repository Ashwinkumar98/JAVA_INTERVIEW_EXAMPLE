package com.cts.Decorator;

public class FilledColorDecorator extends ShapeDecotator{
	
	private String color;
	
	public FilledColorDecorator(Shape Shape,String color) {
		super(Shape);
		this.color=color;
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("Circle Color  :"+ this.color);
	}

	@Override
	public String description() {
		
		return super.description()+" Colored with "+this.color;
	}

}
