package com.pojo;

import java.time.LocalTime;

public interface OrderInterface {


					
					
					
	//getters and Setters, Constructors(default and Parameterized), toString, equals(Primary key OrderId), 
					
	void editOrder(int  quantity);
	void cancelOrder();					
	void insertIntoQueue();							
	void deleteIntoQueue();
										
										
}
