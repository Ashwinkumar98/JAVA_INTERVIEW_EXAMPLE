package com.cts.railway;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		DataBase db = new DataBase();
		int pnr=12345;
		TicketBooking booking = new TicketBooking();
		String name,berth;
		int age,ch,no;
		char src,dest;
		int chart[][];
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.ADD TRAIN 2.BOOK TICKET 3.OCCUPANCY CHART 4.CANCLE TICKET 5.PRINT TICKET");
			ch=in.nextInt();
			switch(ch) {
			case 1: System.out.print("Train Name :");
					name=in.next();
					System.out.print("Train No : ");
					no=in.nextInt();
					System.out.print("Source Point : ");
					src=in.next().charAt(0);
					System.out.print("Destination Point : ");
					dest=in.next().charAt(0);
					db.AddTrain(new Train(no, name, src, dest, new ArrayList<>()));
					break;
			case 2: System.out.print("Passanger Name : ");
					name=in.next();
					System.out.print("Passanger Age : ");
					age=in.nextInt();
					System.out.print("Passanger Berth : ");
					berth=in.next();
					System.out.print("Source : ");
					src=in.next().charAt(0);
					System.out.print("Destination : ");
					dest=in.next().charAt(0);
					booking.BookTicket(pnr, name, age, berth, src, dest, db);
					pnr++;
					break;
			case 3: chart = db.getChart();
					for(int i=0;i<3;i++) {
						for(int j=0;j<4;j++) {
							System.out.print(chart[i][j]+"\t");
						}
						System.out.println();
					}
					break;
			case 4: System.out.println("Enter your pnr no");
					no=in.nextInt();
					booking.CancleTicket(db.getPassanger(no), db);
					break;
			case 5:System.out.println("Enter your pnr no");
					no=in.nextInt();
					System.out.println(db.getPassanger(no));
			}
		}
	}
}
