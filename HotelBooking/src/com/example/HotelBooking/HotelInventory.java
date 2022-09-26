package com.example.HotelBooking;

import java.util.List;

public class HotelInventory {

	private Hotel hotel;

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public HotelInventory() {
		super();
	}

	public HotelInventory(Hotel hotel) {
		super();
		this.hotel = hotel;
	}

	public HotelRoom checkAvailability(List<Features> requiredFeatures) {

		for (HotelRoom room : hotel.getUnOccupiedRooms()) {
			if (room.getFeatures().containsAll(requiredFeatures)) {
				hotel.getUnOccupiedRooms().remove(room);
				hotel.getOccupiedRooms().add(room);
				return room;
			}
		}

		return null;
	}

	public HotelRoom checkAvailability(List<Features> requiredFeatures, int floor) {

		for (HotelRoom room : hotel.getUnOccupiedRooms()) {
			if (room.getFeatures().containsAll(requiredFeatures) && room.getRoomNo().charAt(0) - '0' == floor) {
				hotel.getUnOccupiedRooms().remove(room);
				hotel.getOccupiedRooms().add(room);
				return room;
			}
		}

		return null;
	}

}
