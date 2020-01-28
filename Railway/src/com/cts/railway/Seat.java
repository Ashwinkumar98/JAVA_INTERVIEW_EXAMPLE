package com.cts.railway;

import java.util.List;

public class Seat {
	
	private int SeatNo;
	private List<Passangers> pass;
	
	public Seat(int seatNo, List<Passangers> pass) {
		super();
		SeatNo = seatNo;
		this.pass = pass;
	}

	public int getSeatNo() {
		return SeatNo;
	}

	public void setSeatNo(int seatNo) {
		SeatNo = seatNo;
	}

	public List<Passangers> getPass() {
		return pass;
	}

	public void setPass(List<Passangers> pass) {
		this.pass = pass;
	}
	
}
