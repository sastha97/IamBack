package com.pojo;

public class OverloadProgram {
	public static void area(double l, double b) {
		System.out.println("Area of rectangle:"+(l*b));
	}
	public static void area(double s) {
		System.out.println("Area of square:"+(s*s));
	}
	public static void area(double a, double b, double c) {
		double s = (a+b+c)/2;
		double ar = Math.sqrt((s-a)*(s-b)*(s-c)*s);
		System.out.println("Area of triangle:"+(ar));
	}
	public static void area(double r, String c) {
		System.out.println("Area of circle:"+3.14159*r*r);
	}

}
