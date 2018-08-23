package com.data;

public class TestMessage {
	
	public static void main(String[] args) {
		
		Message msg = new Message("Process it");
		
		Consumer waiter = new Consumer(msg);
		new Thread(waiter, "consumer 1").start();
		
		Supplier waiter1 = new Supplier(msg);
		new Thread(waiter1, "Supplier 1").start();
		
		System.out.println("All threads are started");
	}

}
