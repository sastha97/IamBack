package com.pojo;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (length*breadth);
	}

	/**
	 * @param length
	 * @param breadth
	 */
	public Rectangle(int length, int breadth, String name) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	

}
