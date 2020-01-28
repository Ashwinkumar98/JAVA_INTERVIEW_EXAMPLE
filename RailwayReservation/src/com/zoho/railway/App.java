package com.zoho.railway;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		DataBase db = new DataBase();
		String name,prefer,val;
		int age,x;
		do {
			
			System.out.println("1.Booking 2.Display");
			Scanner in = new Scanner(System.in);
			x=in.nextInt();
			
			switch(x) {
			case 1 : System.out.print("Enter your Name:\t");
					 name=in.next();
					 System.out.print("Enter your age:\t");
					 age=in.nextInt();
					 System.out.print("Enter your Berth Preference:\t");
					 prefer=in.next();
					 val = SeatFactory.getInstance().checkAvailability(prefer);
					 if(val.equals(prefer)) {
						 db.addPassangers(new Passangers(1, name, prefer, age));
			 }
					
					 break;
			case 2: System.out.println(db.getAllPAssangers().toString());
					break;
			}
			
		}while(true);
		
	}

}
