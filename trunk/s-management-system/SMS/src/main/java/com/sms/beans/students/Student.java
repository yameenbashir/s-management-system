package com.sms.beans.students;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private String registrationNo;
	private String dateOfBirth;
	private String gender;
	private String category;
	private String admissionDate;
	
	public Student(){}
	
	public Student(String firstName, String lastName, String registrationNo,
			String dateOfBirth, String gender, String category,
			String admissionDate) {
//		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registrationNo = registrationNo;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.category = category;
		this.admissionDate = admissionDate;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	

}
