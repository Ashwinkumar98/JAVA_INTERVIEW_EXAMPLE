package com.cts.toll;


public class Vehicle {
	
	private String name;
	private String type;
	private double amountPaid;
	private String user_type;
	

	public Vehicle(String name, String type, double amountPaid, String user_type) {
		super();
		this.name = name;
		this.type = type;
		this.amountPaid = amountPaid;
		this.user_type = user_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", type=" + type + ", amountPaid=" + amountPaid + ", user_type=" + user_type
				+ "]";
	}

}
