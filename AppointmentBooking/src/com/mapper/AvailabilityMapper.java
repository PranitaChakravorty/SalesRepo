package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.pojo.Availability;

public class AvailabilityMapper implements RowMapper<Availability>{

	@Override
	public Availability mapRow(ResultSet rs, int rowNum) throws SQLException {
		Availability av = new Availability();
		av.setDoc_Id(rs.getString("DOCTOR_ID"));
		av.setDate(rs.getString("AVAIL_DATE"));
		av.setNoOfPatients(rs.getString("NO_OF_PATIENTS"));
		return av;
	}

}
