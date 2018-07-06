package com.itshixun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JTable;

import com.itshixun.dao.UserTypeDao;
import com.itshixun.model.User;
import com.itshixun.model.UserType;
import com.itshixun.util.JDBCUtil;

public class UserTypeDaoImpl implements UserTypeDao{
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	@Override
	public Vector showAllUserType() {
		Vector list =new Vector();
		String sql="Select type_name,type_no " +
				"from t_user_type";
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {

				list.addElement(new UserType(rs.getInt("type_no"), rs
						.getString("type_name")));
			}
		}catch(Exception e){
				 e.printStackTrace(); 
		} finally {
					JDBCUtil.closeResource(conn, pstmt, stmt, rs);
				}
			 return list;
		
	}
	public Vector showAllUserType2() {
		Vector list =new Vector();
		UserType resultUserType=null;
		String sql="Select type_name,type_no " +
				"from t_user_type";
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			 while(rs.next()){
				 Vector listObject =new Vector();
				 listObject.add(rs.getString("type_name"));
				 listObject.add(rs.getInt("type_no"));
				 list.add(listObject);
			 }
			 }catch(Exception e){
				 e.printStackTrace();
				 
			 }
			 return list;
		
	}
	@Override
	public Vector showAUserType(int tid) {
		// TODO Auto-generated method stub
		Vector list =new Vector();
		UserType resultUserType=null;
		String sql="Select type_name,type_no " +
				"from t_user_type " +
				"where type_no="+tid;
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			 while(rs.next()){
				 Vector listObject =new Vector();
				 listObject.add(rs.getString("type_name"));
				 listObject.add(rs.getInt("type_no"));
				 list.add(listObject);
			 }
			 }catch(Exception e){
				 e.printStackTrace();
				 
			 }
			 return list;
		
	}
	@Override
	public UserType UpdateUserType(UserType userType) {
		// TODO Auto-generated method stub
		System.out.println("1");
		DelUserType(userType.getTypeNo());
		System.out.println("2");
		AddUserType(userType);
	 return userType;
	}
	@Override
	public UserType AddUserType(UserType userType) {
		// TODO Auto-generated method stub
		UserType resultUserType=userType;
		try{
		conn=JDBCUtil.getConnection();
		String sql2="Insert into t_user_type values(?,?)";
		pstmt=conn.prepareStatement(sql2);
		pstmt.setString(1, userType.getTypeName());
		pstmt.setInt(2, userType.getTypeNo());
		pstmt.execute();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		return resultUserType;
	}
	@Override
	public void DelUserType(int tid) {
		// TODO Auto-generated method stub
		UserType resultUserType;
		String sql="delete from t_user_type where type_no=?";
		
		conn = JDBCUtil.getConnection();
		try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1,tid);
		pstmt.execute();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
	
	}

	



}
