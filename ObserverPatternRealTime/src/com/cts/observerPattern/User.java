package com.cts.observerPattern;

public class User implements Observer{
	
	private Observeral observal;
	private String name;

	
	public User(Observeral observal, String name) {
		
		this.observal = observal;
		this.name = name;
	}

	@Override
	public void update() {
		getUnsubscribe();;
		getDressmaterial();
	}
	
	public void getDressmaterial() {
		System.out.println(this.name+ " " + "you will get the Dress material");
	}
	
	public void getUnsubscribe() {
		observal.RemoveObserver(this);
	}
	
}
