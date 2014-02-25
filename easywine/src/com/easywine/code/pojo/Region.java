package com.easywine.code.pojo;

public class Region {
	private Integer regionCodeID;
	private Integer regionCode;
	private String regionName;
	private Country country;
	public Integer getRegionCodeID() {
		return regionCodeID;
	}
	public void setRegionCodeID(Integer regionCodeID) {
		this.regionCodeID = regionCodeID;
	}
	public Integer getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(Integer regionCode) {
		this.regionCode = regionCode;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
