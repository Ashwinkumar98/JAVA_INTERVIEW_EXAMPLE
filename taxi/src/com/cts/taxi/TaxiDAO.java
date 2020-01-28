package com.cts.taxi;

import java.util.List;

public interface TaxiDAO {
	
	public List<Taxi> getAllDetails();
	public void addTaxitoLocation(Character point,Taxi taxi);
	public void removeTaxifromLocation(Character point,Taxi taxi);
	public Taxi getTaxiAtLocation(Character point);
}
