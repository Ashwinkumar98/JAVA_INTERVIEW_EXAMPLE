package com.cts.observerPattern;

public interface Observeral {
	
	public void AddObserver(User user);
	public void RemoveObserver(User user);
	public void notifyObserver();
}
