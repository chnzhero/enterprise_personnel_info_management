package com.itshixun.dao;

import java.util.Vector;

import com.itshixun.model.StaffInfo;

public interface StaffInfoDao {
	/**
	 * 此方法用于查询所有的员工资料
	 * @return 所有员工资料的集合
	 */
	public Vector selectAll();
	/**
	 * 此方法用于查询一个特定的员工资料
	 * @param num员工编号
	 * @return
	 */
	public Vector selectOne(int num);
	
	/**
	 * 此方法用于删除一个特定员工编号
	 * @param num员工编号
	 */
	public void deleteOne(int num);
	/**
	 * 此方法用于添加一个员工信息
	 * @param s1员工姓名
	 * @param n1员工编号
	 * @param n2员工部门
	 * @param s2职称
	 * @param s3性别
	 */
	public void addOne(StaffInfo staffInfo);
	/**
	 * 此方法用于更改某一对象信息
	 * @param staffInfo
	 */
	public void UpdateOne(StaffInfo staffInfo);
	
	public Vector CommoSelectAll();

}
