package com.cts.observer;

public class AverageCricketScore implements Observer {
	
	@Override
	public void update(int run, int wickets, float over) {
		System.out.println("Average Match Score " + "\n" + "Run rate :" + (float)run/over +"\n" );
	}

}
