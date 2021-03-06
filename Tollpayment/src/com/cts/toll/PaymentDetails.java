package com.cts.toll;

public class PaymentDetails {
	
	private Toll toll;
	private Vehicle vehicle;
	private double amount_paid;
	public PaymentDetails(Toll toll, Vehicle vehicle, double amount_paid) {
		super();
		this.toll = toll;
		this.vehicle = vehicle;
		this.amount_paid = amount_paid;
	}
	public Toll getToll() {
		return toll;
	}
	public void setToll(Toll toll) {
		this.toll = toll;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public double getAmount_paid() {
		return amount_paid;
	}
	public void setAmount_paid(double amount_paid) {
		this.amount_paid = amount_paid;
	}
	@Override
	public String toString() {
		return "PaymentDetails [toll=" + toll + ", vehicle=" + vehicle + ", amount_paid=" + amount_paid + "]";
	}
	
}
