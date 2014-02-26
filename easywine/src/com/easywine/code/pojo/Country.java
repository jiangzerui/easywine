package com.easywine.code.pojo;

import java.util.List;

public class Country {
	private Integer countryID;
	private Integer countryCode;
	private String countryName;
	private String countryEName;
	private List<Region> regions;
	private List<Grape>  grapes;
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
	public String getCountryEName() {
		return countryEName;
	}
	public void setCountryEName(String countryEName) {
		this.countryEName = countryEName;
	}
	public List<Grape> getGrapes() {
		return grapes;
	}
	public void setGrapes(List<Grape> grapes) {
		this.grapes = grapes;
	}
}
