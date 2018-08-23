package com.interfaces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;

public class BookIOImpl implements BookIO {
	
	public Book getBook() {
		//Scanner s = new Scanner(System.in);
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in)); 
		Book book = new Book();
		System.out.println("Book Isbn pls!");
		try {
		book.setIsbn(Integer.parseInt(s.readLine()));
		System.out.println("Whats it called again???");
		book.setName(s.readLine());
		//s.next();
		System.out.println("I wont take if its pricey");
		book.setPrice(Double.parseDouble(s.readLine()));
		System.out.println("Who Published it?");
		book.setPublication(s.readLine());
		}catch (Exception e) {
			// TODO: handle exception
		}
		//s.close();
		return book;
		
	}
	public void printBook(List<Book> books) { 
		if(books.size()!=0) {
			Iterator<Book> it = books.iterator();
			while(it.hasNext()) {
				Book data = it.next();
				System.out.println(data);
			}				
		}
		else System.out.println("No books to print");
		
	}
	public void printBook(Book book) {
		System.out.println(book);
	}

}
