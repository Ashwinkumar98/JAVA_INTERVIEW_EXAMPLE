package com.zoho.railway;

public class SeatFactory {
	
	private int LB=1;
	private int UB=1;
	private int MB=4;
	private int SU=2;
	private int SL=2;
	private static SeatFactory seats;
	
	private SeatFactory() {
		
	}
	
	public static SeatFactory getInstance() {
		if(seats==null) {
			seats = new SeatFactory();
			return seats;
		}
		return seats;
	}
	
	public String checkAvailability(String seat) {
		
		if(checkSeat(seat)!=0) 
		{
			allocateSeat(seat);
			return seat;
		}
			
		return "No "+ seat+" available " + " Please add some other berth " ;
	}
	
	public void allocateSeat(String seat) {
		
		int x;
		
		if(seat.equals("LB")) {
			x=this.LB;
			x--;
			this.LB=x;
		}
		else if(seat.equals("UB")) {
			x=this.UB;
			x--;
			this.UB=x;
		}
		else if(seat.equals("MB")) {
			x=this.MB;
			x--;
			this.MB=x;
		}
		else if(seat.equals("SU")) {
			x=this.SU;
			x--;
			this.SU=x;
		}
		else  {
			x=this.SL;
			x--;
			this.SL=x;
		}
	}
	
	public int checkSeat(String seat) {
		
		if(seat.equals("LB")) {
			return LB;
		}
		else if(seat.equals("UB")) {
			return UB;
		}
		else if(seat.equals("MB")) {
			return MB;
		}
		else if(seat.equals("SU")) {
			return SU;
		}
		else  {
			return SL;
		}
		
	}
}
