package com.itshixun.service;

import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JTable;

import com.itshixun.model.UserType;

public interface UserTypeService {
	/**
	 * 此方法用于找出所有的用户权限
	 * @return 空
	 */
	public void showAllUserType(JTable jtable);
	
	/**
	 * 找出特定的用户权限
	 * @return 特定用户权限的集合
	 */
//	public Vector showAUserType(int tid,JTable jTable1);
	public void showAUserType(int tid,JTable tTable1);
	/**
	 * 此方法用于更新一个用户权限
	 * @param userType
	 * @return 空
	 */
	public void UpdateUserType(UserType userType);
	/**
	 * 此方法用于添加一个用户权限
	 * @param userType
	 * @return 添加的用户权限对象
	 */
	public void AddUserType(UserType userType);
	
	/**
	 * 此方法用于删除一个用户权限对象
	 * @return 空
	 */
	public void DelUserType(int tid);
	public void showUserType(JComboBox limit);
}
