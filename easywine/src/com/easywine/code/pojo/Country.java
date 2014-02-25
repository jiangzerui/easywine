package com.easywine.code.pojo;

import java.util.List;

public class Country {
	private Integer countryID;
	private Integer countryCode;
	private String countryName;
	private List<Region> regions;
	public Integer getCountryID() {
		return countryID;
	}
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public List<Region> getRegions() {
		return regions;
	}
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
}
