package com.zoho.railway;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DataBase implements passangerDAO{
	
	private List<Passangers> pass;
	
	public DataBase() {
		pass = new CopyOnWriteArrayList<Passangers>();
	}
	
	@Override
	public void addPassangers(Passangers passanger) {
		pass.add(passanger);
	}

	@Override
	public void removePassanger(Passangers passanger) {
		pass.remove(passanger);
	}

	@Override
	public List<Passangers> getAllPAssangers() {
		return pass;
	}
	
}
