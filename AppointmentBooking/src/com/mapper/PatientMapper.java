package com.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.pojo.PatientDetails;


public class PatientMapper implements RowMapper<PatientDetails> {
	
	@Override
	public PatientDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		PatientDetails pD=new PatientDetails();
		pD.setP_Id(rs.getString("p_Id"));
		pD.setName(rs.getString("name"));
		pD.setAge(rs.getString("age"));
		pD.setGender(rs.getString("gender"));
		pD.setContactNumber(rs.getString("phone_no"));
		pD.setAddress(rs.getString("address"));
		pD.setPassword(rs.getString("patient_password"));
		return pD;
	}


}
