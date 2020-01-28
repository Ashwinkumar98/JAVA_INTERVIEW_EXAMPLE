package com.cts.toll;

import java.util.List;
import java.util.stream.Collectors;

public class Tollfactory {
	
	public void CalculateFare(DataBase database,char src,char dest,Vehicle vehicle) {
		List<Toll> tolls=database.getRoute().getTolls();
		List<Toll> toll =tolls.stream().filter(t->t.getLocation()>=src && t.getLocation()<=dest)
					  .filter(t->t.getPaymentSchemes()
							      .stream()
							      .anyMatch(s->s.getType().equals(vehicle.getType()))).collect(Collectors.toList());
		
		for(Toll i : tolls) {
				for(Schemes j :i.getPaymentSchemes()) {
						PaymentDetails pay = new PaymentDetails(i, vehicle, j.getPrice());
						i.setTotalAmount(i.getTotalAmount()+j.getPrice());
						vehicle.setAmountPaid(vehicle.getAmountPaid()+j.getPrice());
						database.addPaymentinToll(pay);
				}
		 }
	}
}
