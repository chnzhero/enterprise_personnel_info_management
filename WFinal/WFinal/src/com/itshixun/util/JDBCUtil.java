package com.itshixun.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.PreparedStatement;
 

/** 项目名称：pro 
 * 类名称：JDBCUtil 
 * Copyright: Copyright (c) 2014 by  丁丁
 * 创建人：丁俊 
 * 创建时间：2014年6月23日 上午8:51:45 
 * 修改人：丁俊 
 * 修改时间：2014年6月23日 上午8:51:45 
 * 修改备注：
 * @version 1.0* */

public class JDBCUtil {
	private static String url;
	private static String user;
	private static String password;
	private static String driver;
	static {
		Properties pro = new Properties();
		InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream(
				"db.properties");
		try {
			pro.load(is);
			url = pro.getProperty("jdbc.url");
			user = pro.getProperty("jdbc.user");
			password = pro.getProperty("jdbc.password");
			driver = pro.getProperty("jdbc.driver");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 */
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * @param con
	 * @param stmt
	 * @param rs
	 */
	
	public static void closeResource(Connection con, PreparedStatement psment,Statement stmt,
			ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if(psment!=null){
				psment.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void closeResource(Connection con,PreparedStatement psment, Statement stmt) {
		try {
			if(psment!=null){
				psment.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
