package com.itshixun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

import com.itshixun.dao.StaffInfoDao;
import com.itshixun.model.StaffInfo;
import com.itshixun.model.User;
import com.itshixun.util.JDBCUtil;

public class StaffInfoDaoImpl implements StaffInfoDao{
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	@Override
	public Vector selectAll( ) {
		// TODO Auto-generated method stub
		Vector SList=new Vector();
		String sql = "select staff_name,staff_id,dept_no,staff_pos,staff_pos_name," +
				"staff_sex from t_staff_info";
		conn = JDBCUtil.getConnection();
		try {//ks
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				 Vector SmallList= new Vector();
				 SmallList.add(rs.getString("staff_name"));
				 SmallList.add(rs.getInt("staff_id"));
				 SmallList.add(rs.getInt("dept_no"));
				 SmallList.add(rs.getString("staff_pos"));
				 SmallList.add(rs.getString("staff_pos_name"));
				 SmallList.add(rs.getString("staff_sex"));
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
	public Vector selectOne(int num) {//单个查询
		// TODO Auto-generated method stub
		Vector SList=new Vector();
		String sql = "select staff_name,staff_id,dept_no,staff_pos,staff_pos_name," +
		   "staff_sex from t_staff_info where staff_id="+num;
		conn = JDBCUtil.getConnection();
		try {//ks
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			 if(rs.next()){
				 Vector SmallList= new Vector();
				 SmallList.add(rs.getString("staff_name"));
				 SmallList.add(rs.getInt("staff_id"));
				 SmallList.add(rs.getInt("dept_no"));
				 SmallList.add(rs.getString("staff_pos"));
				 SmallList.add(rs.getString("staff_pos_name"));
				 SmallList.add(rs.getString("staff_sex"));
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
		String sql="delete from t_staff_info where staff_id="+num;
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
	public void addOne(StaffInfo staffInfo) {
		// TODO Auto-generated method stub
		String sql="insert into t_staff_info values("+
				staffInfo.getStaffId()+",'"+staffInfo.getStaffName()+"',"+staffInfo.getDeptNo()
				+",'"+staffInfo.getStaffPos()+"','"+staffInfo.getStaffPosName()
				+"','"+staffInfo.getStaffSex()+"')";
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
	public void UpdateOne(StaffInfo staffInfo) {
		// TODO Auto-generated method stub
		String sql="Update t_staff_info " +
				"set staff_name=?,dept_no=?,staff_pos=?,staff_pos_name=?,staff_sex=? " +
				"where staff_id=?";
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, staffInfo.getStaffName());
			pstmt.setInt(2, staffInfo.getDeptNo());
			pstmt.setString(3,staffInfo.getStaffPos());
			pstmt.setString(4,staffInfo.getStaffPosName());
			pstmt.setString(5, staffInfo.getStaffSex());
			pstmt.setInt(6, staffInfo.getStaffId());
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public Vector CommoSelectAll() {
		// TODO Auto-generated method stub
		Vector SList=new Vector();
		String sql = "select * from t_staff_infoview";
		conn = JDBCUtil.getConnection();
		try {//ks
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				 Vector SmallList= new Vector();
				 SmallList.add(rs.getString("staff_name"));
				 SmallList.add(rs.getInt("staff_id"));
				 SmallList.add(rs.getInt("dept_no"));
				 
				 SmallList.add(rs.getString("staff_sex"));
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


	
}
