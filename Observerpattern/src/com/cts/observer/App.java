package com.cts.observer;

public class App {

	public static void main(String[] args) {
		
		CricketScore score = new CricketScore(new CurrentCricketScore(), new AverageCricketScore());
		score.getscores();
	}

}
