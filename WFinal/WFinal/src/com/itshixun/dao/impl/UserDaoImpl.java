package com.itshixun.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

import com.itshixun.dao.UserDao;
import com.itshixun.model.User;
import com.itshixun.util.JDBCUtil;

public class UserDaoImpl implements UserDao {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		
	    User resultUser=null;
		String sql = "select user_no,user_name,user_pwd,type_no" +
				" from t_user " +
				" where user_name='"+user.getUserName()+"'  " +
				" and user_pwd='"+user.getUserPwd()+"'" +
				" and type_no="+user.getTypeNo()+"";
		conn = JDBCUtil.getConnection();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			 if(rs.next()){
				 resultUser = new User();
				 resultUser.setUserNo(rs.getInt("user_no"));
				 resultUser.setUserName(rs.getString("user_name"));
				 resultUser.setUserPwd(rs.getString("user_pwd"));
				 resultUser.setTypeNo(rs.getInt("type_no"));  
				
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		return  resultUser;
	}
	
	
	@Override
	public Vector findAllUser() {
		// TODO Auto-generated method stub
		Vector resultVector=new Vector();
		
		String sql="select user_no,user_name,user_pwd,type_no " +
				"from t_user";
		conn=JDBCUtil.getConnection();
		try {
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				
				Vector resultObject=new Vector();
				resultObject.add(rs.getInt("user_no"));
				resultObject.add(rs.getString("user_name"));
				resultObject.add(rs.getString("user_pwd"));
				resultObject.add(rs.getInt("type_no"));
				
				resultVector.add((Vector)resultObject);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resultVector;
	}
	



	@Override
	public Vector findAUser(String userName) {
		// TODO Auto-generated method stub
		Vector resultVector=new Vector();
		String sql="select user_no,user_name,user_pwd,type_no " +
		"from t_user" +
		" where user_name='"+userName+"';";
		conn=JDBCUtil.getConnection();
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
		Vector resultObject=new Vector();
		resultObject.add(rs.getInt("user_no"));
		resultObject.add(rs.getString("user_name"));
		resultObject.add(rs.getString("user_pwd"));
		resultObject.add(rs.getInt("type_no"));
		
		resultVector.add((Vector)resultObject);
	}} catch (SQLException e) {
	// TODO Auto-generated catch block
		e.printStackTrace();
		}
	return resultVector;
		}



	
	@Override
	public User UpdateUser(User user) {
		 User resultUser=null;
			String sql = 
				"Update t_user set user_name=?,user_pwd=?,type_no=? " +
				"where user_no=?";
			conn = JDBCUtil.getConnection();
			try {
				
				pstmt=conn.prepareStatement(sql);
			
				pstmt.setInt(4, user.getUserNo());
				pstmt.setString(1, user.getUserName());
				pstmt.setString(2, user.getUserPwd());
				pstmt.setInt(3,user.getTypeNo());
				pstmt.execute();
				
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally{
				JDBCUtil.closeResource(conn, pstmt, stmt, rs);
			}
			return  resultUser;
		
	}


	@Override
	public User AddUser(User user) {
		User resultUser=new User();
		String sql="insert into t_user values(user_no,?,?,?)";
		conn = JDBCUtil.getConnection();
		try {
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,user.getUserName());
		pstmt.setString(2,user.getUserPwd());
		pstmt.setInt(3,user.getTypeNo());
		pstmt.execute();
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		return resultUser;
	}


	@Override
	public void DelUser(String userName) {
		// TODO Auto-generated method stub
		String sql="delete from t_user where user_name=?";
		conn = JDBCUtil.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,userName);
			pstmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			JDBCUtil.closeResource(conn, pstmt, stmt, rs);
		}
		
	
	}

}
