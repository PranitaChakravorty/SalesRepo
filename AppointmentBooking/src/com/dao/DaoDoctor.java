package com.dao;

import java.util.List;

import com.pojo.DoctorDetails;

public interface DaoDoctor {
	
 public List<DoctorDetails>searchDoctorDetails(String specialization);
 
}
