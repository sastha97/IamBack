package com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connections.MyConnection;
import com.pojo.LimitOrder;
import com.pojo.MarketOrder;

public class OrderDAO {

	public void addLimitOrder(LimitOrder limitorder){
		String INSERT_INTO_ORDER="insert into Order values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_INTO_ORDER);
			ps.setInt(1, limitorder.getUserId());
			ps.setInt(2, limitorder.getInitialQuantity());
			ps.setInt(3, limitorder.getOrderId());
			ps.setObject(4, limitorder.getStatus());
			ps.setObject(5, limitorder.getType());
			ps.setObject(6, limitorder.getTimeStamp());
			ps.executeUpdate();
			
			String INSERT_INTO_LIMITORDER = "insert into LimitOrder values(?,?,?)";
			ps=MyConnection.getMyConnection().prepareStatement(INSERT_INTO_LIMITORDER);
			ps.setInt(1, limitorder.getRemainingQuantity());
			ps.setDouble(2, limitorder.getPrice());
			ps.setBoolean(3, limitorder.getAllOrNone());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addMarketOrder(MarketOrder marketorder) {
		
	}
}
