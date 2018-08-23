package com.pojo;

import java.time.LocalTime;

public class MarketOrder extends Order implements OrderInterface {

	public MarketOrder() {
		// TODO Auto-generated constructor stub
		super();
	}

	public MarketOrder(int userId, int initialQuantity, int orderId, Status status, Type type,
			LocalTime timeStamp) {
		super(userId, initialQuantity, orderId, status, type, timeStamp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void editOrder(int quantity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertIntoQueue() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteIntoQueue() {
		// TODO Auto-generated method stub

	}

}
