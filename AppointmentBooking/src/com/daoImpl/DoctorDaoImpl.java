package com.daoImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.dao.DaoDoctor;
import com.mapper.DoctorDetailsMapper;
import com.pojo.DoctorDetails;


@Component
public class DoctorDaoImpl implements DaoDoctor {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public DoctorDaoImpl() {
		
	}
	
	public DoctorDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	
	//To display list of doctors under a specialization
	@Override
	public List<DoctorDetails> searchDoctorDetails(String specialization) {
		
			
			String sql = "select * from DOCTOR_DETAILS where SPECIALIZATION=?";
			List<DoctorDetails> list=jdbcTemplate.query(sql,new Object[]{specialization}, new DoctorDetailsMapper());
			return list;
	}

}
