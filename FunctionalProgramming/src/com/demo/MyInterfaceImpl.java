package com.demo;

public class MyInterfaceImpl implements MyInterface {
	
	public void showData() {
		System.out.println("Showing data from implementation class");
	}
	public static void main(String[] args) {
		MyInterface m = new MyInterfaceImpl();
		m.showData();
	}

}
