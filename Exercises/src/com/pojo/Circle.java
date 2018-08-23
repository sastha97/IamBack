package com.pojo;

public class Circle extends Shape {
	private int radius;
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3.14*radius*radius);
	}

	/**
	 * @param radius
	 */
	public Circle(int radius, String name) {
		super(name);
		this.radius = radius;
	}

}
