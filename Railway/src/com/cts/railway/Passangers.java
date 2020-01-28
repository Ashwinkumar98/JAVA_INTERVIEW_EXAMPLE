package com.cts.railway;

public class Passangers {
	
	private int pnr;
	private String name;
	private int age;
	private String berth;
	private String status;
	private char src;
	private char dest;
	private int seatno;
	
	

	public Passangers(int pnr, String name, int age, String berth, String status, char src, char dest, int seatno) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.age = age;
		this.berth = berth;
		this.status = status;
		this.src = src;
		this.dest = dest;
		this.seatno = seatno;
	}

	public char getSrc() {
		return src;
	}

	public void setSrc(char src) {
		this.src = src;
	}

	public char getDest() {
		return dest;
	}

	public void setDest(char dest) {
		this.dest = dest;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBerth() {
		return berth;
	}

	public void setBerth(String berth) {
		this.berth = berth;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}
	
}
