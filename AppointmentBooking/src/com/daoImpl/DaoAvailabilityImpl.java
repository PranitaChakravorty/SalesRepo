package com.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.dao.DaoAvailability;
import com.mapper.AvailabilityMapper;

@Component
public class DaoAvailabilityImpl implements DaoAvailability {
    
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public  DaoAvailabilityImpl() {
		
	}
	
	public  DaoAvailabilityImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//To update the number of patients after every booking 
	@Override
	public void updateAvailability(String doc_Id,String date) {
		
		String sql = "UPDATE AVAILABILITY SET NO_OF_PATIENTS=NO_OF_PATIENTS+1 WHERE DOCTOR_ID=? and AVAIL_DATE =? and NO_OF_PATIENTS<=5";
		jdbcTemplate.update(sql,doc_Id,date);
		
	}
	//To check the number of slots available under a doctor
	@Override
	public void CheckNoOfSlots(String doc_Id,String date) {
		
		String sql = "SELECT NO_OF_PATIENTS FROM AVAILABILITY WHERE DOCTOR_ID=? and AVAIL_DATE =?";
		jdbcTemplate.queryForObject(sql,new Object[]{doc_Id,date}, new AvailabilityMapper());
	
	}
}

