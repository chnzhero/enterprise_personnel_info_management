package com.itshixun.service.impl;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itshixun.dao.StaffTransferDao;
import com.itshixun.dao.impl.StaffTransferDaoImpl;
import com.itshixun.model.StaffTransfer;
import com.itshixun.service.StaffTransferService;

public class StaffTransferServiceImpl implements StaffTransferService{
	StaffTransferDao staffTransferDao = new StaffTransferDaoImpl();

	@Override
	public void findStaffTransfer(JTable jTable) {
		DefaultTableModel model = (DefaultTableModel) jTable.getModel();
		model.setRowCount(0);
		Vector v = staffTransferDao.findStaffTransfer();
		for (int i = 0; i < v.size(); i++) {
			model.addRow((Vector) v.get(i));
		}
	}


	@Override
	public void delStaffTransfer(int transferNo) {
		staffTransferDao.delStaffTransfer(transferNo);
		
	}


	@Override
	public void addStaffTransfer(StaffTransfer staffTransfer) {
		// TODO Auto-generated method stub
		staffTransferDao.addStaffTransfer(staffTransfer);
	}


	@Override
	/*public Vector findAStaffTransfer(int transferNo,JTable jTable1) {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		System.out.println("2");
		Vector v = staffTransferDao.findStaffTransfer();
		for (int i = 0; i < v.size(); i++) {
			model.addRow((Vector) v.get(i));
		}
		return staffTransferDao.findAStaffTransfer(transferNo);
		
	}
*/
	public void findAStaffTransfer(int transferNo,JTable jTable1){
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		model.setRowCount(0);
		Vector v = staffTransferDao.findAStaffTransfer(transferNo);
		model.addRow((Vector) v.get(0));
	}

	@Override
	public void UpdateStaffTransfer(StaffTransfer staffTransfer) {
		// TODO Auto-generated method stub
		staffTransferDao.UpdateStaffTransfer(staffTransfer);
	}

}
