package com.crud.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	public static Connection getConnection() {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error while creating connection " + e.getMessage());
		}

		return connection;
	}
}
