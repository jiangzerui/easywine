package com.fesco.cs.accumulation.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AccumulationBase {
	
	private String houseCenter;
	private String houseCenterCode;
	private String houseCenterNo;
	private String onlyNum;
	private String personName;
	private String personID;
	private String organization;
	private BigDecimal accountBlanace;
	private BigDecimal deposit;
	private BigDecimal withdraw;
	private BigDecimal forwardBlanace;
	private BigDecimal lastYearExtration;
	private BigDecimal interest;
	private String nextDepositDate;
	private String status;
	private String bankName;
	private String bankAccount;

	public String getHouseCenter() {
		return houseCenter;
	}
	public void setHouseCenter(String houseCenter) {
		this.houseCenter = houseCenter;
	}
	public String getHouseCenterNo() {
		return houseCenterNo;
	}
	public void setHouseCenterNo(String houseCenterNo) {
		this.houseCenterNo = houseCenterNo;
	}
	public String getOnlyNum() {
		return onlyNum;
	}
	public void setOnlyNum(String onlyNum) {
		this.onlyNum = onlyNum;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public BigDecimal getAccountBlanace() {
		return accountBlanace;
	}
	public void setAccountBlanace(BigDecimal accountBlanace) {
		this.accountBlanace = accountBlanace;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	public BigDecimal getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(BigDecimal withdraw) {
		this.withdraw = withdraw;
	}
	public BigDecimal getForwardBlanace() {
		return forwardBlanace;
	}
	public void setForwardBlanace(BigDecimal forwardBlanace) {
		this.forwardBlanace = forwardBlanace;
	}
	public BigDecimal getLastYearExtration() {
		return lastYearExtration;
	}
	public void setLastYearExtration(BigDecimal lastYearExtration) {
		this.lastYearExtration = lastYearExtration;
	}
	public BigDecimal getInterest() {
		return interest;
	}
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}
	public String getNextDepositDate() {
		return nextDepositDate;
	}
	public void setNextDepositDate(String nextDepositDate) {
		this.nextDepositDate = nextDepositDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		if(bankName!="" && bankName !=null){
			if(bankName.equals("01")){
				this.bankName = "建设银行";
			}
			if(bankName.equals("02")){
				this.bankName = "工商银行";
			}
			if(bankName.equals("03")){
				this.bankName = "农业银行";
			}
			if(bankName.equals("04")){
				this.bankName = "中国银行";
			}
			if(bankName.equals("05")){
				this.bankName = "交通银行";
			}
			if(bankName.equals("06")){
				this.bankName = "华夏银行";
			}
			if(bankName.equals("07")){
				this.bankName = "光大银行";
			}
			if(bankName.equals("08")){
				this.bankName = "光大银行";
			}
			if(bankName.equals("10")){
				this.bankName = "招商银行";
			}
			if(bankName.equals("11")){
				this.bankName = "民生银行";
			}
			if(bankName.equals("12")){
				this.bankName = "福建兴业银行";
			}
			if(bankName.equals("17")){
				this.bankName = "广东发展银行";
			}
			if(bankName.equals("20")){
				this.bankName = "邮政储蓄";
			}
			if(bankName.equals("21")){
				this.bankName = "北京银行";
			}
			if(bankName.equals("22")){
				this.bankName = "深圳发展银行";
			}
			if(bankName.equals("23")){
				this.bankName = "中信实业银行";
			}
			if(bankName.equals("25")){
				this.bankName = "上海浦东发展银行";
			}
		}
		
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getHouseCenterCode() {
		return houseCenterCode;
	}
	public void setHouseCenterCode(String houseCenterCode) {
		this.houseCenterCode = houseCenterCode;
	}
	
	
}
