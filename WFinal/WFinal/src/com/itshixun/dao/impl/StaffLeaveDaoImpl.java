package com.itshixun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

import com.itshixun.dao.StaffLeaveDao;
import com.itshixun.model.StaffLeave;
import com.itshixun.util.JDBCUtil;

public class StaffLeaveDaoImpl implements StaffLeaveDao{
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	@Override
	public Vector selectAll() {
		// TODO Auto-generated method stub
		Vector SList=new Vector();
		String sql="select staff_leave_no,staff_id,leave_days,leave_reason," +
				"leave_dis_sal,leave_start_date,leave_end_date," +
				"leave_allow_person,leave_ask_date from t_staff_leave";
		conn = JDBCUtil.getConnection();
		try {//ks
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				 Vector SmallList= new Vector();
				 SmallList.add(rs.getInt("staff_leave_no"));
				 SmallList.add(rs.getInt("staff_id"));
				 SmallList.add(rs.getInt("leave_days"));
				 SmallList.add(rs.getString("leave_reason"));
				 SmallList.add(rs.getInt("leave_dis_sal"));
				 SmallList.add(rs.getDate("leave_start_date"));
				 SmallList.add(rs.getDate("leave_end_date"));
				 SmallList.add(rs.getString("leave_allow_person"));
				 SmallList.add(rs.getDate("leave_ask_date"));
				 Iterator it=SmallList.iterator();
				 while(it.hasNext()){
					 System.out.println(it.next());
				 }
				 SList.add(SmallList);
			 }
			 

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		
		
		return SList;
	}
	@Override
	public Vector selectOne(int num) {
		// TODO Auto-generated method stub
		Vector SList=new Vector();
		String sql ="select staff_leave_no,staff_id,leave_days,leave_reason," +
				"leave_dis_sal,leave_start_date,leave_end_date," +
				"leave_allow_person,leave_ask_date from t_staff_leave " +
				"where staff_leave_no="+num;
		conn = JDBCUtil.getConnection();
		try {//ks
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			 if(rs.next()){
				 Vector SmallList= new Vector();
				 SmallList.add(rs.getInt("staff_leave_no"));
				 SmallList.add(rs.getInt("staff_id"));
				 SmallList.add(rs.getInt("leave_days"));
				 SmallList.add(rs.getString("leave_reason"));
				 SmallList.add(rs.getInt("leave_dis_sal"));
				 SmallList.add(rs.getDate("leave_start_date"));
				 SmallList.add(rs.getDate("leave_end_date"));
				 SmallList.add(rs.getString("leave_allow_person"));
				 SmallList.add(rs.getDate("leave_ask_date"));
				 Iterator it=SmallList.iterator();
				 while(it.hasNext()){
					 System.out.println(it.next());
				 }
				 SList.add(SmallList);
				 
			 }

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		
		
		return SList;
				
	}
	@Override
	public void deleteOne(int num) {
		// TODO Auto-generated method stub
		String sql="delete from t_staff_leave where staff_leave_no="+num;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block        
			e.printStackTrace();
		}
	}
	@Override
	public void addOne(StaffLeave staffInfo) {
		// TODO Auto-generated method stub
		String sql="insert into t_staff_leave values(?,?,?,?,?,?,?,?,?,?)";
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, staffInfo.getStaffLeaveNo());
			pstmt.setInt(2, staffInfo.getStaffId());
			pstmt.setInt(3,staffInfo.getLeaveDays());
			pstmt.setString(4, staffInfo.getLeaveReason());
			pstmt.setInt(5, staffInfo.getLeaveDisSal());
			pstmt.setDate(6,staffInfo.getLeaveStartDate());
			pstmt.setDate(7,staffInfo.getLeaveEndDate());
			pstmt.setString(8,staffInfo.getLeaveAllowPerson());
			pstmt.setDate(9,staffInfo.getLeaveAskDate());
			pstmt.setString(10,staffInfo.getLeaveRemarks());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
