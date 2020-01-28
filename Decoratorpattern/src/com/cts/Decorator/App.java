package com.cts.Decorator;

public class App {

	public static void main(String[] args) {
		
		ShapeDecotator circle = new FilledColorDecorator(new LineColorDecorator(new LineStyleDecorator(new Circle(), "DASHED"), "RED"), "BLUE");
		circle.draw();
		System.out.println(circle.description());
	}

}
