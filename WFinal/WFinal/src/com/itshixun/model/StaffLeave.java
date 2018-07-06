package com.itshixun.model;

import java.sql.Date;

public class StaffLeave {
	private int staffLeaveNo;
	private int staffId;
	private int leaveDays;
	private String leaveReason;
	private int leaveDisSal;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String leaveAllowPerson;
	private Date leaveAskDate;
	private String leaveRemarks;
	
	public int getStaffLeaveNo() {
		return staffLeaveNo;
	}
	public void setStaffLeaveNo(int staffLeaveNo) {
		this.staffLeaveNo = staffLeaveNo;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public int getLeaveDisSal() {
		return leaveDisSal;
	}
	public void setLeaveDisSal(int leaveDisSal) {
		this.leaveDisSal = leaveDisSal;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveAllowPerson() {
		return leaveAllowPerson;
	}
	public void setLeaveAllowPerson(String leaveAllowPerson) {
		this.leaveAllowPerson = leaveAllowPerson;
	}
	public Date getLeaveAskDate() {
		return leaveAskDate;
	}
	public void setLeaveAskDate(Date leaveAskDate) {
		this.leaveAskDate = leaveAskDate;
	}
	public String getLeaveRemarks() {
		return leaveRemarks;
	}
	public void setLeaveRemarks(String leaveRemarks) {
		this.leaveRemarks = leaveRemarks;
	}
}
