package com.example.HotelBooking.payment;

public class Card implements Payment{

	String cardId ;
	
	double balance ;

	@Override
	public boolean debitAmount(String accountId, double amount) {
		
		return false;
	}

	@Override
	public boolean creditAmount(String accountId, double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	 
}
