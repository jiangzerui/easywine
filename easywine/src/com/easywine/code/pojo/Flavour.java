package com.easywine.code.pojo;

public class Flavour {
	private Integer flavourID;
	private Integer flavourCode;
	private Integer flavourType;  //1. aroma   2.palate
	private String flavourName;
	private String flavourEName;
	private String flavourDescription;  //description with classic language 
	public Integer getFlavourID() {
		return flavourID;
	}
	public void setFlavourID(Integer flavourID) {
		this.flavourID = flavourID;
	}
	public Integer getFlavourCode() {
		return flavourCode;
	}
	public void setFlavourCode(Integer flavourCode) {
		this.flavourCode = flavourCode;
	}
	public String getFlavourName() {
		return flavourName;
	}
	public void setFlavourName(String flavourName) {
		this.flavourName = flavourName;
	}
	public String getFlavourDescription() {
		return flavourDescription;
	}
	public void setFlavourDescription(String flavourDescription) {
		this.flavourDescription = flavourDescription;
	}
	public Integer getFlavourType() {
		return flavourType;
	}
	public void setFlavourType(Integer flavourType) {
		this.flavourType = flavourType;
	}
	public String getFlavourEName() {
		return flavourEName;
	}
	public void setFlavourEName(String flavourEName) {
		this.flavourEName = flavourEName;
	}
}
