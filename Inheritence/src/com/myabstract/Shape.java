package com.myabstract;

abstract public class Shape {
	
	private String name;
	
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	

	public Shape(String name) {
		super();
		this.name = name;
	}
	public void description() {
		System.out.println("name:"+name);
	}



	abstract public double area();
	

}
