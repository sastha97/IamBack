package com.pojo;

public class Calculator {
	
	public static int sum(int a) {
		return a;
	}
	public static int sum(int a, int b) {
		return sum(a+b);
		
	}
	public static int sum(int a, int b, int c) {
		return sum(sum(a,b),c);
	}
	
	public static int multiply(int a) {
		return a;
	}
	public static int multiply(int a, int b) {
		return multiply(a*b);
		
	}
	public static int multiply(int a, int b, int c) {
		return multiply(multiply(a,b),c);
	}


}
