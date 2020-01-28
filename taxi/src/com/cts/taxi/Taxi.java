package com.cts.taxi;

import java.util.List;

public class Taxi {
	
	private int id;
	private String name;
	private List<Trips> tripdetails;
	private char Currentpoint;
	private double totalEarnings;

	public Taxi(int id, String name, List<Trips> tripdetails, char currentpoint, double totalEarnings) {
		
		this.id = id;
		this.name = name;
		this.tripdetails = tripdetails;
		Currentpoint = currentpoint;
		this.totalEarnings = totalEarnings;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Trips> getTripdetails() {
		return tripdetails;
	}
	public void setTripdetails(List<Trips> tripdetails) {
		this.tripdetails = tripdetails;
	}
	public double getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}
	public char getCurrentpoint() {
		return Currentpoint;
	}
	public void setCurrentpoint(char currentpoint) {
		Currentpoint = currentpoint;
	}


	@Override
	public String toString() {
		return "Taxi [id=" + id + ", name=" + name + ", tripdetails=" + tripdetails + ", Currentpoint=" + Currentpoint
				+ ", totalEarnings=" + totalEarnings + " ]";
	}
	
}
