package com.itshixun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.itshixun.dao.StaffTransferDao;
import com.itshixun.model.StaffTransfer;
import com.itshixun.util.JDBCUtil;

public class StaffTransferDaoImpl implements StaffTransferDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;

	@Override
	public Vector findStaffTransfer() {
		// TODO Auto-generated method stub
		Vector list = new Vector();
		String sql = "select  transfer_No,staff_id,transfer_start_dept,transfer_start_pos,"
				+ "transfer_end_dept,transfer_end_Pos,transfer_Reason,"
				+ "transfer_date from t_staff_transfer";
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Vector listObject = new Vector();

				listObject.add(rs.getInt("transfer_No"));
				listObject.add(rs.getInt("staff_id"));
				listObject.add(rs.getString("transfer_start_dept"));
				listObject.add(rs.getString("transfer_start_pos"));
				listObject.add(rs.getString("transfer_end_dept"));
				listObject.add(rs.getString("transfer_end_pos"));
				listObject.add(rs.getString("transfer_reason"));
			
				listObject.add(rs.getDate("transfer_date"));
				list.add(listObject);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public void delStaffTransfer(int transferNo) {
		// TODO Auto-generated method stub
		String sql = "delete from t_staff_transfer " + "where transfer_no=?";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, transferNo);
			pstmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Vector findAStaffTransfer(int transfer) {
		// TODO Auto-generated method stub
		Vector list = new Vector();
		String sql = "select  transfer_No,staff_id,transfer_start_Dept,transfer_start_Pos,"
				+ "transfer_end_Dept,transfer_end_Pos,transfer_Reason,"
				+ "transfer_Date from t_staff_transfer where transfer_no="+transfer;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Vector listObject = new Vector();

				listObject.add(rs.getInt("transfer_No"));
				listObject.add(rs.getInt("staff_id"));
				listObject.add(rs.getString("transfer_start_dept"));
				listObject.add(rs.getString("transfer_start_pos"));
				listObject.add(rs.getString("transfer_end_dept"));
				listObject.add(rs.getString("transfer_end_pos"));
				listObject.add(rs.getString("transfer_reason"));

				listObject.add(rs.getDate("transfer_date"));
				list.add(listObject);
				System.out.println("1");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void addStaffTransfer(StaffTransfer staffTransfer) {
		// TODO Auto-generated method stub
		String sql = "insert into t_staff_transfer values(transfer_no,?,?,?,?,?,?,?)";
		conn = JDBCUtil.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,staffTransfer.getStaffId());
			pstmt.setString(2, staffTransfer.getTransferstartPos());
			pstmt.setString(3,staffTransfer.getTransferstartDept());
			pstmt.setString(4,staffTransfer.getTransferendPos());
			pstmt.setString(5, staffTransfer.getTransferendDept());
			pstmt.setString(6, staffTransfer.getTransferReason());
			pstmt.setDate(7, staffTransfer.getTransferDate());
			pstmt.execute(); 
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void UpdateStaffTransfer(StaffTransfer staffTransfer) {
		// TODO Auto-generated method stub
		String sql="Update t_staff_transfer set transfer_start_pos=?," +
				"transfer_start_dept=?,transfer_end_pos=?,transfer_end_dept=?," +
				"transfer_reason=?,transfer_date=? where transfer_no=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, staffTransfer.getTransferstartPos());
			pstmt.setString(2, staffTransfer.getTransferstartDept());
			pstmt.setString(3, staffTransfer.getTransferendPos());
			pstmt.setString(4, staffTransfer.getTransferendDept());
			pstmt.setString(5, staffTransfer.getTransferReason());
			pstmt.setDate(6,staffTransfer.getTransferDate());
			pstmt.setInt(7, staffTransfer.getTansferNo());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
