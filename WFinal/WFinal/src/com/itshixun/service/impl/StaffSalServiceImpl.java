package com.itshixun.service.impl;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itshixun.dao.StaffSalDao;
import com.itshixun.dao.impl.StaffSalDaoImpl;
import com.itshixun.model.StaffSal;
import com.itshixun.service.StaffSalService;

public class StaffSalServiceImpl implements StaffSalService{

	@Override
	public void addStaffSal(StaffSal staffSal) {
		// TODO Auto-generated method stub
		StaffSalDao staffSalDao=new StaffSalDaoImpl();
		staffSalDao.addStaffSal(staffSal);
	}

	@Override
	public void delStaffSal(int salChaNo) {
		// TODO Auto-generated method stub
		StaffSalDao staffSalDao=new StaffSalDaoImpl();
		staffSalDao.delStaffSal(salChaNo);
		
	}

	@Override
	public void findASalChange(JTable jTable1, int salChaNo) {
		// TODO Auto-generated method stub
		StaffSalDao staffSalDao=new StaffSalDaoImpl();
		Vector list=staffSalDao.findASalChange(salChaNo);
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
		
	}

	@Override
	public void findAStaffSal(JTable jTable1, int staffId) {
		// TODO Auto-generated method stub
		StaffSalDao staffSalDao=new StaffSalDaoImpl();
		Vector list=staffSalDao.findAStaffSal(staffId);
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
	}

	@Override
	public void findAllStaffSal(JTable jTable1) {
		// TODO Auto-generated method stub
		StaffSalDao staffSalDao=new StaffSalDaoImpl();
		Vector list=staffSalDao.findAllStaffSal();
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		for (int i = 0; i < list.size(); i++) {
			model.addRow((Vector) list.get(i));
		}
	}

	@Override
	public void updateStaffSal(StaffSal staffSal) {
		// TODO Auto-generated method stub
		StaffSalDao staffSalDao=new StaffSalDaoImpl();
		staffSalDao.updateStaffSal(staffSal);
		
		
	}

}
