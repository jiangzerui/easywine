package com.fesco.cs.medical.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class MedicalInsurance {

	private Date compensate;
	private String cType;
	private BigDecimal requestCompensate;
	private BigDecimal realCompensate;
	private String reason;
	public Date getCompensate() {
		return compensate;
	}
	public void setCompensate(Date compensate) {
		this.compensate = compensate;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	public BigDecimal getRequestCompensate() {
		return requestCompensate;
	}
	public void setRequestCompensate(BigDecimal requestCompensate) {
		this.requestCompensate = requestCompensate;
	}
	public BigDecimal getRealCompensate() {
		return realCompensate;
	}
	public void setRealCompensate(BigDecimal realCompensate) {
		this.realCompensate = realCompensate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
}
