package com.muzix.app.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getJdbcConnection() throws SQLException {

		String dbUrl="jdbc:mysql://localhost:3306/musicplayer";
		String username="root";
		String password="root";
      Connection conn = DriverManager.getConnection(dbUrl,username,password);

		return conn;
	}
}
