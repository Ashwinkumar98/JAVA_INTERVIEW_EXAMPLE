package com.cts.observer;

public class CricketScore {
	
	private CurrentCricketScore currentscore;
	private AverageCricketScore averagescore;
	private float over = 34;
	private int run = 125;
	private int wickets =3;
	
	public CricketScore(CurrentCricketScore currentscore, AverageCricketScore averagescore) {
		
		this.currentscore = currentscore;
		this.averagescore = averagescore;
	}

	public float getOver() {
		return over;
	}

	public int getRun() {
		return run;
	}

	public int getWickets() {
		return wickets;
	}
	
	public void getscores() {
		this.currentscore.update(run, wickets, over);
		this.averagescore.update(run, wickets, over);
	}
}
