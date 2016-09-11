package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.pojo.Booking;

public class BookingMapper implements RowMapper<Booking> {

	@Override
	public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		Booking book = new Booking();
		book.setBooking_Id(rs.getString("booking_id"));
		book.setP_Id(rs.getString("patient_id"));
		book.setStatus(rs.getString("status"));
		book.setDoc_Id(rs.getString("doctor_id"));
		book.setDate(rs.getString("appointment_date"));
		return book;
	}

}
