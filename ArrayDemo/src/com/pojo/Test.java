package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student dd = new Student();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Name_");
		
		String name = s.next();
		
		System.out.println("no. of subjects");
		
		int n = s.nextInt();
		int[] marks;
		marks = new int[n];
		System.out.println("pass Marks");
		for(int i = 0; i < n; i++)
			marks[i] = s.nextInt();		
		
		System.out.println("RollNo Pls");
		
		int rollNo = s.nextInt();
		
		Student nn = new Student(name, marks, rollNo);
		
		dd.display();
		nn.display();

	}

}
