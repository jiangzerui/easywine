package com.easywine.code.pojo;

public class Region {
	private Integer regionID;
	private Integer regionCode;
	private String regionName;
	private String regionEName;
	private Country country;
	
	public Integer getRegionID() {
		return regionID;
	}
	public void setRegionID(Integer regionID) {
		this.regionID = regionID;
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
	public String getRegionEName() {
		return regionEName;
	}
	public void setRegionEName(String regionEName) {
		this.regionEName = regionEName;
	}
}
