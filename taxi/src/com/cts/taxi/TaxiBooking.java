package com.cts.taxi;


public class TaxiBooking {
	
	public void removeTaxi(Taxi taxi,TaxiDataBase database,char point ) {
		database.removeTaxifromLocation(point, taxi);
	}
	
	public void AllocateTaxi(TaxiDataBase database,int id, char source, char drop, int pickupTime,Taxi taxi) {
		
		int TotalKm;
		double earnings;
		taxi.setCurrentpoint(drop);
		TotalKm = (Math.abs(drop-source)*15)-5;
		earnings = taxi.getTotalEarnings()+100 + ((double)TotalKm * 10);
		taxi.setTotalEarnings(earnings);
		taxi.getTripdetails().add(new Trips(id, source, drop, pickupTime,Math.abs(drop-source)+pickupTime,100+((double)TotalKm * 10)));
		System.out.println(taxi.getName()+ " is allocated");
		database.addTaxitoLocation(Character.valueOf(drop), taxi);
	}
	
	public void BookTaxi(TaxiDataBase database,int id, char source, char drop, int pickupTime) {
		
		char x=(char) (source+1);
		char y=(char) (source-1);
		
		Taxi taxi;
		if(database.getTaxiAtLocation(Character.valueOf(source))!=null) {
			taxi=database.getTaxiAtLocation(Character.valueOf(source));
			removeTaxi(taxi, database, source);
			AllocateTaxi(database, id, source, drop, pickupTime,taxi);
		}else if(x>='A' && x<='E' && database.getTaxiAtLocation(Character.valueOf(x))!=null){
			taxi=database.getTaxiAtLocation(Character.valueOf(x));
			removeTaxi(taxi, database, x);
			AllocateTaxi(database, id, source, drop, pickupTime,taxi);
		}
		else if(y>='A' && y<='E' && database.getTaxiAtLocation(Character.valueOf(y))!=null){
			taxi=database.getTaxiAtLocation(Character.valueOf(y));
			removeTaxi(taxi, database, y);
			AllocateTaxi(database, id, source, drop, pickupTime,taxi);
		}else {
			System.out.println("No Taxi is free");
		}
	}
}
