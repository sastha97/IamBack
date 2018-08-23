package com.demo;

public class DemoInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface m = new MyInterface() {
			public void showData(){
				
				System.out.println("Displying data from Inner Class");
			}
			
			
		};
		m.showData();
	}

}
