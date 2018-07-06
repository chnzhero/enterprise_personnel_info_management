package com.itshixun.model;

import java.sql.Date;

public class StaffTransfer {
	private int tansferNo;
	private int staffId;
	private String transferstartDept;
	private String transferstartPos;
	private String transferendDept;
	private String transferendPos;
	private String transferReason;

	private Date transferDate;
	
	
	public StaffTransfer(){
		
	}
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getTransferstartDept() {
		return transferstartDept;
	}
	public void setTransferstartDept(String transferstartDept) {
		this.transferstartDept = transferstartDept;
	}
	public String getTransferstartPos() {
		return transferstartPos;
	}
	public void setTransferstartPos(String transferstartPos) {
		this.transferstartPos = transferstartPos;
	}
	public String getTransferendDept() {
		return transferendDept;
	}
	public void setTransferendDept(String transferendDept) {
		this.transferendDept = transferendDept;
	}
	public String getTransferendPos() {
		return transferendPos;
	}
	public void setTransferendPos(String transferendPos) {
		this.transferendPos = transferendPos;
	}
	public String getTransferReason() {
		return transferReason;
	}
	public void setTransferReason(String transferReason) {
		this.transferReason = transferReason;
	}

	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public int getTansferNo() {
		return tansferNo;
	}
	public void setTansferNo(int tansferNo) {
		this.tansferNo = tansferNo;
	}
	
	

}
