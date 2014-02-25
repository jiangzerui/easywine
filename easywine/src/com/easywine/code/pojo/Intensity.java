package com.easywine.code.pojo;

public class Intensity {
	private Integer intensityID;
	private Integer intensityCode;
	private Integer intensityType;//1.appearance 2.nose
	private String intensityName;
	private String intensityEName;
	public Integer getIntensityID() {
		return intensityID;
	}
	public void setIntensityID(Integer intensityID) {
		this.intensityID = intensityID;
	}
	public Integer getIntensityCode() {
		return intensityCode;
	}
	public void setIntensityCode(Integer intensityCode) {
		this.intensityCode = intensityCode;
	}
	public Integer getIntensityType() {
		return intensityType;
	}
	public void setIntensityType(Integer intensityType) {
		this.intensityType = intensityType;
	}
	public String getIntensityName() {
		return intensityName;
	}
	public void setIntensityName(String intensityName) {
		this.intensityName = intensityName;
	}
	public String getIntensityEName() {
		return intensityEName;
	}
	public void setIntensityEName(String intensityEName) {
		this.intensityEName = intensityEName;
	}
}
