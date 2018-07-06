package com.itshixun.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import com.itshixun.dao.StaffSalDao;
import com.itshixun.model.StaffSal;
import com.itshixun.model.User;
import com.itshixun.util.JDBCUtil;

public class StaffSalDaoImpl implements StaffSalDao{
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	@Override
	public Vector findAStaffSal(int staffId) {
		// TODO Auto-generated method stub
		Vector<Vector<Comparable>> resultVector=new Vector();
		String sql="select sal_cha_no,staff_id,salChaDate,salChaStart,salChaEnd,salChaReason " +
				"from t_sal_change where staff_id="+staffId;
		conn=JDBCUtil.getConnection();
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				
				Vector<Comparable> resultObject=new Vector();
				resultObject.add(rs.getInt("sal_cha_no"));
				resultObject.add(rs.getInt("staff_id"));
				resultObject.add(rs.getDate("sal_Cha_Date"));
				resultObject.add(rs.getInt("sal_Cha_Start"));
				resultObject.add(rs.getInt("sal_Cha_End"));
				resultObject.add(rs.getString("salChaReason"));
				
				resultVector.add((Vector)resultObject);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resultVector;
	
	}
	
	@Override
	public Vector findAllStaffSal() {
		// TODO Auto-generated method stub
		Vector resultVector=new Vector();
		String sql="select sal_cha_no,staff_id," +
				"sal_Cha_Start,sal_Cha_End,sal_Cha_Reason " +
				"from t_sal_change";
		conn=JDBCUtil.getConnection();
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				
				Vector resultObject=new Vector();
				resultObject.add(rs.getInt("sal_cha_no"));
				resultObject.add(rs.getInt("staff_id"));
			
				resultObject.add(rs.getInt("sal_Cha_Start"));
				resultObject.add(rs.getInt("sal_Cha_End"));
				resultObject.add(rs.getString("sal_Cha_Reason"));
				
				resultVector.add((Vector)resultObject);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resultVector;
	}
	
	@Override
	public Vector findASalChange(int salChaNo) {
		// TODO Auto-generated method stub
		Vector resultVector=new Vector();
		String sql="select sal_cha_no,staff_id,sal_Cha_Start,sal_Cha_End,sal_Cha_Reason " +
				"from t_sal_change where sal_cha_no="+salChaNo;
		conn=JDBCUtil.getConnection();
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				
				Vector resultObject=new Vector();
				resultObject.add(rs.getInt("sal_cha_no"));
				resultObject.add(rs.getInt("staff_id"));
			
				resultObject.add(rs.getInt("sal_Cha_Start"));
				resultObject.add(rs.getInt("sal_Cha_End"));
				resultObject.add(rs.getString("sal_Cha_Reason"));
				
				resultVector.add((Vector)resultObject);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resultVector;
	}

	@Override
	public void updateStaffSal(StaffSal staffSal) {
		// TODO Auto-generated method stub
		String sql="Update t_sal_change " +
		"set salChaNo=?,staffId=?,salChaStart=?,salChaEnd=?,SalChaReason=? " +
		"where staff_id=?";
conn = JDBCUtil.getConnection();
try {
	pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, staffSal.getSalChaNo());
	pstmt.setInt(2, staffSal.getStaffId());
	pstmt.setInt(3,staffSal.getSalChaStart());
	pstmt.setInt(4,staffSal.getSalChaEnd());
	pstmt.setString(5, staffSal.getSalChaReason());
	pstmt.setInt(6, staffSal.getStaffId());
	pstmt.execute();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		
		
	}
	
	@Override
	public void addStaffSal(StaffSal staffSal) {
		// TODO Auto-generated method stub
		StaffSal resultStaffSal=staffSal;
		String sql="insert into t_sal_change values(sal_Cha_No,?,?,?,?)";
		conn = JDBCUtil.getConnection();
		try {
		pstmt=conn.prepareStatement(sql);

		pstmt.setInt(1,resultStaffSal.getStaffId());
		pstmt.setInt(2,resultStaffSal.getSalChaStart());
		pstmt.setInt(3,resultStaffSal.getSalChaEnd());
		pstmt.setString(4,resultStaffSal.getSalChaReason());
		pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		
	}

	@Override
	public void delStaffSal(int salChaNo) {
		// TODO Auto-generated method stub
		String sql="delete from t_sal_change where sal_cha_no=?";
		conn = JDBCUtil.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, salChaNo);
			pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		
	}



	
	

}
