package com.itshixun.service.impl;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itshixun.dao.UserDao;
import com.itshixun.dao.impl.UserDaoImpl;
import com.itshixun.model.User;
import com.itshixun.service.UserService;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

	@Override
	public void findAllUser(JTable jTable) {
		// TODO Auto-generated method stub
		Vector list=userDao.findAllUser();
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
	}

	@Override
	public void findAUser(String userName, JTable jTable) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		Vector list=userDao.findAUser(userName);
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
		
		
	}

	@Override
	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		return userDao.UpdateUser(user);
		
	}

	@Override
	public User AddUser(User user) {
		// TODO Auto-generated method stub
	UserDao userDao=new UserDaoImpl();
	return userDao.AddUser(user);
	}

	@Override
	public void DelUser(String userName) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		userDao.DelUser(userName);
		
	}




 
 

}
