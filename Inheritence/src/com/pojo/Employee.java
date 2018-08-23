package com.pojo;

public class Employee extends Person {
	private double empSalary;
	private int empId;
	public Employee() {
		super(30,"city");
		empId = 0;
		empSalary = 1000;
	}
	
	
	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public Employee(double empSalary, int empId, int age, String name ) {
		super(age, name);
		this.empSalary = empSalary;
		this.empId = empId;
	}
	public void display(int t) {
		System.out.println(empId+"\t" + empSalary);
		//System.out.println("Name:\t"+getName());
		super.display();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + empId +" "+ empSalary;
	}

}
