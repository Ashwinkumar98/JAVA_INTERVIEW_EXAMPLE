package com.cts.toll;

import java.util.List;

public interface TollPaymentDAO {
	
	public void getAllVehicle(String name);
	public void getAllTolls(String name);
	public void addTolls(Toll toll);
	public void addPaymentinToll(PaymentDetails details);
	public List<PaymentDetails> getpayment();
	public void AddRoute(MapRoute route);
	public MapRoute getRoute();
}
