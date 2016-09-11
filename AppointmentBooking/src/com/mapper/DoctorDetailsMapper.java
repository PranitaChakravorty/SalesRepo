package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.pojo.DoctorDetails;

public class DoctorDetailsMapper implements RowMapper<DoctorDetails> {

	@Override
	public DoctorDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
	    DoctorDetails doc = new DoctorDetails();
	    doc.setDocId(rs.getString("doctor_id"));
	    doc.setDocName(rs.getString("doctor_name"));
	    doc.setSpecialization(rs.getString("specialization"));
	    doc.setContactNumber(rs.getString("contact_Number"));
	    doc.setEmailId(rs.getString("email_Id"));
	    doc.setCabin_Number(rs.getString("cabin_Number"));
	    doc.setAvailableTimeSlots(rs.getString("available_Time_Slots"));
		return doc;
	}

}
