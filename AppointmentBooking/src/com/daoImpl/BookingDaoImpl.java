package com.daoImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.dao.DaoBooking;
import com.mapper.BookingMapper;
import com.pojo.Booking;


@Component
public class BookingDaoImpl implements DaoBooking {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public BookingDaoImpl() {
		
	}
	
	public BookingDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Booking> displayBookingDetails(String p_Id) {
		String sql = "select * from BOOKING  where PATIENT_ID=?";
		List<Booking> ls=jdbcTemplate.query(sql,new Object[]{p_Id}, new BookingMapper());
		System.out.println(ls);
		return ls;
		
		}
	

	@Override
	public void insertBookingDetails(Booking b) {
		
		String sql="INSERT INTO BOOKING (BOOKING_ID,PATIENT_ID,STATUS,DOCTOR_ID,APPOINTMENT_DATE) values(B_ID.nextval,?,?,?,?,?)";
		jdbcTemplate.update(sql,b.getP_Id(),b.getStatus(),b.getDoc_Id(),b.getDate());
	}

	@Override
	public void updateBooking(String booking_Id) {
		
		String sql="UPDATE BOOKING SET STATUS='CANCEL' WHERE BOOKING_ID=?";
		jdbcTemplate.update(sql,booking_Id);
	}

}
