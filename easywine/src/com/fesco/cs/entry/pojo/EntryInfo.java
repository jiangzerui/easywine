package com.fesco.cs.entry.pojo;

import java.util.Date;

public class EntryInfo {
	private String organizationCode;
	private String secondCode;
	private String organization;
	private Date entryDate;             //派出办理日期
	private Date sendDate;             //派出日期
	private Date dimission;             //撤离日期
	private Date doDimission;            //撤离办理日期
	public String getOrganizationCode() {
		return organizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}
	public String getSecondCode() {
		return secondCode;
	}
	public void setSecondCode(String secondCode) {
		this.secondCode = secondCode;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	public Date getDimission() {
		return dimission;
	}
	public void setDimission(Date dimission) {
		this.dimission = dimission;
	}
	public Date getDoDimission() {
		return doDimission;
	}
	public void setDoDimission(Date doDimission) {
		this.doDimission = doDimission;
	}
	

}
