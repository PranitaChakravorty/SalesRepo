package com.pojo;

public class DoctorDetails {
private String docId;
private String docName;
private String specialization;
private String contactNumber;
private String cabin_Number;
private String availableTimeSlots;
private String emailId;

public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}
public String getDocName() {
	return docName;
}
public void setDocName(String docName) {
	this.docName = docName;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getCabin_Number() {
	return cabin_Number;
}
public void setCabin_Number(String cabin_Number) {
	this.cabin_Number = cabin_Number;
}
public String getAvailableTimeSlots() {
	return availableTimeSlots;
}
public void setAvailableTimeSlots(String availableTimeSlots) {
	this.availableTimeSlots = availableTimeSlots;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "DoctorDetails [docId=" + docId + ", docName=" + docName + ", specialization=" + specialization
			+ ", contactNumber=" + contactNumber + ", cabin_Number=" + cabin_Number + ", availableTimeSlots="
			+ availableTimeSlots + ", emailId=" + emailId + "]";
}




}
