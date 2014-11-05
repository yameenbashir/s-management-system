package com.sms.beans.students;

public class ContactDetail {

//	private String dateOfBirth;
//	private String gender;
	private String guardianFirstName;
	private String guardianlastName;
	private String address;
	private String religion;
	private String landline;
	private String officeNumber;
	private String mobile;
	private String registrationNo;
	
	public ContactDetail(){}
	public ContactDetail(String guardianFirstName, String guardianlastName,
			String address, String religion, String landline,
			String officeNumber, String mobile, String registrationNo) {
		super();
		this.guardianFirstName = guardianFirstName;
		this.guardianlastName = guardianlastName;
		this.address = address;
		this.religion = religion;
		this.landline = landline;
		this.officeNumber = officeNumber;
		this.mobile = mobile;
		this.registrationNo = registrationNo;
	}
	public String getGuardianFirstName() {
		return guardianFirstName;
	}
	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}
	public String getGuardianlastName() {
		return guardianlastName;
	}
	public void setGuardianlastName(String guardianlastName) {
		this.guardianlastName = guardianlastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
}
