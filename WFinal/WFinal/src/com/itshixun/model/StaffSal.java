package com.itshixun.model;

import java.sql.Date;

public class StaffSal {
	private int salChaNo;
	private int staffId;
	private int salChaStart;
	private int salChaEnd;
	private String SalChaReason;
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public int getSalChaStart() {
		return salChaStart;
	}
	public void setSalChaStart(int salChaStart) {
		this.salChaStart = salChaStart;
	}
	public int getSalChaEnd() {
		return salChaEnd;
	}
	public void setSalChaEnd(int salChaEnd) {
		this.salChaEnd = salChaEnd;
	}
	public String getSalChaReason() {
		return SalChaReason;
	}
	public void setSalChaReason(String salChaReason) {
		SalChaReason = salChaReason;
	}
	public int getSalChaNo() {
		return salChaNo;
	}
	public void setSalChaNo(int salChaNo) {
		this.salChaNo = salChaNo;
	}
	

}
