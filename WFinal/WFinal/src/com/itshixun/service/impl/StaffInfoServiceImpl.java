package com.itshixun.service.impl;

import java.awt.TextField;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.itshixun.dao.StaffInfoDao;
import com.itshixun.dao.impl.StaffInfoDaoImpl;
import com.itshixun.model.StaffInfo;
import com.itshixun.service.StaffInfoService;

public class StaffInfoServiceImpl implements StaffInfoService{
	StaffInfoDao staffInfoDao=new StaffInfoDaoImpl();
	@Override
   public void selectAll(JTable jTable) {
	// TODO Auto-generated method stub
	DefaultTableModel model = (DefaultTableModel) jTable.getModel();
	
	model.setRowCount(0);
	Vector v = staffInfoDao.selectAll( );
	for (int i = 0; i < v.size(); i++) {
		model.addRow((Vector) v.get(i));
	}
	}
	
	@Override
	public void selectOne(JTable jTable,int num) {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		model.setRowCount(0);
		Vector v = staffInfoDao.selectOne(num);
		model.addRow((Vector) v.get(0));
	}

	@Override
	public void deleteOne(int num) {
		// TODO Auto-generated method stub
		StaffInfoDao staffInfoDao=new StaffInfoDaoImpl();
		staffInfoDao.deleteOne(num);
	}

	@Override
	public void addOne(StaffInfo staffInfo) {
		StaffInfoDao staffInfoDao=new StaffInfoDaoImpl();
		staffInfoDao.addOne(staffInfo);
		
	}

	@Override
	public void UpdateOne(StaffInfo staffInfo) {
		// TODO Auto-generated method stub
		StaffInfoDao staffInfoDao=new StaffInfoDaoImpl();
		staffInfoDao.UpdateOne(staffInfo);
	}

	@Override
	public void CommonSelectAll(JTable jTable1) {
		// TODO Auto-generated method stub
		StaffInfoDao staffInfoDao=new StaffInfoDaoImpl();
		
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		
		model.setRowCount(0);
		Vector v = staffInfoDao.CommoSelectAll();
		for (int i = 0; i < v.size(); i++) {
			model.addRow((Vector) v.get(i));
		}
		}
	
	


	
	

}
