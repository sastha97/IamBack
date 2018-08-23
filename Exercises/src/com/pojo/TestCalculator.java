package com.pojo;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c = new Calculator(); 
		
		System.out.println(c.sum(1));
		System.out.println(c.sum(1,2));
		System.out.println(c.sum(1,2,3));
		System.out.println(c.multiply(1));
		System.out.println(c.multiply(1,2));
		System.out.println(c.multiply(1,2,3));
		
	}


}
