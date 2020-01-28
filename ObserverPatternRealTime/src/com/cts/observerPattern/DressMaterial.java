package com.cts.observerPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class DressMaterial implements Observeral{
	
	private boolean Stock = false;
	private List<User> observers ;
	
	public DressMaterial() {
		observers = new CopyOnWriteArrayList<>();
	}
	
	public boolean isStock() {
		return Stock;
	}



	@Override
	public void AddObserver(User user) {
		observers.add(user);
		
	}



	@Override
	public void RemoveObserver(User user) {
		observers.remove(user);
		
	}


	@Override
	public void notifyObserver() {
		
		for(User i : observers) {
			i.update();
		}
		
	}
	
}
