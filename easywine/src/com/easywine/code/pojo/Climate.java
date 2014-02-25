package com.easywine.code.pojo;

import java.util.List;

public class Climate {
	private Integer climateID;
	private Integer climateCode;
	private String climateName;
	private String climateEName;
	private List<Flavour> flavours; //不同气候一种葡萄所产生的风味
	public Integer getClimateID() {
		return climateID;
	}
	public void setClimateID(Integer climateID) {
		this.climateID = climateID;
	}
	public Integer getClimateCode() {
		return climateCode;
	}
	public void setClimateCode(Integer climateCode) {
		this.climateCode = climateCode;
	}
	public String getClimateName() {
		return climateName;
	}
	public void setClimateName(String climateName) {
		this.climateName = climateName;
	}
	public String getClimateEName() {
		return climateEName;
	}
	public void setClimateEName(String climateEName) {
		this.climateEName = climateEName;
	}
	public List<Flavour> getFlavours() {
		return flavours;
	}
	public void setFlavours(List<Flavour> flavours) {
		this.flavours = flavours;
	}
}
