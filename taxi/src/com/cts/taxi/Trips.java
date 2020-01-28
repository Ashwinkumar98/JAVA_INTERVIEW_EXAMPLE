package com.cts.taxi;

public class Trips {
	
	private int customerid;
	private char source;
	private char destination;
	private int pickupTime;
	private int dropTime;
	private double fare;
	
	public Trips(int customerid, char source, char destination, int pickupTime, int dropTime, double fare) {
		
		this.customerid = customerid;
		this.source = source;
		this.destination = destination;
		this.pickupTime = pickupTime;
		this.dropTime = dropTime;
		this.fare = fare;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public char getSource() {
		return source;
	}

	public void setSource(char source) {
		this.source = source;
	}

	public char getDestination() {
		return destination;
	}

	public void setDestination(char destination) {
		this.destination = destination;
	}

	public int getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
	}

	public int getDropTime() {
		return dropTime;
	}

	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}
	
	
	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Trips [customerid=" + customerid + ", source=" + source + ", destination=" + destination
				+ ", pickupTime=" + pickupTime + ", dropTime=" + dropTime + "]";
	}
	
}
