package com.s1.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.s1.dao.IConnectionManager;

@Repository
public class ConnectionManager implements IConnectionManager {
	private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Struts2Test?useSSL=false&serverTimezone=CST";
	private static final String DATABASE_USRE = "Victor";
	private static final String DATABASE_PASSWORD = "yu1002";
	/**
	 * 返回连接 
	 */
	public static Connection getConnection() {
		Connection dbConnection = null;
		try {
			Class.forName(DRIVER_CLASS);
			dbConnection = DriverManager.getConnection(DATABASE_URL,
					DATABASE_USRE, DATABASE_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dbConnection;
	}
	/**
	 * 关闭连接
	 */
	public static void closeConnection(Connection dbConnection) {
		try {
			if (dbConnection != null && (!dbConnection.isClosed())) {
				dbConnection.close();
			}
		} catch (SQLException sqlEx) {
			sqlEx.printStackTrace();
		}
	}
	/**
	 * 关闭结果集
	 */
	public static void closeResultSet(ResultSet res) {
		try {
			if (res != null) {
				res.close();
				res = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 *关闭语句
	 */
	public static void closeStatement(PreparedStatement pStatement) {
		try {
			if (pStatement != null) {
				pStatement.close();
				pStatement = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
