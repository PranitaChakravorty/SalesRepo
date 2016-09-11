package com.dao;

import java.util.List;

import com.pojo.Booking;


public interface DaoBooking {
	
	public List<Booking> displayBookingDetails(String p_Id);
	public void insertBookingDetails(Booking b);
	public void updateBooking(String booking_ID);



}
