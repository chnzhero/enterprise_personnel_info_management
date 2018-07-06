package com.itshixun.dao;

import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JTable;

import com.itshixun.model.UserType;

public interface UserTypeDao {
	/**
	 */
	public Vector showAllUserType();
	
	public Vector showAllUserType2();
	/**
	 */
	public Vector showAUserType(int tid);
	/**
	 */
	public UserType UpdateUserType(UserType userType);
	/**
	 */
	public UserType AddUserType(UserType userType);
	
	 /**
	 */
	public void DelUserType(int tid);
	

	
	
}
