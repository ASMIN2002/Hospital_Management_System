package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService{
	public static Connection conn;

	private static Connection createConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training?useSSL=false", "root", "Asmin@2002");
		return conn;
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		if (conn == null) {
			return createConn();
		}
		return conn;
	}
}
