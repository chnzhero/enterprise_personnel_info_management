package com.itshixun.service;

import javax.swing.JTable;

import com.itshixun.model.StaffLeave;

public interface StaffLeaveService {
	/**
     * 查询所有请假信息
     * @return 所有请假信息的集合
     */
	public void selectAll(JTable jTable);
	/**
	 * 查询单个请假信息,键入员工编号
	 * @return 单个请假信息的集合
	 */
	public void selectOne(JTable jTable,int num);
	/**
	 * 删除某条特定的请假记录
	 * @param num员工编号
	 */
	public void deleteOne(int num);
	/**
	 * 添加员工请假信息
	 * @param staffInfo员工请假的对象
	 */
	public void addOne(StaffLeave staffLeave);
}
