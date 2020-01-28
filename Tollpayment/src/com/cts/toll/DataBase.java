package com.cts.toll;

import java.util.ArrayList;
import java.util.List;

public class DataBase implements TollPaymentDAO{
	
	private MapRoute route;
	private List<PaymentDetails> pay;
	
	public DataBase() {
		
		
		pay=new ArrayList<>();
	}

	@Override
	public void getAllVehicle(String name) {
		for(PaymentDetails i : pay) {
			System.out.println("Vehicle Name   :"+name);
			if(i.getVehicle().getName().equals(name)) {
				System.out.println("Toll Name     :"+i.getToll().getTollname());
				System.out.println("Toll Location :"+i.getToll().getLocation());
				System.out.println("Amount paid   :"+i.getAmount_paid());
				System.out.println(i.getVehicle().getAmountPaid()+"is total Amount Paid by "+i.getVehicle().getName());
			}
		}
	}

	@Override
	public void getAllTolls(String name) {
		for(PaymentDetails i : pay) {
			System.out.println("Toll Name   :"+name);
			if(i.getToll().getTollname().equals(name)) {
				System.out.println("Vehicle No     :"+i.getVehicle().getName());
				System.out.println("Vehicle Type :"+i.getVehicle().getType());
				System.out.println("User Type :"+i.getVehicle().getUser_type());
				System.out.println(i.getToll().getTotalAmount()+"is total Amount collected in "+i.getToll().getTollname());
			}
		}
	}

	@Override
	public void addTolls(Toll toll) {
		route.getTolls().add(toll);
	}
	
	@Override
	public void AddRoute(MapRoute route) {
		this.route=route;
		
	}

	@Override
	public MapRoute getRoute() {
		return route;
	}
	
	@Override
	public void addPaymentinToll(PaymentDetails details) {
		pay.add(details);
	}

	@Override
	public List<PaymentDetails> getpayment() {
		return pay;
	}

}
