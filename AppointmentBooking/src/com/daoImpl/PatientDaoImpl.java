package com.daoImpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.dao.DaoPatient;
import com.mapper.AvailabilityMapper;
import com.mapper.PatientMapper;
import com.pojo.Availability;
import com.pojo.PatientDetails;


@Component
public class PatientDaoImpl implements DaoPatient {
        
	@Autowired
	private JdbcTemplate jdbcTemplate;
		
	public PatientDaoImpl() {
		
	}
	
	public PatientDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	//Displaying the list of patients under a doctor	
	@Override
	public List<Availability> displayPatientDetails(String doc_Id) {
					
			String sql="select * from AVAILABILITY  where DOCTOR_ID=?";
			List<Availability> list=jdbcTemplate.query(sql,new Object[]{doc_Id}, new AvailabilityMapper());
			return list;
			
	}
	//Inserting the details of new user
	@Override
	public void insertPatientDetails(PatientDetails pD) {
					
			String sql="INSERT INTO PATIENT (P_ID,NAME,AGE,GENDER,ADDRESS,PHONE_NO,PATIENT_PASSWORD)values(?,?,?,?,?,?,?)";
			jdbcTemplate.update(sql,pD.getP_Id(),pD.getName(),pD.getGender(),pD.getAge(),pD.getContactNumber(),pD.getAddress(),pD.getPassword());
					
	}

	@Override
	public PatientDetails search(String p_Id) {
				
			String sql = "SELECT * FROM PATIENT WHERE P_ID=?";
			PatientDetails pD=(PatientDetails)jdbcTemplate.query(sql,new Object[]{p_Id}, new PatientMapper());
			return pD;
	}
	//Validating the credentials input by the user  
	@Override
	public List<PatientDetails> login(String p_Id,String pwd) {
			
			String sql = "SELECT * FROM PATIENT WHERE P_ID=? AND PATIENT_PASSWORD=?";
			List<PatientDetails> pD=jdbcTemplate.query(sql,new Object[]{p_Id,pwd}, new PatientMapper());
			return pD;
	}
	

}		


