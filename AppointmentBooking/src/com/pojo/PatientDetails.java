package com.pojo;

public class PatientDetails {
private String p_Id;
private String name;
private String gender;
private String age;
private String contactNumber;
private String address;
private String password;
public String getP_Id() {
	return p_Id;
}
public void setP_Id(String p_Id) {
	this.p_Id = p_Id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "PatientDetails [p_Id=" + p_Id + ", name=" + name + ", gender=" + gender + ", age=" + age
			+ ", contactNumber=" + contactNumber + ", address=" + address + ", password=" + password + "]";
}

}
