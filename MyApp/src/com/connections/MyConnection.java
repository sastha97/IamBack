package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnection {
	
	private static Connection con;
	
	public static Connection getMyConnection() {

		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env/");
			DataSource ds = (DataSource) envContext.lookup("jdbc/TestDB");
			con = ds.getConnection();
			System.out.println("Got the connection bruh..!");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e);
		}
		
		
		return con;
		
		
	}
	public static void closeMyConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
