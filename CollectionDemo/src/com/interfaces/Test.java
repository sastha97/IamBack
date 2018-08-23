package com.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.beans.Book;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookIOImpl b1 = new BookIOImpl();
		BookOperationsImpl b2 = new BookOperationsImpl();
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("How many books can you read?");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			b2.addBook(b1.getBook());
		}
		
		System.out.println("Id of book you want");
		Book dum = new Book();
		dum.setIsbn(s.nextInt());
		b1.printBook(b2.findBookById(dum));
		
		System.out.println("Name of book you want");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s1 = null;
		try {
			s1 = b.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(s1);
		b1.printBook(b2.findBooksByName(s1));
		

	}

}
