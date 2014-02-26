package com.easywine.code.pojo;

import java.util.List;

public class Grape {
	private Integer grapeID;
	private Integer grapeCode;
	private String grapeName;
	private String grapeEName;
	private String grapeType; // 红葡萄 白葡萄
	private List<Flavour> classicFlavours;  //一种葡萄的典型风味
	private Climate climate;
	private List<Country> classicCountrys;
	private List<Region> classicRegions;
	private List<Grape> blends;
	public Integer getGrapeID() {
		return grapeID;
	}
	public void setGrapeID(Integer grapeID) {
		this.grapeID = grapeID;
	}
	public Integer getGrapeCode() {
		return grapeCode;
	}
	public void setGrapeCode(Integer grapeCode) {
		this.grapeCode = grapeCode;
	}
	public String getGrapeName() {
		return grapeName;
	}
	public void setGrapeName(String grapeName) {
		this.grapeName = grapeName;
	}
	public String getGrapeEName() {
		return grapeEName;
	}
	public void setGrapeEName(String grapeEName) {
		this.grapeEName = grapeEName;
	}
	public List<Flavour> getClassicFlavours() {
		return classicFlavours;
	}
	public void setClassicFlavours(List<Flavour> classicFlavours) {
		this.classicFlavours = classicFlavours;
	}
	public Climate getClimate() {
		return climate;
	}
	public void setClimate(Climate climate) {
		this.climate = climate;
	}
	public List<Country> getClassicCountrys() {
		return classicCountrys;
	}
	public void setClassicCountrys(List<Country> classicCountrys) {
		this.classicCountrys = classicCountrys;
	}
	public List<Region> getClassicRegions() {
		return classicRegions;
	}
	public void setClassicRegions(List<Region> classicRegions) {
		this.classicRegions = classicRegions;
	}
	public List<Grape> getBlends() {
		return blends;
	}
	public void setBlends(List<Grape> blends) {
		this.blends = blends;
	}
	public String getGrapeType() {
		return grapeType;
	}
	public void setGrapeType(String grapeType) {
		this.grapeType = grapeType;
	}
}
