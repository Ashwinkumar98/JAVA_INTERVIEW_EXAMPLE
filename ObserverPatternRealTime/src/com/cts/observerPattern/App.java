package com.cts.observerPattern;

public class App {

	public static void main(String[] args) {
		
		Observeral dress = new DressMaterial();
		
		User user1 = new User(dress,"Ashwin");
		User user2 = new User(dress,"Nisha");
		User user3 = new User(dress,"Kumar");
		
		dress.AddObserver(user1);
		dress.AddObserver(user2);
		dress.AddObserver(user3);
		
		dress.notifyObserver();
	}

}
