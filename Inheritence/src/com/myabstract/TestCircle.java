package com.myabstract;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle(4, "Circle");
		double a = s.area();
		System.out.println(a);
		s.description();
				

	}

}
