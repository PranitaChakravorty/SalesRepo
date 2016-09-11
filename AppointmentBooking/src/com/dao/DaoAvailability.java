package com.dao;

public interface DaoAvailability {
	
	public void updateAvailability(String date,String noOfPatients);
	public void CheckNoOfSlots(String doc_Id,String date);
	
	}
