package com.zoho.railway;

public class Passangers {
	
	private int PNR;
	private String name;
	private String berth;
	private int age;
	

	public Passangers(int pNR, String name, String berth, int age) {
		PNR = pNR;
		this.name = name;
		this.berth = berth;
		this.age = age;
	}
	
	public int getPNR() {
		return PNR;
	}
	public void setPNR(int pNR) {
		PNR = pNR;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBerth() {
		return berth;
	}
	public void setBerth(String berth) {
		this.berth = berth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Passangers [PNR=" + PNR + ", name=" + name + ", berth=" + berth + ", age=" + age + "]";
	}
	
	
}
