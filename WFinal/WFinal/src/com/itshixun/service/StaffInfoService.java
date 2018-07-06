package com.itshixun.service;

import java.awt.TextField;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;

import com.itshixun.model.StaffInfo;

public interface StaffInfoService {
	/**
	 * 此方法用于查询所有的员工资料
	 * @return 所有员工资料的集合
	 */
	public void selectAll(JTable jTable);
	/**
	 * 此方法用于查询一个特定的员工资料
	 * @param num员工编号
	 * @return
	 */
	public void selectOne(JTable jTable,int num);
	/**
	 * 此方法用于删除一个特定员工编号
	 * @param num员工编号
	 */
	public void deleteOne(int num);
	/**
	 * 此方法用于添加一个员工信息
	 * @param staffInfo员工信息对象
	 */
	public void addOne(StaffInfo staffInfo);
	/**
	 * 此方法用于更改某一对象信息
	 * @param staffInfo
	 */
	public void UpdateOne(StaffInfo staffInfo);
	public void CommonSelectAll(JTable jTable1);
}
