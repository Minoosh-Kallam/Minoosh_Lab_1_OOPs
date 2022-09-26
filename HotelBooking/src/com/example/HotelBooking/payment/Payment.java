package com.example.HotelBooking.payment;

public interface Payment {

	boolean debitAmount(String accountId , double amount) ;
	boolean creditAmount(String accountId , double amount);
	
}
