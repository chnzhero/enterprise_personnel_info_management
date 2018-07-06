package com.itshixun.service;

import java.util.Vector;

import javax.swing.JTable;

import com.itshixun.model.StaffSal;

public interface StaffSalService {
	/**
	 * 此方法用于找出所有员工的调薪记录
	 * @return 所有调薪记录的集合
	 */
	public void findAllStaffSal(JTable jtable1);
	/**
	 * 此方法用于找出某个员工的所有调薪记录
	 * @param staffId
	 * @return 空
	 */
	public void findAStaffSal(JTable jtable1,int staffId);
	/**
	 * 此方法用于根据记录编号查找特定记录
	 * @param salChaNo
	 * @return 空
	 */
	public void findASalChange(JTable jtable1,int salChaNo);
	/**
	 * 此方法用于根据编号更新员工
	 * @param staffID
	 */
	public void updateStaffSal(StaffSal staffSal);
	/**
	 * 此方法用于添加一个员工调薪记录
	 */
	public void addStaffSal(StaffSal staffSal);
	/**
	 * 此方法用于删除一条员工调薪记录
	 * @param salChaNo
	 */
	public void delStaffSal(int salChaNo);
	

}
