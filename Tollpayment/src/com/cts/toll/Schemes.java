package com.cts.toll;

public class Schemes {
	private String Type;
	private double price;
	
	public Schemes(String type, double price) {
		Type = type;
		this.price = price;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Schemes [Type=" + Type + ", price=" + price + "]";
	}
	
}
