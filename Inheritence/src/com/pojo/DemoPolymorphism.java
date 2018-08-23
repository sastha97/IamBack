package com.pojo;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person e = new Employee();
		((Employee)e).display();
		

	}

}
class DemoEmployee{
	public void printEmployee(Object o) {
		
	}
	public void printEmployee(Person o) {
		
	}
	public void printEmployee(Employee o) {
		
	}
}