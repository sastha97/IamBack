package com.pojo;

import java.time.LocalTime;

public class Trade {
	private int tradeId;
	private LocalTime timeStamp;
	private int quantity;	
	private Double price;	
	private int sellOrderId;	
	private int buyOrderId;
	public Trade() {
		// TODO Auto-generated constructor stub
		this.tradeId = 0;
		this.timeStamp = getTimeStamp();
		this.quantity = 0;
		this.price = 0d;
		this.sellOrderId = 0;
		this.buyOrderId = 0;
	}
	

	
	public Trade(int tradeId, LocalTime timeStamp, int quantity, Double price, int sellOrderId, int buyOrderId) {
		this.tradeId = tradeId;
		this.timeStamp = timeStamp;
		this.quantity = quantity;
		this.price = price;
		this.sellOrderId = sellOrderId;
		this.buyOrderId = buyOrderId;
	}



	public int getTradeId() {
		return tradeId;
	}



	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}



	public LocalTime getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(LocalTime timeStamp) {
		this.timeStamp = timeStamp;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public int getSellOrderId() {
		return sellOrderId;
	}



	public void setSellOrderId(int sellOrderId) {
		this.sellOrderId = sellOrderId;
	}



	public int getBuyOrderId() {
		return buyOrderId;
	}



	public void setBuyOrderId(int buyOrderId) {
		this.buyOrderId = buyOrderId;
	}
	
	
	
	
}
