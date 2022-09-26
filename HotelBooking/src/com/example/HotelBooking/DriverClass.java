package com.example.HotelBooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DriverClass {

	public static void main(String args[]) {

		Hotel hotel = new Hotel("My Hotel", "1", new ArrayList<>(), new ArrayList<>());

		HotelInventory inventory = new HotelInventory(hotel);
		Scanner sc = new Scanner(System.in);

		/** Input Scanning Start **/

		int ch = 0;
		while (ch != -1) {
			System.out.println("Enter 1 to create Room");
			System.out.println("Enter 2 to Book Room");
			System.out.println("Enter -1 to break");

			ch = sc.nextInt();

			switch (ch) {
			case 1:

				sc.nextLine();
				System.out.println("Enter Room No.");
				String roomNo = sc.nextLine();
				List<Features> features = new ArrayList<>();

				System.out.println(
						"Enter 1 - for Single Occupancy , 2 - for double Occupancy , 3 - for triple Occupancy");
				int occupancy = sc.nextInt();
				features.add((occupancy == 1) ? Features.SingleOccupancy
						: (occupancy == 2) ? Features.DoubleOccupancy : Features.TripleOccupancy);

				System.out.println("Enter 1 - AC , 2 - Non-AC");
				int ac = sc.nextInt();

				features.add(ac == 1 ? Features.AC : Features.NON_AC);

				System.out.println("Enter 1 - TV , 2 - Non TV");
				int tv = sc.nextInt();

				if (tv == 1)
					features.add(Features.TV);

				System.out.println("**Room created "+roomNo +"-"+features+"**");
				HotelRoom room = new HotelRoom(roomNo, features);

				inventory.getHotel().getUnOccupiedRooms().add(room);

				break;

			case 2:
				features = new ArrayList<>() ;
				System.out.println("Enter the features of the room you want");
				System.out.println("Enter 1 - for Single Occupancy , 2 - for double Occupancy , 3 - for triple Occupancy");	
				occupancy = sc.nextInt() ;
				features.add((occupancy == 1) ? Features.SingleOccupancy
						: (occupancy == 2) ? Features.DoubleOccupancy : Features.TripleOccupancy);
				
				System.out.println("Enter 1 - AC , 2 - Non-AC , 3 - Ignore");
				ac = sc.nextInt();

				if(ac == 1 || ac == 2)
					features.add(ac == 1 ? Features.AC : Features.NON_AC);
				
				System.out.println("Enter 1 - TV , 2 - Non TV , 3 - Ignore");
				tv = sc.nextInt();
				
				if (tv == 1)
					features.add(Features.TV);
				
				System.out.println("Enter your preferred floor of room , -1 to ignore");
				
				int floor = sc.nextInt() ;
				
				HotelRoom availableRoom ;
				
				if(floor == -1)
					availableRoom = inventory.checkAvailability(features) ;
				else
					availableRoom = inventory.checkAvailability(features , floor) ;
				if(availableRoom == null)
					System.out.println(features +" is not available");
				else
					System.out.println(availableRoom.getRoomNo() +","+availableRoom.getFloor() +","+availableRoom.getFeatures()+availableRoom.getRoomPrice());
				
				break ;

				
			default:
				break;
			}

		}
		
		sc.close();

		return;
	}
}
