package com.zoho.railway;

import java.util.List;

public interface passangerDAO {
	
	public void addPassangers(Passangers passanger);
	public void removePassanger(Passangers passanger);
	public List<Passangers> getAllPAssangers();
	
}
