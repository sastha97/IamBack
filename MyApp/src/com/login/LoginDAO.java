package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connections.MyConnection;

public class LoginDAO {
	public boolean checkLogin(String username, String password) {
		boolean success = false;
		
		Connection con = MyConnection.getMyConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("select password from user2 where username =?");
			
			ps.setString(1, username);
			
			ResultSet r = ps.executeQuery();
			
			while(r.next()) {
				if(r.getString("password").equals(password)) {
					success = true;
				}
				else
					success = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return success;
	}

}
