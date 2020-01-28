package com.cts.taxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	
	private static Scanner in;

	public static void main(String[] args) {
		
		int ch,id,time;
		char pickup,drop;
		String name;
		TaxiDataBase database = new TaxiDataBase();
		TaxiBooking booking = new TaxiBooking();
		List<Taxi> taxis = new ArrayList<>();
		taxis.add(new Taxi(1, "one", new ArrayList<>(), 'A', 10.0));
		taxis.add(new Taxi(2, "two", new ArrayList<>(), 'B', 11.0));
		taxis.add(new Taxi(3, "three", new ArrayList<>(), 'C', 9.0));
		taxis.add(new Taxi(4, "four", new ArrayList<>(), 'D', 19.0));
		in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Add Taxi 2.Book Taxi 3.Display Details");
			ch=in.nextInt();
			switch(ch) {
				case 1 :  System.out.println("Enter Taxi ID");
						  id=in.nextInt();
						  System.out.println("Enter Taxi Name");
						  name=in.next();
						  Taxi taxi = new Taxi(id, name, new ArrayList<>(), 'A', 0.0);
						  database.addTaxitoLocation('A', taxi);
						  break;
				case 2 :  System.out.println("Enter Customer ID");
						  id=in.nextInt();
						  System.out.println("Enter Pickup point");
						  pickup=in.next().charAt(0);
						  System.out.println("Enter Drop point");
						  drop=in.next().charAt(0);
						  System.out.println("Enter Pickup Time");
						  time=in.nextInt();
						  booking.BookTaxi(database, id, pickup, drop, time);
						  break;
				case 3 : List<Taxi> data = database.getAllDetails();
					     
						 for(Taxi i : data) {
							 System.out.println("Taxi name "+i.getName()+" "+"Total Earnings "+i.getTotalEarnings());
							 System.out.println("Taxi ID  CustomerID  From  To  PickupTime  DropTime  Amount");
							 for(Trips j : i.getTripdetails()) {
								 System.out.println(i.getId()+" "+j.getCustomerid()+" "+j.getSource()+" "+j.getDestination()+" "+j.getPickupTime()+" "
										 +j.getDropTime()+" "+j.getFare());
							 }
						 }
					     break;
				case 4:database.findMin(taxis);
				       break;
			}
		}
	}
}
