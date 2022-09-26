package com.example.HotelBooking;

import java.util.List;

public class HotelRoom {

	//private String hotelId ;
	private String roomNo ;
	private String roomType ;
	private List<Features> features ;
	
	public int getFloor() {
		return roomNo.charAt(0) - '0' ;
	}
	
	public double getRoomPrice() {
		double roomPrice = 0 ;
		
		for(Features feature : features) {
			switch(feature) {
				case AC :
					roomPrice += RoomPrice.AC ;
					break ;
				case SingleOccupancy :
					roomPrice += RoomPrice.SingleOccupancy ;
					break ;

				case DoubleOccupancy :
					roomPrice += RoomPrice.DoubleOccupancy ;
					break ;

				case TripleOccupancy :
					roomPrice += RoomPrice.TripleOccupancy ;
					break ;

				case TV :
					roomPrice += RoomPrice.TV ;
					break ;
					
				default :
					break ;
					
			}
		}
		return roomPrice ; 
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public List<Features> getFeatures() {
		return features;
	}

	public void setFeatures(List<Features> features) {
		this.features = features;
	}

	public HotelRoom(String roomNo, List<Features> features) {
		super();
		this.roomNo = roomNo;
		this.features = features;
	}

	public HotelRoom() {
		super();
	}
	
	
}
