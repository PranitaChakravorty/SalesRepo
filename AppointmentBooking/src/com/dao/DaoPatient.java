package com.dao;

import java.util.List;

import com.pojo.Availability;
import com.pojo.PatientDetails;

public interface DaoPatient {
	public void insertPatientDetails(PatientDetails pD);
	public List<Availability> displayPatientDetails(String doc_Id);
	public PatientDetails search(String p_Id);
	public List<PatientDetails> login(String p_Id,String pwd);

}
