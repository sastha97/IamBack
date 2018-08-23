package com.exception;

public class MyException extends Exception {
	
	private String message;
	
	public MyException() {
		// TODO Auto-generated constructor stub
		message = "You got expecto petronum";
	}
	
	
	public MyException(String message) {
		super(message);
		this.message = message;
	}


	public void showCause()
	{
		System.out.println("You got xxxx exception");
	}
}
