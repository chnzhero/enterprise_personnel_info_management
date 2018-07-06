package com.itshixun.dao;

import java.util.Vector;

import com.itshixun.model.StaffLeave;

public interface StaffLeaveDao {
    /**
     * 查询所有请假信息
     * @return 所有请假信息的集合
     */
	public Vector selectAll();
	/**
	 * 查询单个请假信息,键入员工编号
	 * @return 单个请假信息的集合
	 */
	public Vector selectOne(int num);
	/**
	 * 删除某条特定的请假记录
	 * @param num员工编号
	 */
	public void deleteOne(int num);
	/**
	 * 添加员工请假信息
	 * @param staffInfo员工请假的对象
	 */
	public void addOne(StaffLeave staffInfo);
	

}
