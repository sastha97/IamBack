package com.pojo;

public class Student {

	String name;
	int[] marks;
	int rollNo;
	
	public Student() {
		name = "Dd";
		int[] mark = {100,100,100};
		marks = mark;
		rollNo = 1;
		
	}
	public Student(String name, int[] marks, int rollNo) {
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	public void display() {
		System.out.println("Name:"+name);
		System.out.print("marks:");
		for(int num:marks)
			System.out.print(num+" ");
		System.out.println();
		System.out.println("RollNo:"+rollNo);
	}
	
}

