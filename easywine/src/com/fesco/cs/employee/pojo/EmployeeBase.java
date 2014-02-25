package com.fesco.cs.employee.pojo;

public class EmployeeBase {

	public String onlyNum;
	public String name;
	public String personID;
	public String phone;
	public String eMail;
	public String organization;
	public String organizationCode;
	public String oSecondCode;
	public String state;
	
	public String getOnlyNum() {
		return onlyNum;
	}
	public void setOnlyNum(String onlyNum) {
		this.onlyNum = onlyNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getoSecondCode() {
		return oSecondCode;
	}
	public void setoSecondCode(String oSecondCode) {
		this.oSecondCode = oSecondCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
