package com.itshixun.service.impl;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itshixun.dao.StaffInfoDao;
import com.itshixun.dao.StaffLeaveDao;
import com.itshixun.dao.impl.StaffInfoDaoImpl;
import com.itshixun.dao.impl.StaffLeaveDaoImpl;
import com.itshixun.model.StaffLeave;
import com.itshixun.service.StaffLeaveService;

public class StaffLeaveServiceImpl implements StaffLeaveService{
	StaffLeaveDao staffLeaveDao=new StaffLeaveDaoImpl();
	@Override
	public void selectAll(JTable jTable) {
		// TODO Auto-generated method stub
		
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		
		model.setRowCount(0);
		Vector v = staffLeaveDao.selectAll( );
		for (int i = 0; i < v.size(); i++) {
			model.addRow((Vector) v.get(i));
		}
	}

	@Override
	public void selectOne(JTable jTable, int num) {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		model.setRowCount(0);
		Vector v = staffLeaveDao.selectOne(num);
		model.addRow((Vector) v.get(0));
	}

	@Override
	public void deleteOne(int num) {
		// TODO Auto-generated method stub
		StaffLeaveDao staffLeaveDao=new StaffLeaveDaoImpl();
		staffLeaveDao.deleteOne(num);
	}

	@Override
	public void addOne(StaffLeave staffLeave) {
		// TODO Auto-generated method stub
		StaffLeaveDao staffLeaveDao=new StaffLeaveDaoImpl();
		staffLeaveDao.addOne(staffLeave);
	}
	
}
