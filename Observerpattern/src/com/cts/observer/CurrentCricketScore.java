package com.cts.observer;

public class CurrentCricketScore implements Observer{

	@Override
	public void update(int run, int wickets, float over) {
		System.out.println("Current Match Score " + "\n" + "Run :" + run +"\n" + "Wickets :" + wickets +"\n" +" Over :" + over +"\n");
	}

}
