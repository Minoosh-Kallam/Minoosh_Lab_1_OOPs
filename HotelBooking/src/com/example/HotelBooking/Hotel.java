package com.example.HotelBooking;

import java.util.List;

public class Hotel {

	private String hotelName ;
	private String hotelId ;
	
	private List<HotelRoom> occupiedRooms ;
	private List<HotelRoom> unOccupiedRooms ;
	
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public List<HotelRoom> getOccupiedRooms() {
		return occupiedRooms;
	}
	public void setOccupiedRooms(List<HotelRoom> occupiedRooms) {
		this.occupiedRooms = occupiedRooms;
	}
	public List<HotelRoom> getUnOccupiedRooms() {
		return unOccupiedRooms;
	}
	public void setUnOccupiedRooms(List<HotelRoom> unOccupiedRooms) {
		this.unOccupiedRooms = unOccupiedRooms;
	}
	public Hotel(String hotelName, String hotelId, List<HotelRoom> occupiedRooms, List<HotelRoom> unOccupiedRooms) {
		super();
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.occupiedRooms = occupiedRooms;
		this.unOccupiedRooms = unOccupiedRooms;
	}
	public Hotel() {
		super();
	}
	
	
	
}
