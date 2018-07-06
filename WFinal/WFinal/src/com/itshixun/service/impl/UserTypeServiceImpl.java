package com.itshixun.service.impl;

import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itshixun.dao.UserTypeDao;
import com.itshixun.dao.impl.UserTypeDaoImpl;
import com.itshixun.model.UserType;
import com.itshixun.service.UserTypeService;

public class UserTypeServiceImpl implements UserTypeService{
	UserTypeDao userTypeDao=new UserTypeDaoImpl();
	
	
	public void showAllUserType(JTable jTable) {
		// TODO Auto-generated method stub
	
		Vector list=userTypeDao.showAllUserType2();
		
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
	}


	@Override
	/*public Vector showAUserType(int tid,JTable jTable1) {
        Vector list=userTypeDao.showAllUserType();
		
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
		UserTypeDao userTypeDao=new UserTypeDaoImpl();
		return userTypeDao.showAUserType(tid);
		
	}*/
	public void  showAUserType(int tid,JTable jTable1) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		Vector v=userTypeDao.showAUserType(tid);
		model.addRow((Vector)v.get(0));
		
	}


	@Override
	public void UpdateUserType(UserType userType) {
		// TODO Auto-generated method stub
		UserTypeDao userTypeDao=new UserTypeDaoImpl();
		userTypeDao.UpdateUserType(userType);
	}


	@Override
	public void AddUserType(UserType userType) {
		
		UserTypeDao userTypeDao=new UserTypeDaoImpl();
		userTypeDao.AddUserType(userType);
	}


	@Override
	public void DelUserType(int tid) {
		// TODO Auto-generated method stub
		UserTypeDao userTypeDao=new UserTypeDaoImpl();
		userTypeDao.DelUserType(tid);
		
	}
	public void showUserType(JComboBox limit) {
		// TODO Auto-generated method stub
		Vector v=userTypeDao.showAllUserType();
		 for(Object u : v){
			 System.out.println(((UserType)u).getTypeName());
			 
	      limit.addItem(((UserType)u).getTypeName());
		 }
	}


	

}
